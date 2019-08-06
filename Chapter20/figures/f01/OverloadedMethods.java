/**
 * Figure 20.05   OverloadedMethods
 */
package chapter20.figures.f01;

public class OverloadedMethods {

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array IntegerArray contains:");
		printArray(integerArray);
		System.out.println("Array DoubleArray contains:");
		printArray(doubleArray);
		System.out.println("Array CharacterArray contains:");
		printArray(characterArray);
	}

//	public static void printArray(Integer[] integerArray) {
//		for (Integer element : integerArray) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//	}
//
//	public static void printArray(Double[] doubleArray) {
//		for (Double element : doubleArray) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//	}
//
//	public static void printArray(Character[] characterArray) {
//		for (Character Element : characterArray) {
//			System.out.print(Element + " ");
//		}
//		System.out.println();
//
//	}

	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();

	}
}
