/**
 *Exercises 14.10 -   UppercaseAndLowercase
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e10;

import java.util.Scanner;

public class UppercaseAndLowercase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Give the input for converting Uppercase / Lowercase: ");
		String input = scanner.nextLine();
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
	}

}
