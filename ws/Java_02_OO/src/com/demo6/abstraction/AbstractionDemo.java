package com.demo6.abstraction;

abstract class Bank {
	
	// .... private, protecte
	
	abstract public void withdraw(int amount);
	public void checkBal() {
		System.out.println("Checking bal");
	}
	abstract public void login();
	abstract public void openDematAccount();	
}

class BankVisitor extends Bank{
	public void withdraw(int amount){
		System.out.println(amount +" withdrawn");
	}
//	public void checkBal() {
//		System.out.println("Checking bal");
//	}
	public void login(){
//		System.out.println("Logging in");
		System.out.println("This feature is not available for visitors");
	}
	public void openDematAccount() {
		System.out.println("Open demat account");
	}
}

class MobileBanking extends Bank{
	public void withdraw(int amount){
//		System.out.println(amount +" withdrawn");
		System.out.println("This feature is not available for mobile users");
	}
//	public void checkBal() {
//		System.out.println("Checking bal");
//	}
	public void login(){
		System.out.println("Logging in");
	}
	public void openDematAccount() {
		System.out.println("Open demat account");
	}
}



public class AbstractionDemo {
	public static void main(String[] args) {
//		Bank visitor = new Bank();
//		BankVisitor visitor = new BankVisitor();
//		visitor.login();
//		visitor.withdraw(2000);
		MobileBanking mobileBanking = new MobileBanking();
		mobileBanking.login();
		mobileBanking.withdraw(2000);
		
		
		
	}
}