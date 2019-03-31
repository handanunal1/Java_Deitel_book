/**
 * Figure 9.5 -CommisionEmployeeTest
 * 
 * Author: Handan Unal
 * 
 */

package Chapter09Figures;

public class CommissionEmployeeTest {

	public static void main(String[] args) {

		CommisionEmployee employee = new CommisionEmployee("Jane", "Doe", "222-22-2222", 10000, .06);
		System.out.println("Employee information obtained by get methods: ");
		System.out.printf("%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "GrossSales number is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commision rate is", employee.getCommissionRate());
		
		System.out.println("Updated employee information obtained by ToString:");
		employee.setGrossSales(5000);
		employee.setCommissionRate(.1);
		
		System.out.println(employee.toString());
		
	}

}
