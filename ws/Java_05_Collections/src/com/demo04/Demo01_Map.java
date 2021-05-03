package com.demo04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Friend{
	String name;
	public Friend(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
}

public class Demo01_Map {
	public static void main(String[] args) {
		Map<String, Friend> map = new HashMap<String, Friend>();
		
		map.put("miley", new Friend("miley"));
		map.put("tom", new Friend("tom"));
		map.put("emily", new Friend("emily"));
		map.put("mark", new Friend("mark"));
		map.put("john", new Friend("john"));
		
//		System.out.println(map.get("tom"));
		
		Set<String> keySet = map.keySet();
//		Iterator<String> iterator = keySet.iterator();
		for(String key:keySet) {
			System.out.println(map.get(key));
		}
	}
}
