/**
 * Exercise 7.12 - Sales Commissions  
 * Write statements that perform the following one-dimensional-array operations:
 * a) Set the 10 elements of integer array counts to zero. 
 * b) Add one to each of the 15 elements of integer array bonus.
 * c) Display the five values of integer array bestScores in column format
 * Author: Handan Unal
 * 
 */
package Chapter07Exercises;

public class C07E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[10];
		int bonus[] = new int[15];
		int bestScores[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

		for (int i = 0; i < bonus.length; i++) {
			bonus[i] += 1;
		}

		for (int i = 0; i < bestScores.length; i++) {
			System.out.println(bestScores[i]);
		
		}
	}

}
