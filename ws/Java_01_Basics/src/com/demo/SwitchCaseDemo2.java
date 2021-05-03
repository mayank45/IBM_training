package com.demo;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		String direction = "west";
		
		switch(direction) {
			case "north":
				System.out.println("It is north direction");
				break;
			default:
				System.out.println("It is not north direction");
		}
	}
}
