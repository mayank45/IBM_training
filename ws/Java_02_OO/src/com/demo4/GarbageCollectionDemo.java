package com.demo4;

final class Demo{}

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		while(true) {
			String name = "demo";
			name += name + name + name + name + name + name + name;
			System.out.println(name); // logger
		}
	}
}
