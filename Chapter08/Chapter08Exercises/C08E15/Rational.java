/**
 * Exercise 8.15 - Rational Numbers
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class Rational {

	private int numerator;
	private int denominator;

	public Rational(int numerator, int denominator) {

		this.numerator = numerator;
		this.denominator = denominator;

		int gcd = 1;

	
		for (int i = 1; i <= numerator && i <= denominator; ++i) {
			// Checks if i is factor of both integers
			if (numerator % i == 0 && denominator % i == 0)
				gcd = i;
		}

		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;

	}

	public Rational() {

	}

	public static Rational addRational(Rational r1, Rational r2) {

		Rational result = new Rational(((r1.denominator * r2.numerator) + (r2.denominator * r1.numerator)),
				(r1.denominator * r2.denominator));
		return result;

	}

	public static Rational subtractRational(Rational r1, Rational r2) {

		if ((r1.denominator * r2.numerator) > (r2.denominator * r1.numerator)) {

			Rational result = new Rational(((r1.denominator * r2.numerator) - (r2.denominator * r1.numerator)),
					(r1.denominator * r2.denominator));
			return result;

		} else {
			Rational result = new Rational(((r2.denominator * r1.numerator) - (r1.denominator * r2.numerator)),
					(r1.denominator * r2.denominator));
			return result;
		}

	}

	public static Rational multiplyRational(Rational r1, Rational r2) {

		Rational result = new Rational((r1.numerator*r2.numerator),
				(r1.denominator * r2.denominator));
		return result;

	}

	public static Rational divideRational(Rational r1, Rational r2) {


		Rational result = new Rational((r1.numerator*r2.denominator),
				(r1.denominator * r2.numerator));
		return result;

	}

	public String toString() {

		return (this.numerator + "/" + this.denominator);
	}

	public String toStringDouble() {

		double result;
		result = (double) (this.numerator / this.denominator);
		return Double.toString(result);

	}

}
