package com.demo00;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.demo.Calculator;

public class TestCalculator {
	
	Calculator cal = null;
	
	@Before
	public void configureCal() {
		cal = new Calculator();
	}
	
	@Test
	public void shouldAddNumbers() {
//		Calculator cal = new Calculator();
		int a = cal.add(4, 7);
//		if(a == 11) {
//			System.out.println("working");
//		} else {
//			System.out.println("not working");
//		}
//		assertTrue(a==11);
		Assert.assertEquals(11, a);
	}
	
	@After
	public void afterTestcases() {
		cal = null;
	}
	
	@Test
	public void shouldAdd3Numbers() {
//		Calculator cal = new Calculator();
		int a = cal.add(4, 4, 7);
		Assert.assertEquals(15, a);
	}
}
