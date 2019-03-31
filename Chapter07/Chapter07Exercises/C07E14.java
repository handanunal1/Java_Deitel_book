/**
 * Exercise 7.14 - Duplicate Elimination
 * (Variable-LengthArgumentList) Write an application that calculates
 * the product of a series of integers that are passed to 
 * method product. 
 * Author: Handan Unal
 * 
 */
package Chapter07Exercises;

public class C07E14 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		System.out.println("Array elements: ");
		for (int member : array) {
			System.out.print(member + " ");
		}

		System.out.println();
		System.out.println("Product of number in the array: " + productOfSeries(array));
	}

	public static int productOfSeries(int array[]) {

		int product = 1;

		for (int i = 0; i < array.length; i++) {
			product = array[i] * product;
		}

		return product;

	}
}
