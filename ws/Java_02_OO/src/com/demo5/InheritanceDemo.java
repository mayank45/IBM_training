package com.demo5;

class ParentA{
	ParentA(){
		System.out.println("in parent A");
	}
}
class ParentB{
	ParentB(){
		System.out.println("in parent B");
	}
}
class Child extends ParentA{}


public class InheritanceDemo {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
