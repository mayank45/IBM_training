package com.demo.controller;

import com.demo.model.User;

public class UserController {
	public boolean login(User user){
		// service.login
		return user.getEmail().equals(user.getPassword());
	}
}
