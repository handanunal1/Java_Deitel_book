/**
 * Exercise 9.14
 * 
 * Author: Handan Unal
 * 
 */

package Chapter10Figures;

public class Employee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
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
		return String.format("%s: %s %s%n%s: %s:", "employee", firstName, lastName,
				"social security number", socialSecurityNumber);
	}
}
