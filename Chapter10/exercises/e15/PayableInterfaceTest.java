/**
 * Exercise 10.15  PayableInterfaceTest
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e15;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[6];
		payableObjects[0] = new Invoice("01234", "seat", 2, 431.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.44);
		payableObjects[2] = new SalariedEmployee("Giorgos", "Boras", "222-22-2222", 1500.00);
		payableObjects[3] = new HourlyEmployee("Sophia", "Gavriou", "333-33-33", 900.00,2);
		payableObjects[4] = new CommissionEmployee("Sophia", "Gavriou", "333-33-33", 5000, .04);
		payableObjects[5] = new BasePlusCommissionEmployee("Sophia", "Gavriou", "333-33-33", 5000, .04, 300);
		System.out.println("Invoices and Employees processed polymorphically");

		for (Payable currentPayable : payableObjects) {
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due",
					currentPayable.getPaymountAmount());
		}

	}

}
