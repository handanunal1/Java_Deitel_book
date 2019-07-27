/**
 * Exercise 18.14 Palindrome
 * 
 * Author: Handan Unal  
 *
 *
 */
package chapter18.exercises.e14;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write down the text for palindrom-test");
		String text = scanner.nextLine();
		int first = 0;
		boolean result = testPalindrome(text, text.length(), first);
		System.out.println("Is text palindrome? " + result);
	}

	public static boolean testPalindrome(String params, int size, int first) {
		if (params.charAt(size - 1) == params.charAt(first)) {
			if (size - 1 == first || first == size - 2) {
				return true;
			} else {
				return testPalindrome(params, size - 1, first + 1);
			}
		} else {
			return false;
		}

	}

}
