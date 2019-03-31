/**
 * Exercise 9.6 - Shape Inheritance Hierarchy
 * 
 * Author: Handan Unal
 * 
 */

package Chapter09Exercises;

public class TwoDimensionalShape extends Shape {

	private double area;
	private double perimeter;

	public TwoDimensionalShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double calculatePerimeter() {
		return area;
	}

	public double calculateArea() {
		return perimeter;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Area is: "+calculateArea() + "\nPerimeter is: "+calculatePerimeter()+ "\n";
	}

}
