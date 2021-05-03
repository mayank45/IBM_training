package com.demo01;

public class Demo03_GuardArea {
	
	static void demo() {
		String name = "arun";
		
		try {
			char firstChar = name.charAt(0); 
			
			// throw new NullPointerException();
			System.out.println("FirstChar is "+firstChar);	
		} catch(Exception e) { // = new NullPointerException() ;
//			System.out.println("Name is null");
		} finally {
			System.out.println("to remove connections");
		}
		
	}

	public static void main(String[] args) {
		Demo03_GuardArea.demo();
		
		System.out.println("End of the program");
	}
}
