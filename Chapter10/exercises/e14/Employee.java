/**
 * Exercise 10.14 - - Abstract Class Employee
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e14;

public abstract class Employee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final Date birthDate;

	public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return birthDate;
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

	public abstract double earnings();

	public double getBonus(double bonus) {
		
		return bonus+earnings();
	}
}
