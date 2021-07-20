package com.thymeleaf.hw.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.thymeleaf.hw.model.Product;

@Service
public class ProductService implements ProductServiceInterface {

	@Override
	public Product getProduct() {
	   Product product = new Product();
		  product.setName("Euro cup ball");
		  product.setDescription("Ball for playing football");
		  product.setNumberVotes(234);
		  product.setPrice(25.45f);
		  product.setSatisfactionPercentage(94.5f);
	   return product;  
	}

	@Override
	public List<Product> getList() {
		return generateList();
	}
	
	@Override
	public Map<Product, Integer> getMap() {
	  Map<Product,Integer> map = new HashMap<>();
		for(int i = 0; i < generateList().size(); i++) {
			 map.put(generateList().get(i), i+1);
		}
	  return map;
	}
	
	private List<Product> generateList() {
		Product product1 = new Product();
		  product1.setName("World cup ball");
		  product1.setDescription("Ball for playing football");
		  product1.setNumberVotes(288);
		  product1.setPrice(30.00f);
		  product1.setSatisfactionPercentage(90f);
	    Product product2 = new Product();
		  product2.setName("Champions cup ball");
		  product2.setDescription("Ball for playing football");
		  product2.setNumberVotes(345);
		  product2.setPrice(15.25f);
		  product2.setSatisfactionPercentage(85f);
	  return Arrays.asList(product1,product2);
   }

	
	
}
