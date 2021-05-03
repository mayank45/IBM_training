package com.practice;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class PracticeDemo {
	
	public int findUnpaired(int[] A){
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int a : A) {
			if(set.contains(a)) {
				// pair
				set.remove(a);
			} else {
				set.add(a);
			}
		}
		
		for(int a : set) {
			return a;
		}
		
		
		return 0;
	}
	
	public int[] rotate(int[] A, int K){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int a: A) {
			list.add(a);
		}
		
		for(int i=0;i<K;i++)
		list.addFirst(list.removeLast());
		
		int i = 0;
		for(int a:list) {
			A[i++] = a;
		}
		
		return A;
	}
	
	public static void main(String[] args) {
		PracticeDemo demo = new PracticeDemo();
//		int[] A = {1,2,3,4,5};
//		int K = 3;
//		System.out.println(Arrays.toString(demo.rotate(A, K)));
		
		int[] B = {2,6,2,1,6,2,1,2};
		System.out.println("Unpaired num: "+demo.findUnpaired(B));// 2
		
	}
}
