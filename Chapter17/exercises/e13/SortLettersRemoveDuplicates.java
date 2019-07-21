/**
 * Exercise 17.14 SortLettersRemoveDuplicates
 * 
 * Author: Handan Unal
 * Write a program that inserts 30 random letters
 * into a List<Character>.
 * 
 */
package chapter17.exercises.e13;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import chapter17.figures.f12.Employee;

public class SortLettersRemoveDuplicates {

	public static void main(String[] args) {

		List<Character> listCharacter = new ArrayList<Character>();

		SecureRandom r = new SecureRandom();

		for (int i = 0; i < 30; i++) {
			char c = (char) (r.nextInt(26) + 'a');
			listCharacter.add(c);
		}

		sortAscending(listCharacter);
		sortDescending(listCharacter);
		sortAscendingRemoveDuplicates(listCharacter);

	}

	public static void sortAscending(List<Character> list) {
		System.out.println("Sorting by ascending order: ");
		list.stream().sorted().forEach(value -> System.out.println(value.charValue()));

	}

	public static void sortDescending(List<Character> list) {

		System.out.println("Sorting by descending order: ");
		list.stream().sorted(Comparator.reverseOrder()).forEach(value -> System.out.println(value.charValue()));

	}

	
	public static void sortAscendingRemoveDuplicates(List<Character> list) {

		System.out.println("Sorting by ascending order remove duplicates: ");
		list.stream().distinct().sorted().forEach(value -> System.out.println(value.charValue()));


	}

}
