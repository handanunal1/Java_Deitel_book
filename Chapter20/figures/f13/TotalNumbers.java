package chapter20.figures.f13;

import java.util.ArrayList;

/**
 * Figures 20.13 TotalNumbers
 * 
 * Author: Handan Unal
 * 
 */
public class TotalNumbers {

	public static void main(String[] args) {
		Number[] numbers = { 1, 2.4, 3, 4.1 };

		ArrayList<Number> numberlist = new ArrayList<Number>();
		for (Number number : numbers) {
			numberlist.add(number);
		}

		System.out.println("NumberList contains  " + numberlist);
		System.out.println("Total  of elements number list is; " + sum(numberlist));
	}

	public static double sum(ArrayList<Number> numberList) {
		double total = 0;

		for (Number element : numberList) {
			total += element.doubleValue();
		}

		return total;
	}
}
