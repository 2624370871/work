package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator=new Calculator();
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		calculator.add(7);
		calculator.add(2);
		assertEquals(10,calculator.getResult());
	}

	@Test
	public void testSubstract() {
		
		calculator.substract(2);
		calculator.substract(6);
		assertEquals(5,calculator.getResult());
	}

	@Test
	public void testMultiply() {
		calculator.multiply(3);
		calculator.multiply(3);
		assertEquals(9,calculator.getResult());
	}

	@Test
	public void testDivide() {
		calculator.divide(2);
		calculator.divide(12);
		assertEquals(6,calculator.getResult());
	}

}
