package com.demo;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Junit5Usage {

	@Test
	public void testCase1() {
		Assert.assertTrue(true);
		System.out.println("test case 1");
	}
	@Test
	public void testCase2() {
		System.out.println("test case 2");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("before test cases");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("after test cases");
	}
	
	@BeforeAll
	public static void beforeAllTests() {
		System.out.println("before all");
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("after all");
	}
	
	
	@Disabled
	@Test
	public void demoskldfjs() {
		System.out.println("slkdfjslkdhfsdhfsdkhj");
	}
	
	@Test
	public void assertChain() {
		Assertions.assertAll(
				()->Assert.assertTrue(true),
				()->Assert.assertTrue(true),
				()->Assert.assertEquals("hello", "hello")
		);
	}
	
	@Test
	public void expectException() {
		Assertions.assertThrows(ArithmeticException.class, ()->Calculator.div(24, 0));
	}
}
