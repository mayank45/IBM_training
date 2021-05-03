package com.demo02.problem;

import java.util.ArrayList;
import java.util.Collections;

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = this.age;
	}
}

public class Demo01_Sort {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Carl", 44));
		students.add(new Student("Mark", 33));
		students.add(new Student("Arnold", 55));
		
//		Collections.sort(student); // sort based on names
		System.out.println(students);
	}
	
}
