/**
 *  Figure 19.03   BinarySearchTest
 */
package chapter19.figures.f03;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Handan Unal
 *
 */
public class BinarySearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(90);
		}

		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

		System.out.print("Please enter an integer value (-1 to quit): ");

		int searchInt = input.nextInt();

		while (searchInt != -1) {
			int position = binarySearch(data, searchInt);
			if (position == -1) {
				System.out.println(searchInt + " is not found");
			} else {
				System.out.println(searchInt + " is on the " + position + " index");
			}
			searchInt = input.nextInt();

		}
	}

	public static int binarySearch(int[] data, int key) {
		int low = 0;
		int high = data.length - 1;
		int middle = (low + high + 1) / 2;
		int location = -1;

		do {
			System.out.print(remainingElements(data, low, high));

			for (int i = 0; i < middle; i++)
				System.out.print(" ");
			System.out.print("*");

			if (key == data[middle])
				location = middle;
			else if (key < data[middle])
				high = middle - 1;
			else
				low = middle + 1;

			middle = (low + high + 1) / 2;
		} while ((low <= high) && (location == -1));

		return location;
	}

	private static String remainingElements(int[] data, int low, int high) {
		StringBuilder temporary = new StringBuilder();

		for (int i = 0; i < low; i++)
			temporary.append(" ");

		for (int i = low; i <= high; i++)
			temporary.append(data[i] + " ");

		return String.format("%s%n", temporary);
	}

}
