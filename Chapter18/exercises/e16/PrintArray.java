/**
 * Exercise 18.16  PrintArray
 * 
 * Author: Handan Unal  
 *
 *
 */
package chapter18.exercises.e16;

public class PrintArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a = 0;
		System.out.println("Array elements; ");
		printArrayRecursive(array, a);
	}

	public static void printArrayRecursive(int[] array, int a) {

		if (a == array.length) {
			System.out.println();
		} else {
			System.out.print(array[a]+ " ");
			printArrayRecursive(array, a + 1);
		}
	}
}
