package com.demo;

public class StringDemo01 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");

		if (a == b) {
			System.out.println("Same ");
		}
		
		if (a == c) {
			System.out.println("Same ");
		} else {
			System.out.println("Not Same");
		}

	}

}
