package chapter20.exercises.e04;

/**
 *Figures 20.04    Selection Sort in generic classes
 * 
 * Author: Handan Unal
 * 
 */
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		Integer[] data = new Integer[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(90);
		}

		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
		selectionSort(data);

		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));

	}

	public static <T extends Comparable<T>> void selectionSort(T[] data) {

		for (int i = 0; i < data.length - 1; i++) {

			int smallest = i;

			for (int index = i + 1; index < data.length; index++) {
				if (data[index].compareTo(data[smallest]) < 0) {
					smallest = index;
				}
				swap(data, i, smallest); //

			}

		}

	}

	private static <T> void swap(T[] data, int first, int second) {
		Integer temp = (Integer) data[first];
		data[first] = data[second];
		data[second] = (T) temp;

	}

}
