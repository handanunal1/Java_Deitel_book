/**
 *Exercises 14.4 -   ComparingPortionsOfString
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e4;

import java.util.Scanner;

public class ComparingPortionsOfString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings, first determine the length; ");
		int length = 10;
		int startingIndex = 5;

		System.out.println("Enter the first String:  ");

		String firstString = scanner.next();
		while (firstString.length() != length) {
			System.out.println("The length of first string is not " + length + " characters. Write again. ");
			firstString = scanner.next();
		}

		System.out.println("Enter the second String: ");
		String secondString = scanner.next();

		while (secondString.length() != length) {
			System.out.println("The length of second string is not " + length + " characters. Write again. ");
			secondString = scanner.next();
		}

		if (firstString.substring(startingIndex, length)
				.compareToIgnoreCase(secondString.substring(startingIndex, length)) == 0) {
			System.out.println("The string portions of " + firstString + " and " + secondString + " are equal.");
		} else {
			System.out.println("The string portions  of " + firstString + " and " + secondString + " are  unequal");
		}

	}

}
