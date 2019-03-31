
/**
 * Exercise 8.6s -SavingsAccountTest Class
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

import javax.sound.midi.Soundbank;

public class SavingsAccountTest {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		SavingsAccount.modifydoubleerestRate(0.04);
		calculateBalance(12, saver1);
		calculateBalance(12, saver2);
		SavingsAccount.modifydoubleerestRate(0.05);
		calculateBalance(1, saver1);
		calculateBalance(1, saver2);

	}

	public static void calculateBalance(int month, SavingsAccount saver) {
		System.out.print("Balance of account: ");
		System.out.printf("%1.2f",saver.getSavingsBalance());
		System.out.println();
		saver.setSavingsBalance(saver.getSavingsBalance() + (month * saver.calculateMonthlydoubleerest()));
		System.out.print("Balance after Interest for "+month+" months ");
		System.out.printf("%1.2f",saver.getSavingsBalance());
		System.out.println();
	}

}
