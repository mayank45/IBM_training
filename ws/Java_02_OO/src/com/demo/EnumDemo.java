package com.demo;

class Person{
	String name;
	Gender gender;
	
	void showDetails() {
		System.out.println(this.name + " is " + this.gender);
	}
}

// TOSS -> head, tail
// Direction -> North, east, west, south

// machine -> stopped, running, paused
// USER -> admin, owner, customer, buyer, seller
enum Gender{
	MALE, FEMALE, OTHER
}

public class EnumDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ramesh";
		p1.gender = Gender.MALE; // male, female, other
		
		p1.showDetails();
		
	}
}
