package com.demo04;

class Student{
	String name;
	int age;
	
	static String teacher = "Mark";

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("Student[name: "+name+", age: "+age+", teacher: "+teacher+"]");
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		Student std1 = new Student("Ramesh", 22);
		Student std2 = new Student("Miley", 20);
		Student std3 = new Student("Mark", 23);
		Student std4 = new Student("Suresh", 21);
		
		std4.teacher = "Carl";
		
		std1.teacher = "Mahesh";
		Student.teacher = "Mohan";
		
		std1.show();// mahesh
		std2.show();// mahesh
		std3.show();// mahesh
		std4.show();// mahesh
		
		System.out.println(Student.teacher);
	}
}
