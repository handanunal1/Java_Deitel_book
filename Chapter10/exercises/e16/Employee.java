/**
 * Exercise 10.16 - PayrollSystemTest
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e16;

public class Employee implements Payable {

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

		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

	public double earnings() {
		return 0;
	}

	@Override
	public double getPaymountAmount() {
		// TODO Auto-generated method stub
		return earnings();
	}

}
