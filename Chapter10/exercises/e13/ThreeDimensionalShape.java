/**
 * Exercise 10.13 
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e13;

public abstract class ThreeDimensionalShape implements Shape {

	public abstract int getVolume();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
}
