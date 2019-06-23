package chapter16.exercises.e13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Exercises e13: DuplicateElimination Write a program that reads in a series of
 * first names and eliminates duplicates by storing them in a Set Author: Handan
 * Unal
 * 
 */

public class DuplicateElimination {

	public static void main(String[] args) {

		String[] names = { "John", "Jill", "Lorraine", "Natalie", "Phoebe", "Joan", "Lorraine" };

		List<String> list = Arrays.asList(names);
		System.out.println("Name list with duplicates ");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		printNonDuplicates(list);

		System.out.println("Write a name for searching in the list: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine().trim();
		searchName(list, name);

	}

	private static void searchName(List<String> list, String input) {
		System.out.println("Index of name is: ");
		Set<String> set = new HashSet<>(list);
		if (set.contains(input)) {

			int i = new ArrayList<>(set).indexOf(input);
			System.out.println(i);
		}

	}

	private static void printNonDuplicates(List<String> list) {
		System.out.println("Name list without duplicates: ");
		Set<String> set = new HashSet<>(list);

		for (String value : set) {
			System.out.println(value);
		}

	}

}
