package com.demo01;

import java.util.ArrayList;
import java.util.List;

public class Demo04_GenericsType {

	public static void main(String[] args) {
		ArrayList<Double> marksList = new ArrayList<Double>();
		marksList.add(220.0);
		marksList.add(400.0);
		marksList.add(339.0);
		
		// restriction
//		marksList.add(false);
//		marksList.add(55);
//		marksList.add("carl"); 
		
		for(double mark : marksList) {
			
//			int p = mark * 100 / 500 ; 
			double p = mark / 5.0 ; 
			
			System.out.println(p+"%");
		}
	}
}
