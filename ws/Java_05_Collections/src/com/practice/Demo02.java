package com.practice;

public class Demo02 {
	public static void main(String[] args) {
		int a = 0;
		for(int i=0;i<100;i++) {
			if(i==30) {
				i = 0;
			}
			a++;
		}
		System.out.println("a: "+a);
	}
	

}
