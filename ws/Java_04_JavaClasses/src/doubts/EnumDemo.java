package doubts;

enum State {
	PUBJAB, BANGALORE, PUNE
}

enum Payment {
	PAYTM, ONLINEBANKING, MOBILE, UPI
}

enum Tutorial {
	JAVA, HTML, NODE, CSS, SPRING, JUNIT
}

class Trainer {
	String name;
	Tutorial tutorial;
}

public class EnumDemo {
	public static void main(String[] args) {
		Trainer t = new Trainer();

		t.name = "arun";
		t.tutorial = Tutorial.JAVA;

		Trainer t2 = new Trainer();

		t2.tutorial = Tutorial.JAVA;

		if (t.tutorial == t2.tutorial) {
			System.out.println("same language");
//			System.exit(0);
		} else {
			System.out.println("Not same");
		}
		System.out.println("End");
		
		
//		System.out.println("press M for male and F for female");
//		// 1-2
//		if(1) {
//			gender = Gender.Male
//		}
	}
}
