/**
 * Exercise 10.15 -   abstract class HourlyEmployee
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e15;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) {
			throw new IllegalArgumentException("The hourly wage must be >= 0.0 ");
		}

		this.wage = wage;
		if (hours < 0 || hours > 168) {
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and  <=168 ");
		}

		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("The hourly wage must be >= 0.0 ");
		}
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {

		if (hours < 0 || hours > 168) {
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and  <=168 ");
		}
		this.hours = hours;
	}

	
	public String toString() {
		return String.format("hourly %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}

	@Override
	public double getPaymountAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
