package com.demo;

class ComplexNumber{
	int realNum;
	int imgNum;
	ComplexNumber(){}
	ComplexNumber(int realNum, int imgNum){
		// local var -> realNum
		// instance var -> realNum
		
		this.realNum = realNum;
		this.imgNum = imgNum;
	}
	
	void add(ComplexNumber cn){
		System.out.println((this.realNum + cn.realNum)+"+"+(imgNum + cn.imgNum)+"i");
	}
}

public class ComplexNumberDemo {
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber();
		cn1.realNum = 3;
		cn1.imgNum = 6;
		ComplexNumber cn2 = new ComplexNumber(2,3);
		
		cn1.add(cn2);
	}
}
