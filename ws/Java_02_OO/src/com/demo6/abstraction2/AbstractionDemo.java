package com.demo6.abstraction2;

class Bank implements BankVisitor, MobileBanking, ATM, InternetBanking {

	public void anyOtherMethod() {
		System.out.println("any other method");
	}
	
	public void withdraw(int amount){
		System.out.println(amount +" withdrawn");
	}
	public void checkBal() {
		System.out.println("Checking bal");
	}
	
	public void openDematAccount() {
		System.out.println("Open demat account");
	}

	public void login(){
		System.out.println("Logging in");
	}

	@Override
	public void miniStatement() {
		System.out.println("Get mini statement");
	}
}

interface BankVisitor {
	void withdraw(int amount);
	void checkBal();
	void openDematAccount();
}

interface ATM {
	void withdraw(int amount);
	void checkBal();
	void miniStatement();
}

interface MobileBanking {
	void checkBal();
	void login();
}
interface InternetBanking {
	void checkBal();
	void login();
	void openDematAccount();
}


public class AbstractionDemo {
	public static void main(String[] args) {

//		Bank bankUser = new Bank();
//		bankUser.anyOtherMethod();
		
		 MobileBanking mobileBankingUser = new Bank();
//		 mobileBankingUser.anyOtherMethod();
//		 mobileBankingUser.withdraw();
		 mobileBankingUser.checkBal();
		 mobileBankingUser.login();
		 
		 InternetBanking internetBankingUser = new Bank();
		 internetBankingUser.login();
		 internetBankingUser.checkBal();
		 
		 ATM atmUser = new Bank();
		 atmUser.miniStatement();
//		 atmUser.ope
		
	}
}