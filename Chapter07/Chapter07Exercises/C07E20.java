/**
 * Exercise 7.20 -(Total Sales)  
 * Author: Handan Unal
 * 
 */
package Chapter07Exercises;

import java.security.SecureRandom;

public class C07E20 {

	private static final int PERSON = 4;
	private static final int PRODUCT = 5;
	private static final SecureRandom randomGenerator = new SecureRandom();
	private static int[][] sales = new int[PERSON][PRODUCT];

	public static void main(String[] args) {

		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				sales[i][j] = randomGenerator.nextInt(100);
			}
		}
		int salesVertical[] = new int[5];
		int row = 0;
		int salesHorizontal = 0;
		for (int i = 0; i < PERSON; i++) {
			salesVertical[row] = salesVertical[row] + sales[i][row];
		}
		while (row < PERSON) {
			System.out.print(row + "  ");
			salesHorizontal = 0;
			for (int j = 0; j < sales[row].length; j++) {
				System.out.printf("%5d ", sales[row][j]);
				salesHorizontal = salesHorizontal + sales[row][j];

			}
			System.out.printf("%5d ", salesHorizontal);
			row = row + 1;
			for (int i = 0; i < PERSON; i++) {
				salesVertical[row] = salesVertical[row] + sales[i][row];
			}
			System.out.println();
		}

		System.out.print(row + "  ");
		for (int i = 0; i < salesVertical.length; i++) {
			System.out.printf("%5d ", salesVertical[i]);
		}
	}

}
