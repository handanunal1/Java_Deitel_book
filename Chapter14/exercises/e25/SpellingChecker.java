/**
 *Exercises 14.25 -   SpellingChecker
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SpellingChecker {

	public static void main(String[] args) throws FileNotFoundException {

		String[] myStringArray = new String[10000];
		int i = 0;
		File file = new File(
				"C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e25\\google-10000-english.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine() && i < 10000) {
			myStringArray[i] = sc.nextLine();
			i++;
		}
		sc.close();
		System.out.println("Please, write the word for spelling check: ");
		sc = new Scanner(System.in);
		sc.close();
		String input = sc.nextLine();

		for (String token : myStringArray) {
			if (token.trim().equals(input.toLowerCase())) {
				System.out.println("Word is spelled correctly.");
				return;
			}
		}
		System.out.println("Word is not spelled correctly.");
	}

}
