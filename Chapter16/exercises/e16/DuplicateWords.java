package chapter16.exercises.e16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Figures 16.18 Duplicate words
 * 
 * Author: Handan Unal
 * 
 */

public class DuplicateWords {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap();
		create(myMap);
		display(myMap);

		
	
	}

	private static void create(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String input = scanner.nextLine();

		String[] tokens = input.split(" ");

		for (String token : tokens) {

			String word = token.toLowerCase();

			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);

			}

		}

	}

	private static void display(Map<String, Integer> map) {

		Set<String> keys = map.keySet();

		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.println("The map contains the word which are duplicate");

		for (String key : sortedKeys) {
			if( map.get(key)>1) {
				System.out.printf("%-10s%10s%n", key, map.get(key));
			}
		}

		
	}

}
