class Person{
	String name;
	int age;
	String gender;

	public boolean equals(Object obj) {
		// name, age, gender -> fp
		// obj.name, obj.age, obj.gender -> sp

		if(obj instanceof Person){
			Person sp = (Person) obj;
			if(name.equals(sp.name) && age == sp.age && gender.equals(sp.gender)){
				return true;
			}
		}

		return false;
	}
}

public class Compare2 {
	public static void main(String[] args) {
		Person p1 = new Person(); // package.Person@a3c52f8
		p1.name = "mark";
		p1.age = 22;
		p1.gender = "male";

		Person p2 = new Person(); // package.Person@a3c52b1
		p2.name = "mark";
		p2.age = 22;
		p2.gender = "male";

		Person p3 = new Person(); // package.Person@a3c52b1

		System.out.println(p1==p2); // false
		System.out.println(p1.equals(p2)); // true
		// System.out.println(p3.equals(p2)); // true

		// String s1 = new String("Mark");
		// String s2 = new String("Mark");

		// System.out.println(s1==s2); // false
		// System.out.println(s1.equals(s2)); // true


		

	}
}