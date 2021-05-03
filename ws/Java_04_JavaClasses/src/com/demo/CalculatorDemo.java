package com.demo;

class Calculator{
	// add method(s) to add
	
	// var-args
//	int add(int[] nums) {
//		return 0;
//	}
	
	// array
	int add(int... nums) {
		return 0;
	}
	
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(2,4));
		System.out.println(cal.add(2,4,9));
		System.out.println(cal.add(2,4,6,7));
		System.out.println(cal.add(2,4,3,6,9));
		System.out.println(cal.add(2));
		System.out.println(cal.add(2,4,2,1,4,7,8,9));
		
		int[] arr = {1,2,3};
		System.out.println(cal.add(arr));
		
		System.out.println(cal.add());
		
		
	}
}
