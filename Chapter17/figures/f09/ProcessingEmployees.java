/**
 * Figures 17.10  Employee
 * 
 * Author: Handan Unal
 *  (the output is different)
 * 
 */
package chapter17.figures.f09;

import java.util.Arrays;
import java.util.List;

public class ProcessingEmployees {

	public static void main(String[] args) {
		Employee[] employees = { new Employee("Handan", "Unal", 1002, "Sales"), new Employee("John", "Doe", 500, "IT"),
				new Employee("Jane", "Doe", 900, "Marketing"), new Employee("Mr", "Brown", 444, "IT"),
				new Employee("Emily", "Watson", 199, "IT"), new Employee("Emmanuel", "Tolstoy", 900, "Sales"),
				new Employee("John", "Locke", 830, "Marketing") };

		List<Employee> list = Arrays.asList(employees);

		System.out.println("Complete Employee List");
		list.stream().forEach(System.out::println);
		

	}

}
