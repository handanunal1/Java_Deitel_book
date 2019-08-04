/**
 * Exercise 19.07   BucketSort 
 */
package chapter19.exercises.f07;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * @author Handan
 *
 */
public class BucketSort {

	public static void sort(int[] a, int maxVal) {
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < a.length; i++) {
			bucket[a[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[outPos++] = i;
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int maxVal = 5;
		int[] data = { 5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4 };

		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
		sort(data, data.length);

		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));
	}

}
