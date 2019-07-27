/**
 * Exercise 18.05 Big Integer
 * 
 * Author: Handan Unal
 * 
 */
package chapter18.exercises.e24;

import java.math.BigInteger;

public class FibonacciCalculator {

	private static BigInteger TWO = BigInteger.valueOf(2);

	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i <= 20; i++) {
			System.out.println("Number: " + i + " Fibonacci ->" + Fibonacci((BigInteger.valueOf(i))));
		}
		System.out.println(System.currentTimeMillis());

	}

	public static BigInteger Fibonacci(BigInteger number) {

		if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
			return number;
		}

		return Fibonacci(number.subtract(BigInteger.ONE)).add(Fibonacci(number.subtract(TWO)));

	}
}
