package com.demo;

import java.util.Scanner;

import com.demo.controller.UserController;
import com.demo.model.User;

public class RunApp {
	public static void main(String[] args) {
		UserController uc = new UserController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your email:");
		String email = scanner.nextLine();
		System.out.println("Enter your passwrod:");
		String password = scanner.nextLine();
		
		boolean isValidUser = uc.login(new User(email, password));
		System.out.println("Isvalid: "+isValidUser);
	}
}
