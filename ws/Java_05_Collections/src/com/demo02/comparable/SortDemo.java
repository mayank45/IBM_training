package com.demo02.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student std) {
		// property to be used in logic
		
		// less than 0
		// zero
		// greater than 0
		
		return this.name.compareTo(std.name);
	}
	@Override
	public String toString() {
//		System.out.println("we are in student toString method for "+this.name);
//		return super.toString();
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class SortDemo {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Carl", 44));
		students.add(new Student("Mark", 33));
		students.add(new Student("Arnold", 55));
		students.add(new Student("Mark", 56));
		students.add(new Student("Carl", 33));
		
	
		Collections.sort(students); // sort based on names
		System.out.println(students);
		
//		Student s = new Student("Carl", 44);
//		System.out.println(s);// s.toString()
		
	}
	
}
