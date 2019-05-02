/**
 *Exercises 14.14 -   TokenizingComparingString2
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e14;

import java.util.Scanner;

public class TokenizingComparingString {

	public static void main(String[] args) {
		System.out.println("Please give an input string: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String []arrayString = input.split(" ");
		System.out.println("Prints only the words ends with \"ED\" ; ");
		System.out.println();
		for (String token :arrayString) {
			String  ss= token.substring(token.length()-2,token.length());
			if(token.substring(token.length()-2,token.length()).toUpperCase().equals("ED")) {
				System.out.print(token+ " ");
			}
		}
	}

}
