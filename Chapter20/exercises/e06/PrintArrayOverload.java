package chapter20.exercises.e06;

public class PrintArrayOverload {

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
		String[] stringArray = { "one", "two", "three", "four", "five", "six", "seven", "eight" };

		printArray(stringArray);
	}

	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();

	}

	public static void printArray(String[] array) {
		int counter = 0;
		System.out.println("Array stringArray contains: ");
		for (String element : array) {
			counter++;

			System.out.printf("%-9s ",element);

			if (counter % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

}
