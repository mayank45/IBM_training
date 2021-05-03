package com.practice.Exception;

public class MovieNotFoundException extends Exception{
	public MovieNotFoundException(String message) {
		super(message);
	}
	
	public MovieNotFoundException(Exception e) {
		super(e);
	}
	
	public MovieNotFoundException(String m, Exception e) {
		super(m, e);
	}
}
