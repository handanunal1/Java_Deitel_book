/**
 * Exercise 9.6 - Shape Inheritance Hierarchy
 * 
 * Author: Handan Unal
 * 
 */
package Chapter09Exercises;

public class Square extends TwoDimensionalShape {

	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return getSide()*4;
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return getSide()*getSide();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square "+ super.toString();
	}
}
