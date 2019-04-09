/**
 * Exercise 10.16 - PayrollSystemTest
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e16;

import java.util.Iterator;

public class PayrollSystemTest {

	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-11-1111", 500.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Joaquin", "Diaz", "222-22-2222", 13.3, 40);
		CommissionEmployee commisionEmployee = new CommissionEmployee("Jane", "Doe", "221-2-2", 10000, .06);
		BasePlusCommissionEmployee baseplusCommisionEmployee = new BasePlusCommissionEmployee("Daphni", "Papadopolou",
				"444-44-44", 5000, .04, 300);

		Employee[] employees = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commisionEmployee;
		employees[3] = baseplusCommisionEmployee;

		System.out.printf("Employees processed polymorphically:%n%n");

		for (Employee currentEmployee : employees) {

			System.out.printf("%n%s%n%s: $%,.2f%n%n", currentEmployee, "earned", currentEmployee.getPaymountAmount());
		}

	}

}
