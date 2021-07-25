package com.thymeleaf.st.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
    private Long id;
	
	@Column
	private String image;
	
	@Column
	private String name;
	
	@Column
	private Float price;
	
    public Product() {}
    
    public Product(String name, Float price) {
		super();
		this.name = name;
		this.price = price;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", image=" + image + ", name=" + name + ", price=" + price + "]";
	}
    
    
	
}
