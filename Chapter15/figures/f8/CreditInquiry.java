/**
 *Figures 15.8 - CreditInquiry
 * 
 * Author: Handan Unal
 * 
 */
package figures.f8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {

	private final static MenuOption[] choices = MenuOption.values();

	public static void main(String[] args) {
		MenuOption accountType = getRequest();

		while (accountType != MenuOption.END) {
			switch (accountType) {
			case ZERO_BALANCE:
				System.out.printf("%nAccounts with zero balances:%n");
				break;
			case CREDIT_BALANCE:
				System.out.printf("%nAccounts with credit balances:%n");
				break;

			case DEBIT_BALANCE:
				System.out.printf("%nAccounts with debit balances:%n");
				break;
			}

			readRecords(accountType);
			accountType = getRequest();
		}

	}

	private static MenuOption getRequest() {
		int request = 4;

		System.out.println("Enter the request: ");
		System.out.println("1 - List accounts with zero balances ");
		System.out.println("2 - List accounts with credit balances ");
		System.out.println("3 - List accounts with debit balances ");
		System.out.println("4 - Terminate ");

		try {
			Scanner input = new Scanner(System.in);
			do {
				System.out.printf("?");
				request = input.nextInt();
			} while (request < 1 || request > 4);
		} catch (NoSuchElementException noSuchElementException) {
			System.err.println("Invalid input. Terminating.");
		}
		return choices[request - 1];
	}

	private static void readRecords(MenuOption accountType) {

		try (Scanner input = new Scanner(Paths.get("clients.txt"))) {
			while (input.hasNext()) {
				int accountNumber = input.nextInt();
				String name = input.next();
				String surName = input.next();
				double balance = input.nextDouble();

				if (shouldDisplay(accountType, balance)) {
					System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, name, surName, balance);
				} else {
					input.nextLine();
				}
			}

		} catch (NoSuchElementException | IllegalStateException | IOException e) {
			System.err.println("Error processing file. Terminating.");
			System.exit(1);
		}
	}

	private static boolean shouldDisplay(MenuOption accountType, double balance) {
		if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
			return true;
		} else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
			return true;
		} else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0)) {
			return true;
		}
		return false;
	}

}
