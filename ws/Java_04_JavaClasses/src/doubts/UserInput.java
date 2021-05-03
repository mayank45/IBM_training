package doubts;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// press 1 to read java
		// press 2 to read html
		// press 3 to read python
		// press 9 to exit
		// otherwise ask again
		
		
		int choice = 0;
//		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			if(choice == 1) {
				System.out.println("it is java tutorial");
			} else if(choice == 2) {
				System.out.println("it is html tutorial");
			} else if(choice == 3) {
				System.out.println("it is python tutorial");
			}
//		} while(choice != 9);
		
		
	}
}
