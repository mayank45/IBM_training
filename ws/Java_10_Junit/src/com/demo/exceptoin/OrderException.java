package com.demo.exceptoin;

public class OrderException extends Exception {
	// new OrderException()
	// new OrderException("some error")
	// new OrderException(e)
	// new OrderException(e, "message")
	public OrderException(){
		super();
	}
	public OrderException(String message){
		super(message);
	}
	public OrderException(Throwable e){
		super(e);
	}
	public OrderException(String message, Throwable e){
		super(message, e);
	}
	
}
