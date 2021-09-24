package com.lucasferraz.ecommercegames.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double total;
	
	private Set<Product> products = new HashSet<>();
	
	
}
