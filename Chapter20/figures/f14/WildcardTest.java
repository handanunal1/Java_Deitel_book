package chapter20.figures.f14;

import java.util.ArrayList;

/**
 * Figures 20.14 WildCardTest
 * 
 * Author: Handan Unal
 * 
 */
public class WildcardTest {

	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> integerList = new ArrayList<>();

		for (Integer integer : integers) {
			integerList.add(integer);
		}

		System.out.println("IntegerList contains " + integerList);
		System.out.println("The sum of integerList is " + sum(integerList));

		Double[] doubles = { 1.1, 2.2, 3.4, 4.4 };
		ArrayList<Double> doubleList = new ArrayList<>();

		for (Double element : doubles) {
			doubleList.add(element);
		}

		System.out.println("DoubleList contains " + doubleList);
		System.out.printf("Total of the elements in doubleList: %.1f\n",sum(doubleList));

		Number[] numbers = { 1, 2, 3.3, 4, 5.5 };
		ArrayList<Number> numberList = new ArrayList<>();

		for (Number element : numbers) {
			numberList.add(element);
		}
		System.out.println("NumberList contains " + numberList);
		System.out.println("Total of the elements in numberlist" + sum(numberList));

	}

	public static double sum(ArrayList<? extends Number> list) {

		double total = 0;

		for (Number element : list) {
			total += element.doubleValue();
		}

		return total;
	}

}
