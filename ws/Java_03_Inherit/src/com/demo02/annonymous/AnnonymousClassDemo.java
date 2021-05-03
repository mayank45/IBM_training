package com.demo02.annonymous;

interface A{
	void show();
}

class B implements A{

	public void show() {
		System.out.println("show method");
	}
	
}

public class AnnonymousClassDemo {
	public static void main(String[] args) {
		A a = new B();
		
		A a1 = new A() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
