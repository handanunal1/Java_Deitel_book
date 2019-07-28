/**
 *  Figure 19.04    SelectionSort
 */
package chapter19.figures.f04;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(90);
		}

		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
		selectionSort(data);

		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));
	}

	private static void selectionSort(int[] data) {

		for (int i = 0; i < data.length - 1; i++) {

			int smallest = i;

			for (int index = i + 1; index < data.length; index++) {
				if (data[index] < data[smallest]) {
					smallest = index;
				}
				swap(data, i, smallest); //
			//	printPass( i + 1, smallest);
			}

		}

	}

	private static void swap(int[] data, int first, int second) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;

	}

	

}
