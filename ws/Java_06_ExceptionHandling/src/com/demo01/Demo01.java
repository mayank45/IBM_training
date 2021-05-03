package com.demo01;

public class Demo01 {

	static void errorDemo() {
		errorDemo();
	}
	
	static void exceptionDemo(String name) {
		System.out.println("5th character is "+name.charAt(4));
	}
	
	
	public static void main(String[] args) {
		Demo01.errorDemo(); // StackOverflowError
		
		Demo01.exceptionDemo("arunkumar"); //StringIndexOutOfBoundsException
	}
}
