package chapter16.exercises.e19;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Figures 16.19 CopyingReversing
 * 
 * Author: Handan Unal
 * 
 */
public class PrimeNumbersFactors {

	public static void main(String[] args) {

		System.out.println("Please enter a number to check if it  is prime: ");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		HashSet<Integer> primeFactors = new HashSet<Integer>();

		int result = number;
		int divider = 2;

		while (result > divider) {
			if (result % divider == 0) {
				result = result / divider;
				primeFactors.add(divider);
			} else {
				divider = divider + 1;
				if (result == divider) {
					primeFactors.add(divider);
				}

			}

		}
		
		System.out.println("Prime factors for the "+number);
		for(Integer divide:primeFactors) {
			System.out.println(divide);
		}

	}

}
