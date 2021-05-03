package com.demo.service;

import com.demo.dto.User;

public class LoginService {

	public boolean login(User user) {
		// validation
		return user.getUserid()!=null && user.getUserid().equals(user.getPassword());
	}

}
