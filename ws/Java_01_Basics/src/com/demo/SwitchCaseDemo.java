package com.demo;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int n = -1;
		
//		if(n < 3) {
//			if(n == 1) {
//				System.out.println("It is 'one'");
//			} else {
//				if(n == 2) {
//					System.out.println("It is 'two'");
//				}
//			}
//		} else {
//			System.out.println("Number must be less than 3");
//		}
		
		switch(n) {
			case 1:
				System.out.println("It is 'one'");
				break;
			case 2:
				System.out.println("It is 'two'");
				break;
			case 3:
				System.out.println("It is 'three'");
				break;
			case 4:
				System.out.println("It is 'four'");
				break;
			case -1:
				System.out.println("It is 'minus one'");
				break;
			default:
				System.out.println("It is invalid number");
		}
	}
}
