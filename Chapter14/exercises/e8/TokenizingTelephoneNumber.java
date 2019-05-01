/**
 *Exercises 14.8 -   TokenizingTelephoneNumber
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e8;

import java.util.Scanner;

public class TokenizingTelephoneNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your phone number:");
		String phoneNumber = scanner.nextLine();

		String[] phoneNumberArray = phoneNumber.trim().split("[\\()-]");

		String phoneNumberNew = phoneNumberArray[1] + phoneNumberArray[phoneNumberArray.length - 1];
		System.out.println("New version of phone number:" + phoneNumberNew);

	}

}
