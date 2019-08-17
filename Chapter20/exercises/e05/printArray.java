package chapter20.exercises.e05;

public class printArray {

	private static final Exception IndexOutOfBoundsException = null;

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array IntegerArray contains:");
		printArray(integerArray, 1, 2);
		System.out.println("Array DoubleArray contains:");
		printArray(doubleArray, 2, 4);
		System.out.println("Array CharacterArray contains:");
		printArray(characterArray, 1, 4);
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

	public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript) {

		try {
			if (highSubscript > inputArray.length || lowSubscript < 0) {
				throw IndexOutOfBoundsException;
			}

			for (int i = lowSubscript; i < highSubscript; i++) {
				System.out.print(inputArray[i] + " ");
			}
			System.out.println();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
