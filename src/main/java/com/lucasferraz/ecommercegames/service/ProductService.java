package com.lucasferraz.ecommercegames.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasferraz.ecommercegames.DTO.ProductDTO;
import com.lucasferraz.ecommercegames.entity.Product;
import com.lucasferraz.ecommercegames.repository.ProductRepository;
import com.lucasferraz.ecommercegames.service.exceptions.EntityNotFoundException;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public  List<ProductDTO> findAll(){
		List<Product> list = repository.findAll();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(() -> new EntityNotFoundException("Entidade não encontrada"));
		return new ProductDTO(entity);	
	}

	@Transactional
	public ProductDTO insert(ProductDTO dto) {
		Product entity = new Product();
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		entity.setScore(dto.getScore());
		entity.setImage(dto.getImage());
		entity = repository.save(entity);
		return new ProductDTO(entity);
	}

}
