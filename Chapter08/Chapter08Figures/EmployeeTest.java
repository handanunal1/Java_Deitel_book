/**
 * Figure 8.9 - EmployeeTest.Java -Composition
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Figures;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date birth = new Date(11 ,22, 1980);
		Date hire = new Date(01, 04, 2018);
		Employee employee = new Employee("Jane", "Doe", birth, hire);
		System.out.println(employee);
	}

}
