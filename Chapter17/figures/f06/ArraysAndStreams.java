/**
 * Figures 17.06  ArraysAndStreams
 * 
 * Author: Handan Unal
 * 
 */
package chapter17.figures.f06;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class ArraysAndStreams {

	public static void main(String[] args) {
		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };

		System.out.println("Original values: " + Arrays.asList(values));
		System.out.println("Sorted values  : " + Arrays.stream(values).sorted().collect(Collectors.toList()));

		List<Integer> greaterThan4 = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
		System.out.println("Values greater than 4 : " +  greaterThan4);
		
		System.out.println("Sorted values greater than 4 : " + Arrays.stream(values).filter(value -> value > 4).sorted().collect(Collectors.toList()));
		
		System.out.println("Values with streams values greater than 4 : " + greaterThan4.stream().filter(value -> value > 4).sorted().collect(Collectors.toList()));
		
		
	}

}
