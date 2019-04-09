/**
 * Figure 10.6 - Concrete Class HourlyEmployee
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e12;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours,Date date) {
		super(firstName, lastName, socialSecurityNumber,date);

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

	@Override
	public double earnings() {


		if (getHours() <= 40)
			return getWage() * getHours();

		else
			return (40 * wage) + (getHours() - 40) * (wage * 1.5);
	}

	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}
}
