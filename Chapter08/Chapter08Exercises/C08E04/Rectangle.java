/**
 * Exercise 8.10 - Enum type
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		super();
		setLength(length);
		setWidth(width);
	}
	
	public void setLength(double length) {
		if (length > 0 || length < 20.0) {
			this.length = length;
		}
	}

	public void setWidth(double width) {
		if (width > 0 || width < 20.0) {
			this.width = width;
		}
	}

	public double area() {

		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);

	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	
	
}
