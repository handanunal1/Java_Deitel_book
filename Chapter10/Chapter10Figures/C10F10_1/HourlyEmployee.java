/**
 * Exercise 9.15
 * 
 * Author: Handan Unal
 * 
 */

package Chapter10Figures;

public class HourlyEmployee extends Employee {

	private double hours;
	private double wage;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		this.hours = hours;
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if(this.hours > 168) {
			throw new IllegalArgumentException("Hours must be <=168");
		}
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {

		if (wage < 0) {
			throw new IllegalArgumentException("Wage must be >= 0.0");
		}
		this.wage = wage;
	}

	

	public double earnings() {

		return getHours() * getWage();
	}
	
	@Override
	public String toString() {

		return String.format("%s %s%n%s %s%n%s %s","Hourly", super.toString(),"Hours:",getHours(),"Wage:",getWage());
	}
}
