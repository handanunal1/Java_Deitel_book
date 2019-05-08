/**
 *Exercises 14.18 -  TextAnalysis 
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e18;

import java.util.Scanner;

public class TextAnalysis {

	public static void main(String[] args) {
		System.out.println("Please give an input sentence; ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int ascii = 0;
		char character;
		int[] arrayLetters = new int[26];
		for (int i = 0; i < text.length(); i++) {

			character = text.charAt(i);
			ascii = (int) character;
			if (ascii >= 97) {
				arrayLetters[ascii - 97]++;
			}

		}

		System.out.println("The statistics of letter used in the sentence above; ");

		for (int i = 0; i < arrayLetters.length; i++) {

			if (arrayLetters[i] > 0) {
				character = (char) (i + 97);
				System.out.println(character + " is used " + arrayLetters[i] + "times");
			}

		}

		scanner.close();

	}

}
