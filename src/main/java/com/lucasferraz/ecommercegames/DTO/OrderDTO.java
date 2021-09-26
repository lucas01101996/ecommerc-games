package com.lucasferraz.ecommercegames.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.lucasferraz.ecommercegames.entities.Order;
import com.lucasferraz.ecommercegames.entities.Product;


public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double price;
	private Integer quantity;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO() {
	}
	
	public OrderDTO(Long id, Double price, Integer quantity) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public OrderDTO(Order entity) {
		this.id = entity.getId();
	}
	
	public OrderDTO(Order entity, List<Product> products) {
		this(entity);
		products.forEach(item -> this.products.add(new ProductDTO(item)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public List<ProductDTO> getProducts() {
		return products;
	}
	
	public double getSubTotal() {
		double sum = 0.00;
		
		for (ProductDTO productDTO : products) {
			sum += productDTO.price;
		}
	 
		return sum;
	}
	
	/*public double getTotal() {
		double sum = 0.00;
		for (ProductDTO product : products) {
			sum += 
		}
		return sum;
	}*/
	
	
	
	
}
