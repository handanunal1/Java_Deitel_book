package chapter16.exercises.e14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Exercises 16.18 WordTypeCount Counting Letters Author: Handan Unal
 * 
 */

public class WordTypeCount {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap();
		create(myMap);
		display(myMap);
	}

	private static void create(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String input = scanner.nextLine();

		for (int i= 0;i<input.length();i++) {

			

			if (map.containsKey(String.valueOf(input.charAt(i)))) {
				int count = map.get(String.valueOf(input.charAt(i)));
				map.put(String.valueOf(input.charAt(i)), count + 1);
			} else {
				map.put(String.valueOf(input.charAt(i)), 1);

			}

		}


	}

	private static void display(Map<String, Integer> map) {

		Set<String> keys = map.keySet();

		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.println("The map contains");

		for (String key : sortedKeys) {
			System.out.printf("%-10s%10s%n", key, map.get(key));
		}

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
	}

}
