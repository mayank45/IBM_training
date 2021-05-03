package com.doubts;

abstract class Demo1{
	abstract void show();
}

interface Demo2{
	void print();
}

public class AnnonymousClassDemo implements Demo2 {
	
	public static void main(String[] args) {
//		Demo1 demo = new Demo1() {
//			void show() {
//				System.out.println("in demo1, show method");
//			}
//		};
//		demo.show();
		
		
		Demo2 demo2 = new AnnonymousClassDemo();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
