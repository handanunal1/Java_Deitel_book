/**
 * Figures 17.10  Employee
 * 
 * Author: Handan Unal
 *  (the output is different)
 * 
 */
package chapter17.figures.f09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcessingEmployees {

	public static void main(String[] args) {
		Employee[] employees = { new Employee("Handan", "Unal", 1002, "Sales"), new Employee("John", "Doe", 500, "IT"),
				new Employee("Jane", "Doe", 900, "Marketing"), new Employee("Mr", "Brown", 444, "IT"),
				new Employee("Emily", "Watson", 199, "IT"), new Employee("Emmanuel", "Tolstoy", 900, "Sales"),
				new Employee("John", "Locke", 830, "Marketing") };

		List<Employee> list = Arrays.asList(employees);

		System.out.println("Complete Employee List");
		list.stream().forEach(System.out::println);

		Predicate<Employee> fourToSixHundred = e -> (e.getSalary() >= 400 && e.getSalary() <= 600);

		System.out.println("Employees earning $400-$600 per month sorted by salary:");
		list.stream().filter(fourToSixHundred).sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);

		System.out.println(
				"First employee who earns $4000-$6000:\n" + list.stream().filter(fourToSixHundred).findFirst().get());

	}

}
