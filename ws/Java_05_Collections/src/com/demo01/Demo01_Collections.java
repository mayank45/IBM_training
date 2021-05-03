package com.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01_Collections {
	public static void main(String[] args) {
		
		Object[] objs = new Object[10];
		objs[5] = new String("some val");
		objs[9] = true;
		
//		objs[15] = 55;
		
		System.out.println(Arrays.toString(objs));
		
		ArrayList c = new ArrayList();
		
		// add
		// size
		// get
		
		for(int i=0;i<100;i++) {
			c.add(154);
			c.add(new String("some text"));
			c.add(false);
			}
		// 300
		for(int i=0;i<100;i++) {
			
//			c.remove(i);
			}
			// 200
		System.out.println(c);
		
		System.out.println("Elements in collection: "+c.size());
		System.out.println(c.get(5));

//		String s = new String("abc");
//		System.out.println(s.charAt(5));
	}
}
