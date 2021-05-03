package com.practice.doubts;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02_Copy {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(); // list of object
		list1.add(5);
		list1.add(3);
		list1.add(55);
		ArrayList list2 = new ArrayList(); // list of object
		list2.add("java");
		list2.add("html");
//		list2.add("python");
//		list2.add("javascript");
//		list2.add(".net");
		
		Collections.copy(list1, list2);
		System.out.println(list1);
		System.out.println(list2);
	}
}
