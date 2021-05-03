package com.demo01.abstraction;

abstract class A{
	void demo0() {
		System.out.println("demo 0");
	}
	abstract void demo1();
	abstract void demo2();
	abstract void demo3();
}

class B extends A{
	void demo1() {
		System.out.println("demo 1");
	}

	@Override
	void demo2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void demo3() {
		// TODO Auto-generated method stub
		
	}
}

class C extends B{

	@Override
	void demo2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void demo3() {
		// TODO Auto-generated method stub
		
	}

}





public class AbstractDemo {

}