package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	// localhost:8080/application_name/rest/greet
	@GetMapping("/greet")
	public String greetUser() {
		System.out.println("in handler");
		return "Welcome User++++";
	}
	
	@GetMapping("/greet/{name}")
	public String greetUser2(@PathVariable String name) {
		System.out.println("in handler2");
		return "Welcome "+name;
	}
	
	@PostMapping("/login")
	public String login() {
		System.out.println("in login");
		return "login page";
	}
}


