/**
 * Exercise 18.03 Factorial
 * 
 * Author: Handan Unal
 * 
 */
package chapter18.figures.f03;

public class FactorialCalculator {

	public static void main(String[] args) {

		for (int i = 0; i <= 21; i++) {
			System.out.println("Number: " + i + " -> "+ i+"!: " + Factorial(i));
		}

	}

	public static long Factorial(long number) {

		if (number <= 1)
			return 1;

		else
			return number * Factorial(number - 1);

	}

}
