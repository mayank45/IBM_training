package com.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class Demo05_Generic {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("mark");
		names.add("arun");
		names.add("carl");
		names.add("tom");
		names.add("john");
		names.add("miley");
		names.add("virat");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
	}
}
