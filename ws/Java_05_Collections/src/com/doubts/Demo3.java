package com.doubts;

import java.util.ArrayList;

class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i=0;i<10;i++) {
			students.add(new Student("name"+i, (int)(Math.random()*100)));
		}
		
		System.out.println(students);
	}
}
