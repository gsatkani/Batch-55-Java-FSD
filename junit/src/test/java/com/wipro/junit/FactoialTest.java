package com.wipro.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class FactoialTest {
	Factorial factorial;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before All test method  / will executed only once");  	}
	@Before
	public void setUp() {
		System.out.println("Execute Before Each Test Method");
		factorial = new Factorial();  	}
	@Test // Information to compiler -> Test Case file
	public void testAddtion() {
		System.out.println("Test1");
		int result = factorial.addition(10, 10);
		assertEquals(20, result);
		assertEquals(50, factorial.addition(25, 25));
		assertEquals(-100, factorial.addition(100, -200));  	}
	@Test
	public void factorialForPostiveNumbers() {
		System.out.println("Test2");
		assertEquals(120, factorial.calculateFactorial(5)); 	}
	@Test
	public void factorialForNegativeNumbers() {
		System.out.println("Test3");
		assertEquals(-1, factorial.calculateFactorial(-10)); 	}
	@Test
	public void factorialForZeroAndOne() {
		System.out.println("Test4");
		assertEquals(1, factorial.calculateFactorial(0));
		assertEquals(1, factorial.calculateFactorial(1)); 	}
	@After
	public void tearDoen() {
		factorial = null;
		System.out.println("Executed After each Test Method");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After All test method  / will executed only once");
	}

}
