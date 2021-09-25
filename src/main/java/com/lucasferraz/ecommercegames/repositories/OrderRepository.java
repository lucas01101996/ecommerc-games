package com.lucasferraz.ecommercegames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasferraz.ecommercegames.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
