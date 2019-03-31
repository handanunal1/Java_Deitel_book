/**
 * Figure 9.7 - BasePlusCommissionEmployeeTest
 * 
 * Author: Handan Unal
 * 
 */
package Chapter09Figures;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
	
		
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("John", "Doe", "333-33-3333",500,.04,300);
		System.out.println("Employee information obtained by get methods: ");
		System.out.printf("%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "GrossSales number is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commision rate is", employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base Salary is", employee.getBaseSalary());
		 
	}

}
