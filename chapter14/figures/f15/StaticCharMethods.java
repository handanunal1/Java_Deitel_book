/**
 *Figures 14.15 -   StaticCharMethods 
 * 
 * Author: Handan Unal
 * 
 */
package figures.f15;

import java.util.Scanner;

public class StaticCharMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character and press Enter");
		String input = scanner.next();
		char c = input.charAt(0);

		System.out.printf("is defined: %b%n", Character.isDefined(c));
		System.out.printf("is digit: %b%n", Character.isDigit(c));
		System.out.printf("is letter: %b%n", Character.isLetter(c));
		System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
		System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
		System.out.printf("to upper case: %b%n", Character.toUpperCase(c));
		System.out.printf("to lower case: %b%n", Character.toLowerCase(c));
	}

}
