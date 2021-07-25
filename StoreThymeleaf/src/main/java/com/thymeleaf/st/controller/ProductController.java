package com.thymeleaf.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.thymeleaf.st.service.ProductService;

@Controller
public class ProductController {

	 @Autowired
	 private ProductService productService;
	
	 @GetMapping("table/list-product")
	 public String setTable(Model model) {
		  model.addAttribute("products", productService.findAll()); 
	   return "table/list-product";
	 }
}
