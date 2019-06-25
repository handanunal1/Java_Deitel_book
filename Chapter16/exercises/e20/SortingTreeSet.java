package chapter16.exercises.e20;

import java.util.Collections;
/**
 * Figures 16.20 SortingTreeSet
 * 
 * Author: Handan Unal
 * 
 */
import java.util.Scanner;
import java.util.TreeSet;

public class SortingTreeSet {

	public static void main(String[] args) {

		TreeSet<String> wordsTreeSet = new TreeSet<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write the words: ");
		String words = scanner.nextLine();

		String[] wordList = words.split(" ");

		for (String token : wordList) {
			wordsTreeSet.add(token);
		}

		System.out.println("Tree Set elements(naturally sorted): ");
		for (String token : wordsTreeSet) {
			System.out.print(token + " ");
		}

	}

}
