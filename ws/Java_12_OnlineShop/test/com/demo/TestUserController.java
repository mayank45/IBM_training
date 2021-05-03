package com.demo;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.demo.controller.UserController;
import com.demo.model.User;

public class TestUserController {

	@Test
	public void shouldNotLogin() {
		UserController uc = new UserController();
		Scanner scanner = new Scanner(System.in);
		
		String email = "demo@gmail.com";
		String password = "demo@123";
		
		boolean isValidUser = uc.login(new User(email, password));
		Assert.assertFalse(isValidUser);
	}
	@Test
	public void shouldGetLogin() {
		UserController uc = new UserController();
//		Scanner scanner = new Scanner(System.in);
		
		String email = "demo@gmail.com";
		String password = "demo@gmail.com";
		
		boolean isValidUser = uc.login(new User(email, password));
		Assert.assertTrue(isValidUser);
	}
	@Test
	public void shouldRaiseException() {
		UserController uc = new UserController();
		
		Assertions.assertThrows(NullPointerException.class, ()->{uc.login(null);});
	}
}
