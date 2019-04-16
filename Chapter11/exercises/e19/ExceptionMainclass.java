/**
 * Exercise 11.9 -  Constructor Failur
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e19;

public class ExceptionMainclass {

	public static void main(String[] args) {
		try {
			System.out.println("ss");
			SomeClass someClass = new SomeClass();
		} catch (Exception e) {
		
		System.out.println(e +" exception from SomeClass Constructor");
	}
	}

}
