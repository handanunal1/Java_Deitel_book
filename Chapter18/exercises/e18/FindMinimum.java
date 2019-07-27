/**
 * Exercise 18.18  printBackward 
 * 
 * Author: Handan Unal  
 *
 *
 */
package chapter18.exercises.e18;

public class FindMinimum {

	public static void main(String[] args) {
		int[] array = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10, };
		int firstIndex = 0;
		System.out.println("Minimum array element; ");
		int min = printMinimum(array, firstIndex, array[firstIndex]);
		System.out.println(min);
	}

	public static int printMinimum(int[] array, int current, int min) {

		if (current + 1 == array.length) {
			return min;
		}
		if (array[current + 1] < min) {
			min = array[current + 1];
		}
		return printMinimum(array, current+ 1, min);
	}
}
