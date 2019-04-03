/**
 * Exercise 10.13 
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e13;

public class Circle extends TwoDimensionalShape {
	double radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return  (getRadius()*getRadius()* Math.PI);
	}

}
