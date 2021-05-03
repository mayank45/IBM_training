package com.demo01;

class A{
	void method1() {
		System.out.println("method1 in A");
	}
	// overloading
	void method1(int a) {
		System.out.println("method1 in A with arg");
	}
	// overloading
	void method1(float a) {
		System.out.println("method1 in A with arg");
	}
	void method2() {
		System.out.println("method2 in A");
	}
}
class B extends A{
	@Override
	void method1() {
		System.out.println("method1 in B");
	}
	void method3() {
		System.out.println("method3 in B");
	}
	void someMoreFeatures() {
		System.out.println("more features");
	}
}

public class PolymorphismDemo {
	
	void method(A a) {// = new B()
		// print
	}
	
	public static void main(String[] args) {
		// polymorphism
//		A obj1 = new A();
		B obj2 = new B();
		obj2.method3();
		
//		DataType vaiableName = instance
		A obj3 = new B(); // -> up casting
		// methods available in A but overridden in B
		
		obj3.method1();// b
		obj3.method2();// a
		
		// way 1
		((B) obj3).method3();
		
		// way 2
		B obj4 = (B) obj3;	// down casting	
		obj4.method3(); // -----> b
		
		

	}
}
