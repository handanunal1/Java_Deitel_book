/**
 * Exercise 9.10 
 * 
 * Author: Handan Unal
 * 
 */

package Chapter09Exercises;

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
	
	
}
