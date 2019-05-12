/**
 *Exercises 14.22 -    MorseCode
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e22;

import java.util.Scanner;

public class MorseCode {
	static String[] english = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ".",
			"?" };

	static String[] morse = {" ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--",
			".-.-.-", "..--.." };

	public static void main(String[] args) {

		System.out.println("Please write an input sentence for translating in morse code: ");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		makeMorseCode(input);

	}

	public static void makeMorseCode(String input) {
		for (int i = 0; i < input.length(); i++) {
			char character = input.toLowerCase().charAt(i);

			for (int j = 0; j < english.length; j++) {
				if (character == english[j].charAt(0)) {
					System.out.print(morse[j]);
				} 
			}

		}
	}

}
