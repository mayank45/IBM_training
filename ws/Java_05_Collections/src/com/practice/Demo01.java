package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo01 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // array of object
		
		list.add(33);
		list.add(55);
		list.add(22);
		
		
		System.out.println("Read list: 1");
		// forloop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Read list: 2");
		// enhanced for loop
		for(Object element:list) {
			System.out.println(element);
		}
		
		System.out.println("Read list: 3");
		// iterator
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("Add 99 as first element");
		list.add(0, 99);
		
		System.out.println(list);
		
		System.out.println("Add 99 as last element");
		list.add(list.size(), 99);
		
		System.out.println(list);
		
		
		System.out.println("Element at index 3: "+list.get(3));
		System.out.println("Update 3rd element: "+list.set(2, 11));
		System.out.println(list);
		System.out.println("Remove 3rd element: "+list.remove(2));
		System.out.println(list);
		
		System.out.println("Search 98 in list: "+list.contains(22));
		
		Collections.sort(list);
		System.out.println("Sorted list: "+list);
		
		ArrayList list2 = new ArrayList(list);
		
		System.out.println("Second list: "+list2);
		
		list.add(100);
		ArrayList list3 = new ArrayList();
		list3.addAll(0, list);
		
		System.out.println("List3: "+list3);

	}

}
