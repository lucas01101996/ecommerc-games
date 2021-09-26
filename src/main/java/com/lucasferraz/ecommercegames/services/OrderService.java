package com.lucasferraz.ecommercegames.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasferraz.ecommercegames.DTO.OrderDTO;
import com.lucasferraz.ecommercegames.entities.Order;
import com.lucasferraz.ecommercegames.repositories.OrderRepository;
import com.lucasferraz.ecommercegames.services.exceptions.DataBaseException;
import com.lucasferraz.ecommercegames.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	

	@Transactional(readOnly = true)
	public  Page<OrderDTO> findAllPaged(PageRequest pageRequest){
		Page<Order> list = repository.findAll(pageRequest);
		return list.map(x -> new OrderDTO(x));
	}
	
	@Transactional(readOnly = true)
	public OrderDTO findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		Order entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
		return new OrderDTO(entity, entity.getProducts());
	}
	
	@Transactional
	public OrderDTO insert(OrderDTO dto) {
		Order entity = new Order();
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());
		entity = repository.save(entity);
		return new OrderDTO(entity);
	}
	
	@Transactional
	public OrderDTO update(Long id, OrderDTO dto) {
		try {
			Order entity = repository.getOne(id);
			entity.setPrice(dto.getPrice());
			entity.setQuantity(dto.getQuantity());
			entity = repository.save(entity);
			return new OrderDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id não encontrado" + id);
		}
	}

	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id não encontrado" + id);
		}catch(DataIntegrityViolationException e) {
			throw new DataBaseException("Violação de integridade");
		}
	}


}
