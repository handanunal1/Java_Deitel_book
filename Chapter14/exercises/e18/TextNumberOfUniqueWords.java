/**
 *Exercises 14.18 -  TextNumberOfUniqueWords
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e18;

import java.util.Scanner;

public class TextNumberOfUniqueWords {

	public static void main(String[] args) {

		System.out.println("Please give an input sentence: ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String array[] = text.split(" ");
		int numberOfWords = 0;
		int index = 0;
		for (String token : array) {
			index++;
			numberOfWords = 1;
			for (int i = index; i < array.length; i++) {
				if (token.toLowerCase().equals(array[i].toLowerCase()) && array[i] != "") {
					array[i] = "";
					numberOfWords++;
				}

			}

			if (!token.equals("")) {
				System.out.println("The word " + token + " is seen " + numberOfWords + "times");
			}
		}

	}

}
