/**
 * Exercise 18.17  printBackward 
 * 
 * Author: Handan Unal  
 *
 *
 */
package chapter18.exercises.e17;

public class printBackward {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a = array.length;
		System.out.println("Array elements; ");
		printArrayRecursive(array, a);
	}

	public static void printArrayRecursive(int[] array, int a) {

		if (a == 0) {
		return;
		} else {
			System.out.print(array[a-1]+ " ");
			printArrayRecursive(array, a - 1);
		}
	}
}
