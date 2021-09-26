package com.lucasferraz.ecommercegames.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasferraz.ecommercegames.DTO.OrderDTO;
import com.lucasferraz.ecommercegames.entities.Order;
import com.lucasferraz.ecommercegames.repositories.OrderRepository;
import com.lucasferraz.ecommercegames.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public OrderDTO findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		Order entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
		return new OrderDTO(entity, entity.getProducts());
	}

}
