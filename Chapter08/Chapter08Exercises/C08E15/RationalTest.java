/**
 * Exercise 8.15 - Rational Test
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class RationalTest {

	public static void main(String[] args) {
		Rational r1 = new Rational(2, 4);
		System.out.println("First rational number: " + r1);
		Rational r2 = new Rational(22, 5);
		System.out.println("Second rational number: " + r2);
		System.out.println("Addition result: "+Rational.addRational(r1, r2).toString());
		System.out.println("Subtraction result: "+Rational.subtractRational(r1, r2).toString());
		System.out.println("Multiply result: "+Rational.multiplyRational(r1, r2).toString());
		System.out.println("Division result: "+Rational.divideRational(r1, r2).toString());

	}

}
