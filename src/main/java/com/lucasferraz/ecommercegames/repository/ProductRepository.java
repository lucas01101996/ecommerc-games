package com.lucasferraz.ecommercegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasferraz.ecommercegames.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
