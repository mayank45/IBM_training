package com.demo01;

import java.io.FileNotFoundException;

public class Demo02_CheckedVSUnchecked {

	public static void main(String[] args) {
		// raising exception
		String name = null;
		
//		name.charAt(5);
//		throw new StringIndexOutOfBoundsException();
//		throw new NullPointerException();
		
		
//		try {
		// Unchecked exception
		throw new ClassCastException();
//		} catch(Exception e) {
//			System.out.println("ex raised");
//		}
		
		
		// checked exception
//		try {
//			throw new FileNotFoundException();
//		} catch(Exception e) {
//			// ...
//		}
		
		
	}
}
