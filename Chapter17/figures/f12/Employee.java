/**
 * Figures 17.09  Employee
 * 
 * Author: Handan Unal
 *  (the output is different)
 * 
 */

package chapter17.figures.f12;

public class Employee {

	private String firstName;
	private String lastName;
	private double salary;
	private String departmant;

	public Employee(String firstName, String lastName, double salary, String departmant) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.departmant = departmant;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartmant() {
		return departmant;
	}

	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}

	@Override
	public String toString() {

		return String.format("%-8s %-8s %8.2f  %s", getFirstName(), getLastName(), getSalary(), getDepartmant());
	}
}
