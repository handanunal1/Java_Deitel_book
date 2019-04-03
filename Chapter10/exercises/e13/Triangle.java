/**
 * Exercise 10.13 
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e13;

public class Triangle extends TwoDimensionalShape {

	public double height;
	public double width;

	public Triangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (getWidth()*getHeight())/2;
	}
	

}
