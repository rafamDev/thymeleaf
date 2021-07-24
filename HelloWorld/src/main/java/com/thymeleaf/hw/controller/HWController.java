package com.thymeleaf.hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import com.thymeleaf.hw.service.ProductServiceInterface;

@Controller
public class HWController {
   
	 @Autowired
	 private ProductServiceInterface productService;
	
	 @GetMapping({"/","/productsWelcome"})
	 public String welcome(@RequestParam(value="name",required=false,defaultValue="World")
	   String value, Model model) {
		  value = "<strong>MUNDO</strong>"; //utext para poder procesarlo en codigo html
		  model.addAttribute("name", value); 
	   return "index";
	 }
	 
	 @GetMapping({"/product/{id}"})
	 public String seeProduct(Model model){
		 model.addAttribute("product",productService.getProduct()); 
		 model.addAttribute("list",productService.getList()); 
		 model.addAttribute("mapCarrito",productService.getMap());
	   return "product";
	 }
	 
	
	 
}
