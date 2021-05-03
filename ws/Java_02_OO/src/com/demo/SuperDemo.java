package com.demo;

class Shape {
	String color = "red";
	void draw() {
		System.out.println("Drawing shape: "+color);
	}
	void draw(String color){
		System.out.println("Drawing shape: "+color);
	}
}

class Circle extends Shape {
	String color = "green";
	void draw(){
		System.out.println("Drawing circle: "+color);
	}
	void draw(String color){
//		super();
		System.out.println("Local color: "+color);
		System.out.println("Instance color: "+this.color);
		System.out.println("Parent color: "+super.color);
//		System.out.println("Drawing circle: "+color);
		super.draw(color);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
//		Shape c = new Circle();
		c.draw("blue");
	}
}
