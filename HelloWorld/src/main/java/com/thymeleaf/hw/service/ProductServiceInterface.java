package com.thymeleaf.hw.service;

import java.util.List;
import java.util.Map;

import com.thymeleaf.hw.model.Product;

public interface ProductServiceInterface {

	public Product getProduct(); 
	
	public List<Product> getList();
	
	public Map<Product,Integer> getMap();
}
