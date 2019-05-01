/**
 *Exercises 14.5 -   RandomSentences
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e5;

import java.security.SecureRandom;

public class RandomSentences {

	public static void main(String[] args) {

		SecureRandom randomNumber = new SecureRandom();

		String[] article = { "the", "a", "one", "some", "any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] prepostion = { "to", "from", "over", "under", "on" };

		String sentence;
		String output;
		for (int i = 0; i < 20; i++) {
			sentence = "";
			output = "";
			sentence += article[randomNumber.nextInt(5)];
			sentence += " " + noun[randomNumber.nextInt(5)];
			sentence += " " + verb[randomNumber.nextInt(5)];
			sentence += " " + prepostion[randomNumber.nextInt(5)];
			sentence += " " + article[randomNumber.nextInt(5)];
			sentence += " " + noun[randomNumber.nextInt(5)];
			output = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
			output = output.concat(".");
			System.out.println(output);

		}

	}

}
