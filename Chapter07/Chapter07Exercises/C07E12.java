/**
 * Exercise 7.12 - Duplicate Elimination
 * Write an application that inputs five numbers,each between 10 and 100. Display
 * only if the number is not already read.
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

import java.util.Scanner;

public class C07E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[5];
		int counter = 0;
		System.out.println("Enter the numbers between 10 and 100 : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		array[0] = input;
		while (input >= 10 && input <= 100 && counter < 4) {
			System.out.println("Enter the numbers between 10 and 100 : ");
			input = scan.nextInt();
			counter++;
			for (int i = 0; i < counter; i++) {
				if (array[i] == input) {
					break;
				}
				if (i + 1 == counter) {
					array[counter] = input;
					System.out.println(array[counter]);
				}

			}

		}

		scan.close();
	}
}
