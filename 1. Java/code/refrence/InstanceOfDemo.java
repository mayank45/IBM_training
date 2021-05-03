public class InstanceOfDemo{
	public static void main(String[] args) {
		String name = "arun";
		Book book = new Book();

		System.out.println("Book: " + (book instanceof Book));
		System.out.println("Object: " + (book instanceof Object));
		// System.out.println("Integer: " + (name instanceof Integer));
		// System.out.println("Book: " + (name instanceof Book));
		// System.out.println("Employee: " + (name instanceof Employee));
		// System.out.println("Exception: " + (name instanceof Exception));

	}
}