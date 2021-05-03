package com.demo01;

class Greeting{
	String greet(String name){
		try {
			return "Welcome "+((name.charAt(0)+"").toUpperCase()+(name.substring(1)).toLowerCase());
//			throw new NullPointerException();
		} catch(NullPointerException e) {
			// message 1
			System.out.println("name is not given. Provide a valid name");
		} catch(StringIndexOutOfBoundsException e) {
			// message 2
			System.out.println("name is empty");
		} catch(Exception e) {
			// some other exception raised
			System.out.println("some problem occurred");
		}
		return "Welcome User";
	}
}

public class Demo04_HandlingMultipleExceptions {
	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		String name = new String();
		name = "";  // StringIndexOutOfBoundsException
//		name = null;  // NullPointerException
//		name = "jAvA";
		
		System.out.println(greeting.greet(name));
	}
}
