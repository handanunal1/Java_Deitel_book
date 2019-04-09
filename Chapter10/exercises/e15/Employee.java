/**
 *Exercise 10.15 -   abstract class Employee
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e15;

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
