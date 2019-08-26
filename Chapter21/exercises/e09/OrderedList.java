package chapter21.exercises.e09;

import java.security.SecureRandom;

/**
 * Exercise 09 ListCopyBackwards
 * 
 * @author Handan
 */
public class OrderedList {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int[] arrayInteger = new int[25];
		for (int i = 0; i < 25; i++) {
			arrayInteger[i] = random.nextInt(100);
		}

		List<Integer> listFirst = new List<Integer>();

		for (Integer element : arrayInteger) {
			listFirst.InsertAtFront(element);
		}
		listFirst.print();
		List<Integer> listCopyBackwards = listFirst.CopyListBackward(listFirst);
		System.out.println("After the copy;");
		listCopyBackwards.print();

	}

}
