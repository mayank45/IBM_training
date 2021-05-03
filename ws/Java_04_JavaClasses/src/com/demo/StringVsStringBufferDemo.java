package com.demo;

import java.util.Arrays;

public class StringVsStringBufferDemo {

	public static void main(String[] args) {
		String name = "arun";
		StringBuffer sb = new StringBuffer("arun");
		
		System.out.println(name);
		System.out.println(sb.reverse());
		
		// "a", "b", "c", "d"
		
		String demo1 = "a".concat("b").concat("c").concat("d");
//		"ab".concat("c").concat("d");
//		"abc".concat("d");
//		"abcd"
		String demo2 = "a"+"b"+"c"+"d";
		
		System.out.println(demo1);
		System.out.println(demo2);
		
		
		String msg = "We,are,learning,java";
		System.out.println(msg.substring(0, 5));
		
		String[] strings = msg.split(",");
		System.out.println(Arrays.toString(strings));
		
	}
}
