/**
 * Figure 10.15 - PayableInterfaceTest
 * 
 * Author: Handan Unal
 * 
 */
package Interfaces;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[4];
		payableObjects[0] = new Invoice("01234", "seat", 2, 431.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.44);
		payableObjects[2] = new SalariedEmployee("Giorgos", "Boras", "222-22-2222", 1500.00);
		payableObjects[3] = new SalariedEmployee("Sophia", "Gavriou", "333-33-33", 900.00);

		System.out.println("Invoices and Employees processed polymorphically");

		for (Payable currentPayable : payableObjects) {
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due",
					currentPayable.getPaymountAmount());
		}

	}

}
