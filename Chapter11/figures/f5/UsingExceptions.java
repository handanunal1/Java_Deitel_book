/**
 *Exercise 11.5 -  UsingExceptions
 * 
 * Author: Handan Unal
 * 
 */
package figures.f5;

public class UsingExceptions {

	public static void main(String[] args) {
		try {
			throwException();

		} catch (Exception e) {
			System.err.println("Exception is handled in the main");
		}
		
		doesNotThrowException();

	}

	private static void throwException() throws Exception {
		try {

			System.out.println("Method throwException");
			throw new Exception();

		} catch (Exception exception) {
			System.err.println("Exception handled in method throwException");
			throw exception; // rethrow for further processing

		} finally {
			System.err.println("Finally executed in throwException");
		}

	}

	private static void doesNotThrowException() {

		try {
			System.out.println("Method doesNotThrowException");
		} catch (Exception exception) {
			System.err.println(exception);
		}

		finally {
			System.err.println("Finally executed in doesNotThrowException");
		}
		
		 System.out.println("End of method doesNotThrowException"); 
	}

}




