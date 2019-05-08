/**
 *Exercises 14.18 -  TextNumberofWords
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e18;

import java.util.Scanner;

public class TextNumberofWords {

	public static void main(String[] args) {

		System.out.println("Please give an input sentence: ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String array[] = text.split(" ");
		int[] arrayLetterNumber = new int[100];
		for (String token : array) {
			arrayLetterNumber[token.length()]++;
		}

		System.out.println("The statistics for words by number of letters:  ");
		for (int i = 0; i < arrayLetterNumber.length; i++) {
			if (arrayLetterNumber[i] > 0) {
				System.out.println("Words with " + i + " letters are " + arrayLetterNumber[i]);
			}
		}

	}

}
