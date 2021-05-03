package com.demo05;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter some text**");
		String next = scanner.nextLine();
		System.out.println(next);
		
		System.out.println("Enter you age");
//		String age_value = scanner.next();// "5"
//		int age = Integer.parseInt(age_value); // 5
//		System.out.println("Your age is: "+age_value);
//		System.out.println("Next year you will be: "+(age+1));
		
		int age = scanner.nextInt();
		System.out.println("Your age is: "+age);
		System.out.println("Next year you will be: "+(age+1));
		
		System.out.println("Application ended");
	}
}
