/**
 *Figures.f21 -   Validate
 * 
 * Author: Handan Unal
 * 
 */
package figures.f20_f21;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your first name");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Please enter your adress");
		String address = scanner.nextLine();
		System.out.println("Please enter your city");
		String city = scanner.nextLine();
		System.out.println("Please enter your state");
		String state = scanner.nextLine();
		System.out.println("Please enter your zip code");
		String zipCode = scanner.nextLine();
		System.out.println("Please enter your phone");
		String phone = scanner.nextLine();

		System.out.println("Validate result:");

		if (!ValidateInput.validateFirstName(firstName)) {
			System.out.println("Invalid first name");
		} else if (!ValidateInput.validatelastName(lastName)) {
			System.out.println("Invalid last name");
		} else if (!ValidateInput.validateAdress(address)) {
			System.out.println("Invalid address");
		} else if (!ValidateInput.validateCity(city)) {
			System.out.println("Invalid last city");
		} else if (!ValidateInput.validateState(state)) {
			System.out.println("Invalid last state");
		} else if (!ValidateInput.validateZip(zipCode)) {
			System.out.println("Invalid last zipCode");
		} else if (!ValidateInput.validatePhone(phone)) {
			System.out.println("Invalid phone");
		} else {
			System.out.println("Valid input.  Thank you.");
		}
	}

}
