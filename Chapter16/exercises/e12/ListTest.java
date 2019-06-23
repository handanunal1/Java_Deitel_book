package chapter16.exercises.e12;

/**
 * Exercises e12:   Lists, LinkedLists and ListIterators. 
 * (Rewrite lines 16–25 in Fig. 16.3 to be more concise by using the asList method and the
 * LinkedList constructor that takes a Collection argument.)
 * Author: Handan Unal
 * 
 */

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };

		List<String> list1 = new ArrayList<>(Arrays.asList(colors));

		String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
		List<String> list2 = new ArrayList<>(Arrays.asList(colors2));

		list1.addAll(list2);
		list2 = null;
		printList(list1);

		convertToUppercaseStrings(list1);
		printList(list1);

		System.out.printf("%nDeleting elements 4 to 6...");
		removeItems(list1, 4, 7); // remove items 4-6 from list
		printList(list1);
		printReversedList(list1);
	}

	private static void removeItems(List<String> list1, int start, int end) {
		list1.subList(start, end).clear();

	}

	private static void printReversedList(List<String> list1) {
		ListIterator<String> iterator = list1.listIterator(list1.size());
		System.out.printf("%nReversed List:%n");

		while (iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());

	}

	private static void convertToUppercaseStrings(List<String> list1) {
		ListIterator<String> iterator = list1.listIterator();
		while (iterator.hasNext()) {
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}

	}

	private static void printList(List<String> list1) {
		for (String color : list1)
			System.out.printf("%s ", color);

		System.out.println();
	}

}
