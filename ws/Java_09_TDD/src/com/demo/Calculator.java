package com.demo;

public class Calculator {

	public int add(int... i) {
		int sum = 0;
		for(int a : i) {
			sum += a;
		}
		return sum;
	}

}
