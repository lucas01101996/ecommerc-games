package com.lucasferraz.ecommercegames.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasferraz.ecommercegames.entity.Product;
import com.lucasferraz.ecommercegames.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public  List<Product> findAll(){
		return repository.findAll();
	}

}
