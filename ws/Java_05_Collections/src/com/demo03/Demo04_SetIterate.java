package com.demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo04_SetIterate {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("seven");
		set.add("one");
		set.add("two");
		set.add("three");

		// no index
		
		// enhanced for loop
		for(String s:set) {
			System.out.println(s);
		}
		
		// iterator
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}













