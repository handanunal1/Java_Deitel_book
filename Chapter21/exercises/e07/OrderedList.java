package chapter21.exercises.e07;

import java.security.SecureRandom;

/**
 * Exercise 07 OrderedList
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
			
			
			listFirst.Addsorted(element);
		}

		
		listFirst.print();
	
	}

}
