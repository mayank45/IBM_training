class Student{
	String name;
	int age;
}
public class RefrenceDemo{
	public static void main(String[] args){
		Student std = new Student();
		std.name = "arun";
		std.age = 44;

		System.out.println(std.name);	// arun
		System.out.println(std.age);	// 44
		System.out.println(std); // hd - ref num
	}
}