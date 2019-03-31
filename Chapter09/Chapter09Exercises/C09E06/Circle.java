/**
 * Exercise 9.6 - Shape Inheritance Hierarchy
 * 
 * Author: Handan Unal
 * 
 */

package Chapter09Exercises;

public class Circle extends TwoDimensionalShape {

	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return getRadius() * getRadius() * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getRadius();
	}

	@Override
	public String toString() {

		return "Circle " + super.toString();
	}
}
