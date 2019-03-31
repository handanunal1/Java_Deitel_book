import java.util.Scanner;

import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Welcome to accounttest");
		JOptionPane javaoption = new JOptionPane();
		javaoption.showMessageDialog(null, "trial");
		String name = JOptionPane.showInputDialog("Name ?");

		JOptionPane.showMessageDialog(null, "Welcome to accounttest " + name);

		String number = JOptionPane.showInputDialog("Account Balance ?");
		int a = Integer.parseInt(number);

		Account account1 = new Account("Jane Green", a);
		Account account2 = new Account("John Doe", -7.53);
		JOptionPane.showMessageDialog(null, "account 1 is " + account1.getName() + " " + account1.getBalance());
		System.out.println("account 1 is " + account1.getName() + " " + account1.getBalance());
		System.out.println("account 2 is " + account2.getName() + " " + account2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.println("Enter deposit");

		double depositAmount = input.nextDouble();

		account1.deposit(depositAmount);
		System.out.println("account 1 is " + account1.getName() + " " + account1.getBalance());

	}
}
