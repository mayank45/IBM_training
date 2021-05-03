class Book{
	String title;
	public boolean equals(Object o){
		if(o instanceof Book){
			Book book = (Book) o;
			if(book.title.equals(title)){
				return true;
			}
		}
		return false;
	}
}
class Student{
	Book book;
	String name;
	public boolean equals(Object o){
		if(o instanceof Student){
			Student std = (Student) o;
			if(std.book.equals(book) && std.name.equals(name)){
				return true;
			}
		}
		return false;
	} 
}
public class EqualsDemo{
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.name = "mark";
		s1.book = new Book(); // Book@a3b56
		// s1.book.title = "Java in 21 days";

		s2.name = "mark";
		s2.book = new Book(); // Book@d43ca1
		// s2.book.title = "Java in 21 days";

		System.out.println(s1.equals(s2));
	}
}