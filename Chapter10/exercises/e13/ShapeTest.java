/**
 * Exercise 10.13 
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e13;

import javax.sound.midi.Soundbank;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] arrayShape = new Shape[4];
		arrayShape[0] = new Square(10, 20);
		arrayShape[1] = new Circle(30);
		arrayShape[2] = new Triangle(3, 4);
		arrayShape[3] = new Cube(10);

		System.out.println("Shapes in the array: ");
		for (Shape a : arrayShape) {
			System.out.print(a.toString());

			if (a instanceof TwoDimensionalShape) {
				System.out.print(" is a Two Dimensional Shape");
			} else if (a instanceof ThreeDimensionalShape) {
				System.out.print(" is a Three Dimensional Shape");
			}
			System.out.println();
		}
	}

}
