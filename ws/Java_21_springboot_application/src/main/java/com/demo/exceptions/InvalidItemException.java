package com.demo.exceptions;

public class InvalidItemException extends Exception{
	public InvalidItemException() {
		super();
	}
	public InvalidItemException(String message) {
		super(message);
	}
	public InvalidItemException(Exception e) {
		super(e);
	}
	public InvalidItemException(String m, Exception e) {
		super(m, e);
	}
	
}
