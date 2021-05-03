class Employee{
	String name;
	int age;
}
public class RefrenceDemo2 {
	public static void main(String[] args){
		Employee emp1 = new Employee();
		emp1.name = "arun";
		//emp1.name = new String("arun");
		System.out.println(emp1.name);	// arun

		Employee emp2 = emp1;
//		emp2.name = "mark";

		System.out.println(emp1.name);	// mark
		System.out.println(emp2.name);	// mark
		emp1.name = "carl";

		System.out.println(emp1);	// package.Employee@a2c4d12
		System.out.println(emp2);	// package.Employee@a2c4d12

		System.out.println(emp1 == emp2);	// true

		System.out.println(emp1.name);	// carl
		System.out.println(emp2.name);	// carl

	}
}