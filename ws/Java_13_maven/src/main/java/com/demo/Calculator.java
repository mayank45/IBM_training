package com.demo;

public class Calculator {
	static public int add(int... nums) {
		int result = 0;
		for(int num:nums)
			result += num;
		return result;
	}
}
