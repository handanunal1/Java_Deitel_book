/**
 *Exercises 14.7 -   PigLatin
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e7;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the phrase to turn into \"Pig Latin\" format");
		String phrase = scanner.nextLine();
		printLatinWord(phrase);

	}

	public static void printLatinWord(String phrase) {

		String array[] = phrase.split(" ");
        String token;
		System.out.println(" ");
		for(String word :array) {
			token = word.substring(1,word.length())+(word.toLowerCase()).charAt(0)+"ay";
			System.out.print(token +" ");
				
		}
		
		
	}
}
