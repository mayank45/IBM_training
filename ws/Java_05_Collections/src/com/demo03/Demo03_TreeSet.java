package com.demo03;

import java.util.Set;
import java.util.TreeSet;

public class Demo03_TreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		set.add("one");
		set.add("seven");
		set.add("two");
		set.add("one");
		set.add("seven");
		set.add("three");	
		
		System.out.println(set);
	}
}
