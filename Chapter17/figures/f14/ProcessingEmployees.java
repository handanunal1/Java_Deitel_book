/**
 * Figures 17.14  ProcessingEmployees - Sorting Employees by departmant
 * 
 * Author: Handan Unal
 *  (the output is different)
 * 
 */
package chapter17.figures.f14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {

	public static void main(String[] args) {
		Employee[] employees = { new Employee("Handan", "Unal", 1002, "Sales"), new Employee("John", "Doe", 500, "IT"),
				new Employee("Jane", "Doe", 900, "Marketing"), new Employee("Mr", "Brown", 444, "IT"),
				new Employee("Emily", "Watson", 199, "IT"), new Employee("Emmanuel", "Tolstoy", 900, "Sales"),
				new Employee("John", "Locke", 830, "Marketing") };

		List<Employee> list = Arrays.asList(employees);

		Map<String, List<Employee>> groupedByDepartmant = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmant));

		groupedByDepartmant.forEach((departmant, employeesInDepartmant) -> {

			System.out.println(departmant);
			employeesInDepartmant.forEach(employee -> System.out.printf("    %s\n", employee));

		});

		// count number of Employees in each department
		System.out.println();
		Map<String, Long> employeeCountByDepartmant = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmant, Collectors.counting()));

		employeeCountByDepartmant
				.forEach((departmant, count) -> System.out.println(departmant + " departmant has " + count + " count"));
	}

}
