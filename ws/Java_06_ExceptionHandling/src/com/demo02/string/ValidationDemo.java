package com.demo02.string;

public class ValidationDemo {

	public static void main(String[] args) {
		// reg-exp -> 
//		testRegEx_1();
//		testRegEx_2();
//		testRegEx_3();
//		testPassword();
		testPassword1();
	}
	
	private static void testPassword1() {
		String pwdReg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{8,20}$";
		System.out.println("@".matches(pwdReg));
		System.out.println("_".matches(pwdReg));
		System.out.println("tom_mikE@a".matches(pwdReg));
		System.out.println("tommikE123".matches(pwdReg));
	}
	
	private static void testPassword() {
		String pwdReg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+_=])(?=\\S+$).{8,}$";
		System.out.println("tom_mikE@123".matches(pwdReg));
	}

	private static void testRegEx_3() {
		String emailReg = "[A-Za-z0-9_\\.]+[@][a-z]+[\\.]([a-z]{2,3})";
		System.out.println("demo.test_007@gmail.com".matches(emailReg));
		System.out.println("demo.test_007@y7mail.com".matches(emailReg));
		
		System.out.println("demo.test_007@gmail.coms".matches(emailReg));
	}

	private static void testRegEx_2() {
		String reg = "[A-Za-z0-9]+";
		System.out.println("A".matches(reg));
		System.out.println("E".matches(reg));
		System.out.println("k".matches(reg));

		System.out.println("9".matches(reg));
		System.out.println("ab".matches(reg));
		System.out.println("demo@gmail.com".matches(reg));
		System.out.println("Demo37".matches(reg));
	}

	static void testRegEx_1() {
		String regExp = "html|java";
		
		System.out.println("html".matches(regExp));
		System.out.println("java".matches(regExp));
		System.out.println("".matches(regExp));
		System.out.println("javascript".matches(regExp));
		System.out.println("html|java".matches(regExp));

	}
}
