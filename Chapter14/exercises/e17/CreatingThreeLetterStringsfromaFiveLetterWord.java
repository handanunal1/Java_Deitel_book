package exercises.e17;

import java.security.SecureRandom;

public class CreatingThreeLetterStringsfromaFiveLetterWord {

	public static void main(String[] args) {
		String fiveInput = "bathe";
		produceNewWord(fiveInput);
	}

	public static void produceNewWord(String string) {
		int random1 = 0;
		int random2 = 0;
		int random3 = 0;

		SecureRandom random = new SecureRandom();
		random1 = random.nextInt(5);
		random2 = random.nextInt(5);
		random3 = random.nextInt(5);

		do {
			String newWord = string.charAt(random1) + "" + string.charAt(random2) + string.charAt(random3);
			System.out.println("The new word derived from "+ string+ " is: "+ newWord);
			random1 = random.nextInt(5);
			random2 = random.nextInt(5);
			random3 = random.nextInt(5);
		} while (random1 != random2 && random2 != random3 && random3 != random1);
	}

}
