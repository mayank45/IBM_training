package com.demo;

class Rectangle {
	int h;
	int w;

	Rectangle() {
		this(1);
	}
	
	Rectangle(int h) {
		this(h, h);
	}
	
	Rectangle(int h, int w) {
		// construct
		if (h > 0) {
			this.h = h;
		} else {
			this.h = 1;
		}
		if (w > 0) {
			this.w = w;
		} else {
			this.w = 1;
		}
	}

	int area() {
		return h * w;
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(0, 7);
		System.out.println("Area: " + rectangle.area());

		
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Area: " + rectangle1.area());

		
		Rectangle square = new Rectangle(5);
		System.out.println("Square Area: " + square.area());

	}
}
