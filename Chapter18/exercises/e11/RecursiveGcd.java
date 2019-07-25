/**
 * Exercise 18.11 RecursiveGcd 
 * 
 * Author: Handan Unal
 */
package chapter18.exercises.e11;

public class RecursiveGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = recGcd(1220, 200);
		System.out.println("Result of gcd " + result);
	}

	public static int recGcd(int x, int y) {

		if (y == 0) {
			return x;
		} else {
			return recGcd(y, x % y);
		}

	}

}
