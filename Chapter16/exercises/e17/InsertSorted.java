package chapter16.exercises.e17;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Figures 16.17 InsertSorted
 * 
 * Author: Handan Unal
 * 
 */
public class InsertSorted {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int number = 0;
		LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

		for (int i = 0; i < 25; i++) {
			number = random.nextInt(100);
			integerLinkedList.add(number);
			System.out.println(number);

		}

		sortElements(integerLinkedList);
		int sum = calculateSum(integerLinkedList);
		System.out.println("Sum of the linked list elements are : " + sum);
		calculateAverage(integerLinkedList);

	}

	private static void calculateAverage(LinkedList<Integer> integerLinkedList) {

		int sum = calculateSum(integerLinkedList);
		float average = (float) sum / (float) integerLinkedList.size();
		System.out.println("Average of the list elements are " + average);

	}

	private static int calculateSum(LinkedList<Integer> integerLinkedList) {

		Iterator itr = integerLinkedList.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			sum = (int) itr.next() + sum;

		}
		return sum;

	}

	private static void sortElements(LinkedList<Integer> integerLinkedList) {
		Collections.sort(integerLinkedList);
		System.out.println("Sorted Linked List: ");
		Iterator itr = integerLinkedList.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
