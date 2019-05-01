/**
 *Exercises 14.6 -   Limericks
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e6;

import java.security.SecureRandom;

public class Limericks {

	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();

		String[] first = { "A fellow jumped off a high ", "wall", "ball" };
		String[] second = { "And had a most terrible ", "fall", "call" };
		String[] third = { "He went back to ", "bed", "get" };
		String[] fourth = { "With a bump on his ", "head", "dead" };
		String[] fifth = { "That's why you don't jump off a ", "mall", "wall" };

		String sentence;
		for (int i = 0; i < 1; i++) {
			sentence = "";
			sentence = first[0] + first[1 + randomNumber.nextInt(2)];
			System.out.println(sentence);
			sentence = "";
			sentence = second[0] + second[1 + randomNumber.nextInt(2)];
			System.out.println(sentence);
			sentence = "";
			sentence = third[0] + third[1 + randomNumber.nextInt(2)];
			System.out.println(sentence);
			sentence = "";
			sentence = fourth[0] + fourth[1 + randomNumber.nextInt(2)];
			System.out.println(sentence);
			sentence = "";
			sentence = fifth[0] + fifth[1 + randomNumber.nextInt(2)];
			System.out.println(sentence);
			sentence = "";
		}

	}

}
