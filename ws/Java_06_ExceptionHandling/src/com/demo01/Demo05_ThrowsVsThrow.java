package com.demo01;

class Greetings {
	String greet(String name) throws InterruptedException {
//		try {
		Thread.sleep(5000);
//		} catch(Exception e) {
//			System.out.println("Thread inttrupted");
//		}

//		try {
		return "Welcome " + ((name.charAt(0) + "").toUpperCase() + (name.substring(1)).toLowerCase());
//		} catch(NullPointerException e) {
//			System.out.println("name is not given. Provide a valid name");
//		} catch(StringIndexOutOfBoundsException e) {
//			System.out.println("name is empty");
//		} catch(Exception e) {
//			System.out.println("some problem occurred");
//		}
//		return "Welcome User";
	}
}

public class Demo05_ThrowsVsThrow {
	public static void main(String[] args) {
		Greetings greeting = new Greetings();
		String name = new String();
		name = ""; // StringIndexOutOfBoundsException
//		name = null;  // NullPointerException
//		name = "jAvA";

		try {
			System.out.println(greeting.greet(name));
		} catch (NullPointerException e) {
			System.out.println("name is not given. Provide a valid name");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("name is empty");
		} catch (InterruptedException e) {
			System.out.println("Multiple threaded env is creating issue");
		} catch (Exception e) {
			System.out.println("some problem occurred");
		}
	}
}
