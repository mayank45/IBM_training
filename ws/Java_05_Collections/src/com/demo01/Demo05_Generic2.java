package com.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo05_Generic2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		String name = null;
		do {
			System.out.print("Enter a name: ");
			name = scanner.nextLine();
			names.add(name);
		} while(!name.equals("0"));
		names.remove(names.size()-1);

		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
	}
}
