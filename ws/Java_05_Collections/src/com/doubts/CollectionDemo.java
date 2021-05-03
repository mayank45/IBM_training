package com.doubts;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(50);
		arr.add("HI");
		arr.add("how r u");
		arr.add(false);
		arr.add(55);
		arr.add(null);

		System.out.println(arr);
		
		
		Collections.sort(arr);
		
	}

}