/**
 * Exercise 18.04 Big Integer
 * 
 * Author: Handan Unal
 * 
 */
package chapter18.figures.f04;
import java.lang.Math;
import java.util.Scanner;
import java.math.BigInteger;
public class BigIntegerFactorial {

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {
			System.out.println("Number: " + i + " -> "+ i+"!: " + Factorial(BigInteger.valueOf(i)));
		}

	}

	public static BigInteger Factorial( BigInteger  number) {

		if (number.compareTo(BigInteger.ONE) <= 0) // test base case
			return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1
			else // recursion step
			return number.multiply(
			Factorial(number.subtract(BigInteger.ONE)));

	}

}

	

	