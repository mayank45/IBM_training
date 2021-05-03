package com.demo04;

//final 
//class Calculator{
//	int add(int a, int b) {
//		// logic slow
//		return 0;
//	}
//}
//
//class SciCalculator extends Calculator{
//	
//	int add(int a, int b) {
//		// faster code
//		return 0;
//	}
//	
//	int findRoot(int a){
//		return 0;
//	}
//}

public class FinalDemo {
	final int a;
	
	FinalDemo(int a){
		this.a = a;
	}
	
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo(9);
	}

}
