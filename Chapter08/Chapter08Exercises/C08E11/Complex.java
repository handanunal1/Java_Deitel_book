/**
 * Exercise 8.11 - Complex Number Class
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class Complex {

	private double realPart;
	private double imagineryPart;
	private final int Complex = (int) Math.sqrt(-1);

	public Complex() {
	}

	public Complex(double realPart, double imagineryPart) {
		this.realPart = realPart;
		this.imagineryPart = imagineryPart;
	}

	public void add(Complex number) {

		this.realPart = number.realPart + this.realPart;
		this.imagineryPart = number.imagineryPart + this.imagineryPart;
	}
	
	public void Subtract(Complex number) {

		this.realPart = this.realPart-number.realPart;
		this.imagineryPart =this.imagineryPart-number.imagineryPart;
	}

	public String toString() {
		return String.format("(%.2f, %.2f)", realPart, imagineryPart);
	} // end method toComplexString;

}
