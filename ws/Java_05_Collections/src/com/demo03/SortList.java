package com.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("two");
		list.add("four");
		list.add("one");
		list.add("three");
		list.add("seven");
		
		Collections.sort(list);
		System.out.println(list);
	}
}
