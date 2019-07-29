/**
 *  Figure 19.04    InsertionSortTest
 */
package chapter19.figures.f05;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(90);
		}

		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
		insertionSort(data);

		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));

	}

	public static void insertionSort(int[] data) {

		for (int next = 1; next < data.length; next++) {
			int insert = data[next];
			int moveItem = next;

			while (moveItem > 0 && data[moveItem - 1] > insert) {
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}

			data[moveItem] = insert; // place
			printPass(data, next, moveItem); // output pass of algorithm
		}

	}

	public static void printPass(int[] data, int pass, int index) {
		for (int i = 0; i < index; i++)
			System.out.printf("%d ", data[i]);
		System.out.printf("%d* ", data[index]); // indicate swap

		for (int i = index + 1; i < data.length; i++)
			System.out.printf("%d ", data[i]);

		for (int i = 0; i <= pass; i++)
			System.out.print("-- ");
		System.out.println();
	}

}
