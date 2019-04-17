/**
 * Exercise 11.20 -   RethrowingException
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e20;

public class RethrowingException {

	public static void main(String[] args) {
		
		
		try {
			someMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public static void someMethod() throws Exception {
		try {
			someMethod2();
		} catch (Exception exception) {
			throw new Exception("Exception caught in someMethod and thrown", exception);
		}

	}

	public static void someMethod2() throws Exception {
		throw new Exception("Exception thrown in someMethod2");
	}
}
