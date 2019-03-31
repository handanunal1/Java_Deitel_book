/**
 * Exercise 8.13 -  Set of Integers
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class IntegerSet {

	private boolean[] array = new boolean[100];

	public IntegerSet() {

		for (int i = 0; i < array.length; i++) {
			array[i] = false;
		}
	}

	public static IntegerSet union(IntegerSet integerSet1, IntegerSet integerSet2) {
		IntegerSet union = new IntegerSet();

		for (int i = 0; i < integerSet1.array.length; i++) {

			if (integerSet1.array[i] || integerSet2.array[i]) {
				union.array[i] = true;
			} else {
				union.array[i] = false;
			}

		}

		return union;
	}

	public static IntegerSet intersection(IntegerSet integerSet1, IntegerSet integerSet2) {
		IntegerSet intersection = new IntegerSet();

		for (int i = 0; i < integerSet1.array.length; i++) {

			if ((!integerSet1.array[i]) || (!integerSet2.array[i])) {
				intersection.array[i] = false;
			} else {
				intersection.array[i] = true;
			}

		}

		return intersection;
	}

	public void insertElement(int k) {

		if (k >= 0 && k < 100) {
			this.array[k] = true;
		}
	}

	public void deleteElement(int k) {

		if (k >= 0 && k < 100) {
			this.array[k] = false;
		}
	}

	public String toString() {

		String arrayString = "";

		for (int i = 0; i < this.array.length; i++)

			if (array[i]) {

				arrayString += i + " ";

			}
		return arrayString.equals("") ? "---" : arrayString;

	}

	public static boolean isEqual(IntegerSet integerSet1, IntegerSet integerSet2) {
		boolean isEqual = false;
		for (int i = 0; i < integerSet1.array.length; i++) {
			if (integerSet1.array[i] == integerSet1.array[2]) {
				isEqual = true;
			}
		}

		return isEqual;
	}
}
