package com.demo01;

import java.util.ArrayList;
import java.util.List;

public class Demo03_ObjectType {

	public static void main(String[] args) {
		ArrayList marksList = new ArrayList();
		marksList.add(220.0);
		marksList.add(400.0);
		marksList.add(339.0);
		
		marksList.add("carl"); // no restriction
		
		for(Object mark : marksList) {
			
//			int p = mark * 100 / 500 ; 
			double m = (double) mark;
			double p = m / 5.0 ; 
			
			System.out.println(p+"%");
		}
	}
}
