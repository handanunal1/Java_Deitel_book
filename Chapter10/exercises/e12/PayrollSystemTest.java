/**
 * Figure 10.9 - PayrollSystemTest
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e12;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;

public class PayrollSystemTest {

	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-11-1111", 500.00,
				new Date(3, 11, 1950));
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Joaquin", "Diaz", "222-22-2222", 13.3, 40,
				new Date(4, 21, 1960));
		CommissionEmployee commisionEmployee = new CommissionEmployee("Jane", "Doe", "221-2-2", 10000, .06,
				new Date(4, 24, 1970));
		BasePlusCommissionEmployee baseplusCommisionEmployee = new BasePlusCommissionEmployee("Daphni", "Papadopolou",
				"444-44-44", 5000, .04, 300, new Date(12, 01, 1990));

		System.out.println("Employees processed individually: ");
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", commisionEmployee, "earned", commisionEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", baseplusCommisionEmployee, "earned",
				baseplusCommisionEmployee.earnings());

		Employee[] employees = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commisionEmployee;
		employees[3] = baseplusCommisionEmployee;
		Date dateCurrent = new Date(4, 3, 2019);

		for (Employee currentEmployee : employees) {

			if (dateCurrent.getMonth() == currentEmployee.getBirthDate().getMonth()) {
				currentEmployee.getBonus(100);
				System.out.printf("%n%s%n%s: $%,.2f%n%n", currentEmployee, "earned", currentEmployee.getBonus(100));
			}
		}

	}

}
