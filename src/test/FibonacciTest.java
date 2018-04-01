package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import progression.Fibonacci;

public class FibonacciTest {

	@Test
	public void 배열의피보나치() {
		Fibonacci fi = new Fibonacci();
		int sum = fi.fibonacciArray();
		assertEquals(15, sum);
	}
	
	@Test
	public void 입력받은값의피보나치() {
		Fibonacci fi = new Fibonacci();
		int sum = fi.fibonacci(3);
		assertEquals(5, sum);
	}

}
