package com.demo;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = (int) (Math.random()*100);
		}
		
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++) {
			nums[i]++;
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(int n:nums) {
			System.out.println(n);
		}
		
		
	}
}
