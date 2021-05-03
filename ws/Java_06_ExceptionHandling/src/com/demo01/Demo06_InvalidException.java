package com.demo01;

public class Demo06_InvalidException extends Exception {

	Demo06_InvalidException(){
		super();
	}
	Demo06_InvalidException(String message){
		super(message);
	}
	Demo06_InvalidException(Exception e){
		super(e);
	}
	Demo06_InvalidException(String message, Exception e){
		super(message, e);
	}
	
}
