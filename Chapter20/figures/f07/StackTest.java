/**
 * 
 */
package chapter20.figures.f07;

import java.util.EmptyStackException;

/**
 * @author Handan
 *
 */
public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] doubleElements = { 1.1, 2.2 ,3.3 ,4.4, 5.5};
		int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> IntegerStack = new Stack<>();

		testPushDouble(doubleStack, doubleElements);
		testPopDouble(doubleStack); // pop from doubleStack

		testPushInteger(IntegerStack, integerElements);
		testPopInteger(IntegerStack);
	}

	private static void testPushDouble(Stack<Double> stack, double[] values) {
		System.out.printf("%nPushing elements onto doubleStack%n");
		for (double value : values) {
			stack.push(value);
		}

	}

	private static void testPopDouble(Stack<Double> stack) {

		try {
			System.out.printf("%nPopping elements from doubleStack%n");
			double popValue; // store element removed from stack

			while (true) {
				popValue = stack.pop(); // pop from doubleStack
				System.out.println(popValue);
			}
		}

		catch (EmptyStackException emptyStackException) {
			System.err.println();
			emptyStackException.printStackTrace();
		}

	}
	
	

	private static void testPushInteger(Stack<Integer> stack, int[] values) {
		System.out.printf("%nPushing elements onto doubleStack%n");
		for (int value : values) {
			stack.push(value);
		}

	}

	private static void testPopInteger(Stack<Integer> stack) {

		try {
			System.out.printf("%nPopping elements from doubleStack%n");
			int popValue; // store element removed from stack

			while (true) {
				popValue = stack.pop(); // pop from doubleStack
				System.out.println(popValue);
			}
		}

		catch (EmptyStackException emptyStackException) {
			System.err.println();
			emptyStackException.printStackTrace();
		}

	}
	
}
