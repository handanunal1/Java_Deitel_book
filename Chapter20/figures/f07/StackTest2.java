/**
 * 
 */
package chapter20.figures.f07;

import java.util.EmptyStackException;

/**
 * Figures 20.10 Stack.Test2
 * 
 * Author: Handan Unal
 * 
 */
public class StackTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> IntegerStack = new Stack<>();

		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack); 

		testPush("integerStack", IntegerStack, integerElements);
		testPop("integerStack", IntegerStack);

	}

	public static <T> void testPush(String name, Stack<T> stack, T[] elements) {
		for (T element : elements) {
			stack.push(element);
		}
	}

	public static <T> void testPop(String name, Stack<T> stack) {
		try {
			T popValue;

			while (true) {
				popValue = stack.pop();
				System.out.println(popValue);
			}
		} catch (EmptyStackException emptyStackException) {
			emptyStackException.printStackTrace();
		}
	}
}
