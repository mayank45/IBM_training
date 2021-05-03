package com.demo01;

class A{
	void demo() throws Exception{
		// raise exception
//		try {
		throw new Exception();
//		} catch(Exception e) {
//			System.out.println("some error occurred...");
//			throw new MyCustomException(e);
//		}
		
	}
}

public class Demo07_ThrowVsThrows {
	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.demo();
				} catch(Exception e) {
					System.out.println("some error occurred...");
				}
		
		System.out.println("Program ended");
		
	}
}
