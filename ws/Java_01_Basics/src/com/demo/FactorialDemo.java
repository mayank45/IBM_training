package com.demo;

public class FactorialDemo {

	int fact(int n) {
		System.out.println("In fact method: "+n);
		if(n==0) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		FactorialDemo fd = new FactorialDemo();
		int result = fd.fact(5);
		
		System.out.println(result);
	}
	
}


