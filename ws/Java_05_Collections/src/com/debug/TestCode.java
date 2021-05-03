package com.debug;

class Greeting{
	void greet(String name) {
		System.out.println("Welcome "+capitalize(name));
	}
	
	static String capitalize(String name) {
		String fc = name.charAt(0)+"";
		String rs = name.substring(1);
		return fc.toUpperCase() + rs.toLowerCase();
	}
}

public class TestCode {

	public static void main(String[] args) {
//		Greeting g = new Greeting();
//		g.greet("maRK");// Welcome Mark
//		g.greet("");// Welcome ``
//		g.greet(null);
		
		int n = 5;
		
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
