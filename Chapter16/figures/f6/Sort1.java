package chapter16.figures.f6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Figures 16.6 sort
 * 
 * Author: Handan Unal
 * 
 */
public class Sort1 {

	public static void main(String[] args) {
		String[] suits = { "Hearts", "Diamonds", "Club", "Spades" };
		List<String> list = Arrays.asList(suits);
		System.out.printf("Unsorted array elements: %s%n", list);
		Collections.sort(list);
		System.out.println("Sorted array elements:   "+ list);
	}

}
