package com.example.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/dashboard")
	public String welcome(Model model) {
		System.out.println("===========================");
		model.addAttribute("greeting", "Welcome to Customer Self Web Portal!");
		model.addAttribute("tagline", "The one and only amazing web store");
		return "dashboard";
	}

}