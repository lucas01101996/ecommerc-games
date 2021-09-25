package com.lucasferraz.ecommercegames.DTO;

import java.io.Serializable;
import java.math.BigDecimal;

import com.lucasferraz.ecommercegames.entities.Product;

public class ProductDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String name;
	public BigDecimal price;
	public short score;
	public String image;
	
	public ProductDTO() {
	}

	public ProductDTO(Long id, String name, BigDecimal price, short score, String image) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.score = score;
		this.image = image;
	}
	
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.score = entity.getScore();
		this.image = entity.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
