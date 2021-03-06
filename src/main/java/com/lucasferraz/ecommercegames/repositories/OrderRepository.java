package com.lucasferraz.ecommercegames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasferraz.ecommercegames.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
