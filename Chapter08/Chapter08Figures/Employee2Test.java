package Chapter08Figures;

public class Employee2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Employees before instantiation");
		System.out.println(Employee2.getCount());
		Employee2 e1 = new Employee2("Susan", "Baker");
		Employee2 e2 = new Employee2("Sherlock", "Holmes");
		System.out.println("Employees after instantiation");
		System.out.println(Employee2.getCount());

		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
		
		e1 = null;
		e2 = null;
	
	}

}
