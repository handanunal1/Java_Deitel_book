/**
 *Exercise 11.6 -  Catching Exceptions with Superclass exception
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e16;

public class ExceptionMain {

	public static void main(String[] args) {
         System.out.println("Exception superclass is ExceptionA");
		try {
			throw new ExceptionB();
		} catch (ExceptionA ex) {
			System.out.println("ExceptionB is caught");
		}
			
		
		try {
			throw new ExceptionC();
		} catch (ExceptionA ex) {
			System.out.println("ExceptionC is caught");
		}

	}

}
