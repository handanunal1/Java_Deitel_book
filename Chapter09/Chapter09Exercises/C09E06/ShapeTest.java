/**
 * Exercise 9.6 - Shape Inheritance Hierarchy
 * 
 * Author: Handan Unal
 * 
 */
package Chapter09Exercises;

public class ShapeTest {

	public static void main(String[] args) {
		Square square = new Square(10);
		Circle circle = new Circle(3);
		System.out.println(square.toString());
		System.out.println(circle.toString());
	}

}
