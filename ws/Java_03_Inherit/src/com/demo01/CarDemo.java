package com.demo01;

abstract class Car{
	abstract void burnFuel();
	abstract void accelerate();
	void changeGears() {
		System.out.println("changing gears");
	}
}

class Maruti800 extends Car{
	void burnFuel(){
		System.out.println("5%");
	}
	void accelerate() {
		System.out.println("speed+1");
	}
}
class Alto extends Car{
	void burnFuel(){
		System.out.println("6%");
	}
	void accelerate() {
		System.out.println("speed+2");
	}
}

class BMW extends Car{
	void burnFuel(){
		System.out.println("20%");
	}
	void accelerate() {
		System.out.println("speed * 2");
	}
	void changeGears() {
		System.out.println("changing gears to 5th");
	}

}


public class CarDemo {
	public static void main(String[] args) {
		Maruti800 mar = new Maruti800();
		mar.accelerate();
		
		BMW bmw = new BMW();
		bmw.accelerate();
		
		
	}
}
