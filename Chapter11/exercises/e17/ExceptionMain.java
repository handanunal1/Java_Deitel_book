/**
 * Exercise 11.7 -  Catching Exceptions Using Class Exception
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e17;

import java.io.IOException;

public class ExceptionMain {

	public static void main(String[] args) {

		
		System.out.println("Catching Exceptions Using Class Exception:  ");
		try {
			throw new ExceptionA();
		} catch (Exception exception) {
			System.out.println(exception + " is caught");
		}
		try {
			throw new ExceptionB();
		} catch (Exception exception) {
			System.out.println(exception + " is caught");
		}

		try {
			throw new NullPointerException();
		} catch (Exception exception) {
			System.out.println(exception + " is caught");
		}

		try {
			throw new IOException();
		} catch (Exception exception) {
			System.out.println(exception + " is caught");
		}
	}

}
