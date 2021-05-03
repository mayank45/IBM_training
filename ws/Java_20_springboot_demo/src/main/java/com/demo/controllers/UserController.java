package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@GetMapping("")
	public String greet() {
		return "Welcome user";
	}
	
	@GetMapping("/{name}")
	public String greet2(@PathVariable String name) {
		return "Welcome "+name;
	}
	@GetMapping("/3/{name}")
	public String greet3(@PathVariable String name) {
		return "Welcome "+(name.charAt(0)+"").toUpperCase()+name.substring(1).toLowerCase();
	}
}
