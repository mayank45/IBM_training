package com.practice.doubts;

import java.util.ArrayList;

public class Demo01_Copy {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(); // list of object
		list1.add(5);
		list1.add(3);
		list1.add(55);
		ArrayList list2 = new ArrayList(); // list of object
		list2.add("java");
		list2.add("html");
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list2.addAll(1, list1);
		System.out.println(list2);// java, 5, 3, 55, java, html, html
		
		
		
	}
}
