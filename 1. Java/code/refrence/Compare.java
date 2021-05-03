class Person{
	String name;
}
public class Compare{
	public static void main(String[] args) {
		Person p1 = new Person(); // package.Person@a3c52f8
		Person p2 = new Person(); // package.Person@a3c52b1
		Person p3 = p1; // package.Person@a3c52f8

		int a = 55;
		int b = a;

		System.out.println(p1==p2); // false
		System.out.println(p1==p3); // true
		System.out.println(p2==p3); // false
		System.out.println(a==b);

		

	}
}