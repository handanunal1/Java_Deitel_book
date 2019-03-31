
/**
 * Exercise 8.6 - SavingsAccount Class
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class SavingsAccount {

	private static double annualdoubleerestRate;
	private double savingsBalance;

	
	public double calculateMonthlydoubleerest() {
		return (savingsBalance * annualdoubleerestRate) / 12;
	}
	
	public static  void modifydoubleerestRate (double  annualdoubleerest) {
		annualdoubleerestRate = annualdoubleerest;
	}

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	
}
