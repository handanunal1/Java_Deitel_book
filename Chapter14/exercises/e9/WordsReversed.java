/**
 *Exercises 14.9 -    WordsReversed 
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e9;

import java.util.Scanner;

public class WordsReversed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write the sentence which will be reversed; ");

		String sentence = scanner.nextLine();
		reverseWord(sentence);

	}

	public static void reverseWord(String sentence) {

		String []sentenceArray = sentence.split(" ");
		String reverseArray ="";
		
		for(String token:sentenceArray) {
			reverseArray =token+" "+ reverseArray;
		}
		
		System.out.println(reverseArray);
	}

}
