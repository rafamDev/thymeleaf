package com.thymeleaf.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.thymeleaf.st.model.Product;

@Controller
public class MainController {

	 @GetMapping({"/","/index"})
	 public String welcome(){
		 return "index";
	 }
	 
	 @PostMapping("/createBall")
	 public String createBall(@ModelAttribute("product") Product product, Model model){
		 //model.addAttribute("product",product);
		 product.setId(new Long(2));
		 product.setImage("https://img.icons8.com/ios-glyphs/30/000000/baseball-ball.png");
		 System.out.println(product.toString());
		 return "table/list-product";
	 }

}
