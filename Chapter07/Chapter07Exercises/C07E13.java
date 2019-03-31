/**
 * Exercise 7.13 - Duplicate Elimination
 * Label the elements of three-by-five two-dimensional array 
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

public class C07E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] sales = new int[10][10];

		for (int row = 0; row < sales.length; row++) {
			for (int col = 0; col < sales[row].length; col++) {
				sales[row][col] = 0;
				System.out.print(row + " " + col + "  ");

			}
			System.out.println(" ");
		}

	}

}
