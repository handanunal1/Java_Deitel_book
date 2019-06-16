package chapter16.figures.f7;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Figures 16.6 sort2
 * 
 * Author: Handan Unal
 * 
 */
public class Sort2 {

	public static void main(String[] args) {
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		List<String> list = Arrays.asList(suits);
		System.out.println("Unsorted Array Elements:   " + list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted Array Elements:   " + list);
	}

}
