package com.demo03;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo02_LinkedHashSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();

//		hashSet.add("Jyoti");
//		hashSet.add("Mark");
//		hashSet.add("Miley");
//		hashSet.add("Mark");
		
		set.add("seven");
		set.add("one");
		set.add("two");
		set.add("three");

		System.out.println(set);
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add("one".hashCode());
//		list.add("two".hashCode());
//		list.add("seven".hashCode());
//		list.add("three".hashCode());
//		
//		System.out.println(list);

	}

}
