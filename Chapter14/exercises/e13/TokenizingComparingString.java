/**
 *Exercises 14.13 -   TokenizingComparingString
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e13;

import java.util.Scanner;

public class TokenizingComparingString {

	public static void main(String[] args) {
		System.out.println("Please give an input string: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String []arrayString = input.split(" ");
		System.out.println("Prints only the words starting with 'B' ; ");
		System.out.println();
		for (String token :arrayString) {
			if(token.charAt(0) == 'B' || token.charAt(0) =='b') {
				System.out.print(token+ " ");
			}
		}
	}

}
