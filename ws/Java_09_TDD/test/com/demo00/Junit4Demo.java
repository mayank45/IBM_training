package com.demo00;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Junit4Demo {
	String name = null;
	
	public Junit4Demo(){
		System.out.println("Constructor");
	}
	@Before // before each testcase
	public void beforeEachTestCase1(){
		System.out.println("before each test case 1");
		name = "abc";
	}
	@Before
	public void beforeEachTestCase4(){
		System.out.println("before each test case 4");
	}
	@Before
	public void beforeEachTestCase3(){
		System.out.println("before each test case 3");
	}
	@Before
	public void beforeEachTestCase2(){
		System.out.println("before each test case 2");
	}
	
	@After
	public void afterEachTestCase(){
		System.out.println("after each test case");
	}
	

	@Test
	public void lksdhfsdjhfdsjfg(){
		System.out.println("some method_1 in Test class");
	}

	@Test
	public void myTestMethod(){
		System.out.println("some method_2 in Test class");
	}

	@Test
	public void methodTesting(){
		System.out.println("some method_3 in Test class");
	}

	@Ignore
	@Test
	public void testCode(){
		System.out.println("some method_4 in Test class");
	}
	
}
