package com.demo02.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}


class SortByNameAscending implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s1.name);
	}
	
}
//class SortByNameDescendingimplements Comparator<Student>{}
//class SortByAgeAscendingimplements Comparator<Student>{}
//class SortByAgeDescendingimplements Comparator<Student>{}


public class SortDemo {

	public static void main2(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Carl", 44));
		students.add(new Student("Mark", 33));
		students.add(new Student("Arnold", 55));
		students.add(new Student("Mark", 56));
		students.add(new Student("Carl", 33));
		
		SortByNameAscending sortingOrder = new SortByNameAscending();
		Collections.sort(students, sortingOrder); // sort based on names
		System.out.println(students);
		
	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Carl", 44));
		students.add(new Student("Mark", 33));
		students.add(new Student("Arnold", 55));
		students.add(new Student("Mark", 56));
		students.add(new Student("Carl", 33));
		
		Comparator<Student> sortingOrder = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.name.equals(o2.name)) {
					return o1.age - o2.age;
				}
				return o1.name.compareTo(o2.name);
			}
		};
		
		Collections.sort(students, sortingOrder); // sort based on names
		System.out.println(students);
		
	}
	
}
