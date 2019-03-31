/**
 * Figure 8.12 - Employee.Java - Static keyword
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Figures;

public class Employee2 {

	private String firstName;
	private String lastName;
	private static int count = 0;

	public Employee2( String first, String last ) {
		 firstName = first; 
		 lastName = last;
		 
		 ++count; // increment static count of employees
		 System.out.printf( "Employee constructor: %s %s; count = %d\n",  firstName, lastName, count ); 
	 }

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static int getCount() {
		return count;
	}
	
	
	

}
