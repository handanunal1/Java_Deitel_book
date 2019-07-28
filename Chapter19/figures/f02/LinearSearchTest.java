/**
 * Exercise 19.02  LinearSearchTest
 */
package chapter19.figures.f02;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Handan
 *
 */
public class LinearSearchTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(90);
		}

		System.out.println(Arrays.toString(data));
		System.out.println("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt();

		while (searchInt != -1) {
			int position = linearSearch(data, searchInt);
			if (position == -1) {
				System.out.println(searchInt + " is not found");
			} else {
				System.out.println(searchInt + " is on the " + position + " index");
			}
			searchInt = input.nextInt();

		}

	}

	private static int linearSearch(int[] data, int searchInt) {

		for (int index = 0; index < data.length; index++)
			if (data[index] == searchInt)
				return index; // return index

		return -1;
	}
}
