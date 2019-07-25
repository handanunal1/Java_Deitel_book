/**
 * Exercise 18.9 Recursive Power Method
 * 
 * Author: Handan Unal
 */
package chapter18.exercises.e09;

import java.util.Scanner;

public class RecursivePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Give the base number calculation");
		int base = scanner.nextInt();
		System.out.println("Give the power number calculation");
		int power = scanner.nextInt();
		
		int result = recursivePower(base, power);
		System.out.println("Result: "+ result);
	}

	public static int recursivePower(int base, int power) {

		if (power < 1) {
			return 1;
		} else {
			return base * recursivePower(base, power - 1);
		}
	}

}
