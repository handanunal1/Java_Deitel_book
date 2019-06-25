package chapter16.exercises.e18;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Figures 16.18 CopyingReversing
 * 
 * Author: Handan Unal
 * 
 */
public class CopyingReversing {

	public static void main(String[] args) {

		LinkedList<Character> linkedListChar = new LinkedList<Character>();
		linkedListChar.add('A');
		linkedListChar.add('B');
		linkedListChar.add('C');
		linkedListChar.add('D');
		linkedListChar.add('E');
		linkedListChar.add('F');
		linkedListChar.add('G');
		linkedListChar.add('H');
		linkedListChar.add('I');
		linkedListChar.add('J');

		System.out.println("Linked list of characters: ");
		for (Character c : linkedListChar) {
			System.out.print(c +" ");
		}

		copyReverseLinkedList(linkedListChar);
	}

	private static void copyReverseLinkedList(LinkedList<Character> linkedListChar) {
		LinkedList<Character> linkedListCopyChar = new LinkedList<Character>();
		linkedListCopyChar = (LinkedList<Character>) linkedListChar.clone();
		Collections.reverse(linkedListCopyChar);

		System.out.println("\nReversed linked list of characters: ");

		for (Character c : linkedListCopyChar) {
			System.out.print(c +" ");
		}
	}

}
