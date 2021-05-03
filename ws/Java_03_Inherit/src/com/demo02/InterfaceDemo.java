package com.demo02;

class AdditionalFeature{}

interface B{}

interface Account {
	
	default void credit(int amount) {
		System.out.println("credit: "+amount);
	}
	default int checkBal() {
		System.out.println("checking balance");
		return 0;
	}
	int getRoi();
	
	abstract int debit(int amount);
}

class SavingsAccount extends AdditionalFeature implements Account, B{
	int roi = 3;
	int accBal = 5000;
	
	public int debit(int amount) {
		if(accBal - amount > 5000) {
			accBal -= amount;
			System.out.println("debiting: "+amount);
			return amount;
		} else {
			System.out.println("you do not have enough bal");
			return 0;
		}
	}

	@Override
	public int getRoi() {
		return this.roi;
	}
}
class CurrentAccount implements Account{
	int roi = 8;
	int accBal = 10000;

	public int debit(int amount) {
		if(accBal - amount > 8000) {
			accBal -= amount;
			System.out.println("debiting: "+amount);
			return amount;
		} else {
			System.out.println("you do not have enough bal");
			return 0;
		}
	}

	@Override
	public int getRoi() {
		return this.roi;
	}
}

class Branch{
	void manage(Account acc){// = new CurrentAccount(); -> polymorphism
		System.out.println("Manager says: Welcome to the branch");
		acc.checkBal();
		acc.debit(1000);
		acc.checkBal();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount();
		ca.credit(5000);

		Branch delhiBranch = new Branch();
		delhiBranch.manage(ca);
		
	}
}






