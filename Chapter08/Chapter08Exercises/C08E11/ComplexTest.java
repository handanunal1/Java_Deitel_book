/**
 * Exercise 8.12 - Complex Number Test
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

import javax.sound.midi.Soundbank;

public class ComplexTest {

	public static void main(String[] args) {

		Complex complex1 = new Complex(2.0,4.0);
		Complex complex2 = new Complex(3.0,5.0);
		
		System.out.println(complex1.toString());
		System.out.println(complex2.toString());
		complex1.add(complex2);
		System.out.println(complex1.toString());
		complex1.Subtract(complex2);
		System.out.println(complex1.toString());
			
	}

}
