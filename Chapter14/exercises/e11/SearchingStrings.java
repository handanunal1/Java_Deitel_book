/**
 *Exercises 14.11-  SearchingStrings 
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e11;

import java.util.Scanner;

public class SearchingStrings {

	public static void main(String[] args) {
		System.out.println("Please give an input string: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println("Give the character to be searched in the string: ");
		char charSearch = scanner.nextLine().charAt(0);

		int numberOfChar = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == charSearch) {
				numberOfChar++;
			}
		}

		System.out.println("The \"" + charSearch + "\" is found at the given string " + numberOfChar + " times. ");
	}

}
