
/**
 * Fig. 10.13: Employee.java 
 * 
 * Author: Handan Unal
 * 
 * Note: The class is declared abstract because we wont Implement the getPaymountAmount here. 
 * Otherwise there would be a compilation error
 */

package Interfaces;

public abstract class Employee implements Payable {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: %s %s%n%s: %s:", "employee", firstName, lastName, "social security number",
				socialSecurityNumber);
	}

	
}
