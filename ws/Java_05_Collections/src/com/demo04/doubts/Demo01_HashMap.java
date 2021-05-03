package com.demo04.doubts;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo01_HashMap {
	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		{null=null, 1=two, 2=one, 3=one, 4=two, 5=null}
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
//		{1=two, 2=one, 3=one, 4=two, 5=null, null=null}
		
		map.put(1, "one");
		map.put(2, "one");
		map.put(1, "two");
		map.put(3, "one");
		map.put(4, "two");
		map.put(5, null);
		map.put(null, "five");
		map.put(null, null);
		
		System.out.println(map);
	}
}
