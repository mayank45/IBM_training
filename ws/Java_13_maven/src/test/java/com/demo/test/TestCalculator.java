package com.demo.test;

import org.junit.Assert;
import org.junit.Test;

import com.demo.Calculator;

public class TestCalculator {

	@Test
	public void shouldAdd5PositiveNums() {
		Calculator cal = new Calculator();
		int sum = cal.add(99,33,937,932);
		Assert.assertEquals(2001, sum);
	}
	@Test
	public void shouldAdd4NegativeAnd1PositiveNums() {
		Calculator cal = new Calculator();
		int sum = cal.add(-99,-33,-937,932);
		Assert.assertEquals(-137, sum);
	}
}
