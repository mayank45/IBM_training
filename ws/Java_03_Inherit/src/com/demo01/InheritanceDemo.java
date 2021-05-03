package com.demo01;

abstract class Account {
	int roi = 5;
	int accBal = 10000;
	
	void credit(int amount) {
		System.out.println("credit: "+amount);
		accBal += amount;
	}
	int checkBal() {
		System.out.println("balance: "+accBal);
		return accBal;
	}
	int getRoi() {
		System.out.println("ROI is: "+roi);
		return roi;
	}
	
	abstract int debit(int amount);
}

class SavingsAccount extends Account {
	SavingsAccount(){
		super.roi = 3;
	}
	int debit(int amount) {
		if(accBal - amount > 5000) {
			accBal -= amount;
			System.out.println("debiting: "+amount);
			return amount;
		} else {
			System.out.println("you do not have enough bal");
			return 0;
		}
	}
	
	
	/*
void credit(int amount) {
		System.out.println("credit: "+amount);
		accBal += amount;
	}
	 */
}
class CurrentAccount extends Account{
	CurrentAccount(){
		super.roi = 8;
	}
	int debit(int amount) {
		if(accBal - amount > 8000) {
			accBal -= amount;
			System.out.println("debiting: "+amount);
			return amount;
		} else {
			System.out.println("you do not have enough bal");
			return 0;
		}
	}
	/*
void credit(int amount) {
		System.out.println("credit: "+amount);
		accBal += amount;
	}
	 */
}

class Branch{
//	void manage(SavingsAccount sa){
//		System.out.println("Manager says: Welcome to the branch");
//		sa.checkBal();
//	}
//	void manage(CurrentAccount ca){
//		System.out.println("Manager says: Welcome to the branch");
//		ca.checkBal();
//	}
	
	// parent type variable can hold/have child type instances
	void manage(Account acc){// = new CurrentAccount(); -> polymorphism
		System.out.println("Manager says: Welcome to the branch");
		acc.checkBal();
		acc.debit(1000);
		acc.checkBal();
	}
//	void manage(Loan loan){
//		// manage loan
//	}
	
}

public class InheritanceDemo {
	public static void main(String[] args) {
		
//		Account a = new Account();
		
		SavingsAccount sa1 = new SavingsAccount();
		SavingsAccount sa2 = new SavingsAccount();
//		sa1.debit(1000);
//		sa1.debit(5000);
//		sa1.checkBal();
		
		CurrentAccount ca = new CurrentAccount();
		ca.credit(5000);
		
		
		Branch delhiBranch = new Branch();
//		delhiBranch.manage(sa2);
		delhiBranch.manage(ca);
		
	}
}





