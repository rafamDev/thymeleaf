package com.thymeleaf.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/store"})
public class MainController {

	 @RequestMapping("")
	 public String welcome(){
		 return "index";
	 }

}
