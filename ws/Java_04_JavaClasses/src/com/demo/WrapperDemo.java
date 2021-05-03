package com.demo;

public class WrapperDemo {

	void add(float a, float b) {
		System.out.println("float a, float b");
	}
	void add(Integer a, Integer b) {
		System.out.println("Integer a, Integer b");
	}

	public static void main(String[] args) {
		WrapperDemo wd = new WrapperDemo();
		
		int n1 = 33;
		int n2 = 11;
		
		Integer ni = new Integer(55);
		
		wd.add(n1, n2);
	}
}
