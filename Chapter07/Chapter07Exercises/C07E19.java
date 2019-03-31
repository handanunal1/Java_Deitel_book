/**
 * Exercise 7.19 -(Airline Reservations System)  
 * A small airline has just purchased a computer for its new automated reservations system. 
 * You’ve been asked to develop the new system. 
 * You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats). 
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class C07E19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] seatArray = new boolean[11];
		for (int i = 0; i < seatArray.length; i++) {
			seatArray[i] = false; // All seats are empty
		}

		System.out.println("Enter the seat type (First Class - 1) / (Economy Class -2 ) : ");
		Scanner scan = new Scanner(System.in);
		SecureRandom sRandom = new SecureRandom();
		int input = scan.nextInt();
		int seatNumber = 0;
		int counter1 = 0;
		int counter2 = 0;

		while (counter1 + counter2 <= 10) {

			if (input == 2) {
				if (counter2 == 5) {
					System.out.println("Economy class is full. Would you like a seat from first class ? (Y/N) : ");
					String choice = scan.next();

					if (choice == "Y") {
						input = 1;
					} else {
						System.out.println("Next flight is 2 hours later! ");
						break;
					}
				} else {
					seatNumber = 1 + sRandom.nextInt(5); // FirstClass

				}
			}
			if (input == 1) {

				seatNumber = 6 + sRandom.nextInt(5); // FirstClass

			}

			if (seatArray[seatNumber] == false) {
				seatArray[seatNumber] = true;
				System.out.println("SeatNumber: " + seatNumber);
				if (input == 1) {
					counter1++;
				} else {
					counter2++;
				}
			}

			System.out.println("Enter the seat type (First Class - 1) / (Economy Class -2 ) : ");
			input = scan.nextInt();

		}

		for (int i = 1; i < seatArray.length; i++) {
			System.out.print("seat " + i + " ");
			System.out.print(seatArray[i] ? "reserved" : "Empty");
			System.out.println();
		}

	}

}
