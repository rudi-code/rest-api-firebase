package com.example.restfirebasedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;


@CrossOrigin
@Controller
@Tag(description = "home", name = "home")
public class HomeController {

	@GetMapping("/")
	String index() {
		return "redirect:/swagger-ui.html";		
	}
}
