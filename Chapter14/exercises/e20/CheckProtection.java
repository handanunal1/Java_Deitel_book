/**
 *Exercises 14.20 -    CheckProtection
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e20;

import java.util.Scanner;

public class CheckProtection {

	public static void main(String[] args) {
		double input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write check amount:");
		input = scanner.nextDouble();

		if (input > 9999) {
			System.out.println("Please write another amount:");
		} else {
			String inputString = String.valueOf(input);
			if (input > 1000) {

				
				inputString = inputString.substring(0,1)+ "," +inputString.substring(1,4)+ "."+inputString.substring(5,7);
				System.out.println(inputString);
			} else {
				for (int i = 0; i < 8 - inputString.length(); i++) {
					System.out.print("*");
				}
				System.out.print(inputString);
				System.out.println();
			}
			

		}
		System.out.println("--------");
		System.out.println("12345678");
	}

}
