package com.practice.Exception;

public class UserNotFoundException extends Exception{
	public UserNotFoundException(String message) {
		super(message);
	}
	
	public UserNotFoundException(Exception e) {
		super(e);
	}
}

