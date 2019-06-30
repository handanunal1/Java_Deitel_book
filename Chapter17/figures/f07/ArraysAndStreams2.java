/**
 * Figures 17.07  ArraysAndStreams2
 * 
 * Author: Handan Unal
 *  (the output is different)
 * 
 */
package chapter17.figures.f07;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {

	public static void main(String[] args) {
		String[] strings = { "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet" };
		System.out.println("Original strings: " + Arrays.asList(strings));

		System.out.println(
				"String uppercase: " + Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

		System.out.println("Strings greater than m sorted ascending: "
				+ Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0)
						.sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));
		
		
		System.out.println("Strings greater than m sorted descending: "
				+ Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0)
						.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
		
		


	}

}
