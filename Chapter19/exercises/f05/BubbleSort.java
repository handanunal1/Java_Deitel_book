/**
 * Exercise 19.05   BubbleSort
 */
package chapter19.exercises.f05;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Handan
 *
 */

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// Driver method to test above
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(90);
		}

		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
		bubbleSort(data);

		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));
	}

}
