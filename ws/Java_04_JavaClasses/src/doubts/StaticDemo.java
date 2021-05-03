package doubts;

class Printer{
	static int a;
	
	static void print(String text){
		System.out.println(a);
		System.out.println("Printing: "+text);
	}
	
	
}

public class StaticDemo {

	public static void main(String[] args) {
//		Printer p1 = new Printer();
		Printer.print("some text1");
		
//		Printer p2 = new Printer();
		Printer.print("some text2");
		
		
	}
}
