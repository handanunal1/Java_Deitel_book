/**
 * Exercise 18.09 Factorial Calc. Iterative
 * 
 * Author: Handan Unal
 * 
 */
package chapter18.figures.f09;

public class FactorialCalculator {

	public static void main(String[] args) {

		for (int counter = 0; counter <= 10; counter++)
			System.out.printf("%d! = %d%n", counter, Factorial(counter));

	}

	public static long Factorial(long number) {

		long result = 1;

		for (long i = result; i <= number; i++) {

			result = result * i;
		}

		return result;

	}

}
