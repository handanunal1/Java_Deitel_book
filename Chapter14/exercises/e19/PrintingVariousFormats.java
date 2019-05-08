/**
 *Exercises 14.19 -   PrintingVariousFormats
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e19;

import java.util.Scanner;

public class PrintingVariousFormats {

	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give the date in mm/dd/yyyy format please: ");
		input = scanner.nextLine();

		String month = "";
		String year = input.substring(6, 10);
		String day = input.substring(3, 5);

		switch (input.substring(0, 2)) {
		case "01":
			month = "January";
			break;
		case "02":
			month = "February";
			break;
		case "03":
			month = "March";
			break;
		case "04":
			month = "April";
			break;
		case "05":
			month = "May";
			break;
		case "06":
			month = "June";
			break;
		case "07":
			month = "July";
			break;
		case "08":
			month = "August";
			break;
		case "09":
			month = "September";
			break;
		case "10":
			month = "October";
			break;
		case "11":
			month = "November";
			break;
		case "12":
			month = "December";
			break;

		default:
			break;
		}

		System.out.println("New Date: " + month + " " + day + ", " + year);
	}

}
