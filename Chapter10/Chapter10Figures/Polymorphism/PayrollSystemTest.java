/**
 * Figure 10.9 - PayrollSystemTest
 * 
 * Author: Handan Unal
 * 
 */
package Polymorphism;

import java.util.Iterator;

public class PayrollSystemTest {

	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-11-1111", 500.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Joaquin", "Diaz", "222-22-2222", 13.3, 40);
		CommissionEmployee commisionEmployee = new CommissionEmployee("Jane", "Doe", "221-2-2", 10000, .06);
		BasePlusCommissionEmployee baseplusCommisionEmployee = new BasePlusCommissionEmployee("Daphni", "Papadopolou",
				"444-44-44", 5000, .04, 300);

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
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		
		for(Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommissionEmployee ) 
			{
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10*employee.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary());
				
			}
			
			if (currentEmployee instanceof HourlyEmployee ) 
			{			
				System.out.println("Hourly employee");
				
			}
			System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings());
		
		}
		
		
		for (int j = 0; j < employees.length; j++) {
			   System.out.printf("Employee %d is a %s%n", j,  employees[j].getClass().getName());   
		}

	
	}

}
