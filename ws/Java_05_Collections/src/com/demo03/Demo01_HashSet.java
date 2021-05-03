package com.demo03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Demo{
	int age;
	Demo(){
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	
}

public class Demo01_HashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("seven");
		set.add("one");
		set.add("two");
		set.add("three");

		System.out.println(set);
		
	}
}
