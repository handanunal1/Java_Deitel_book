/**
 * Exercise 18.05 Big Integer
 * 
 * Author: Handan Unal
 * 
 */
package chapter18.figures.f05;

import java.math.BigInteger;

public class FibonacciCalculator {

	private static BigInteger TWO = BigInteger.valueOf(2);

	public static void main(String[] args) {


		for (int i = 0; i <= 20; i++) {
			System.out.println("Number: " + i +" Fibonacci ->" + Fibonacci((BigInteger.valueOf(i))));
		}
		
		
	}

	public static BigInteger Fibonacci(BigInteger number) {

		if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
			return number;
		}

		return Fibonacci(number.subtract(BigInteger.ONE)).add(Fibonacci(number.subtract(TWO)));

	}
}
