package com.admin.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// inject via application.properties
	@Value("${home.message}")
	private String message = "Hello World";
	
	@Value("${home.novo}")
	private String novo = "Novo";

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", this.message);
		return "home";
	}
	
	 @RequestMapping("/teste/{alguma_coisa}")
	 public String homeB(@PathVariable("alguma_coisa") String usu, Model model) {
	  model.addAttribute("message", usu);
	  return "home";
	 }
	
	@RequestMapping("/novo")
	public String novo(Map<String, Object> model) {
		model.put("novo", this.novo);
		return "home";
	}

}