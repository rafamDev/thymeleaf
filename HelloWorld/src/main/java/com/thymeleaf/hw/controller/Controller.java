package com.thymeleaf.hw.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thymeleaf.hw.model.Product;

@org.springframework.stereotype.Controller
public class Controller {
   
	 @GetMapping({"/", "/welcome"})
	 public String welcome(@RequestParam(name="name",required=false,defaultValue="World")
	   String name, Model model) {
		  name = "<strong>MUNDO</strong>";
		  model.addAttribute("name", name); 
	   return "index";
	 }
	 
	 @GetMapping({"/product/{id}"})
	 public String seeProduct(Model model){
		  Product product = new Product();
		  product.setName("Euro cup ball");
		  product.setDescription("Ball for playing football");
		  product.setNumberVotes(234);
		  product.setPrice(25.45f);
		  product.setSatisfactionPercentage(100f);
		  model.addAttribute("product",product); 
	   return "product";
	 }
	 
	 
}
