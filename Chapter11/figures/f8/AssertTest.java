/**
 *Exercise 11.8 -   AssertTest
 * 
 * Author: Handan Unal
 * 
 * Note: to enable assertion:
 * 1-Window (menu bar)
 * 2-Preferences
 * 3-Java
 * 4-Installed JREs
 * 5-Select your JRE/JDK
 * 6-Press Edit...
 * 7-Default VM arguments
 * 8-Add -ea
 */
package figures.f8;

import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 10");
		int number = input.nextInt();

		assert (number >= 0 && number <= 10) : "bad number" + number;

		System.out.printf("You entered %d%n", number);

	}

}
