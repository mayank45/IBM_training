public class GarbageCollectionDemo {

	public static void main(String[] args) {
			String name = "demo";
		while(true) {
			name += name + name + name;
			System.out.println(name); // logger
			System.out.println("\n\n\n"); // logger

		}
	}
}