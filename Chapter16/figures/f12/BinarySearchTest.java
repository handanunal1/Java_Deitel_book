package chapter16.figures.f12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Figures 16.12 BinarySearchTest
 * 
 * Author: Handan Unal
 * 
 */
public class BinarySearchTest {

	public static void main(String[] args) {
		String[] colors = { "Blue", "Purple", "Green", "Gray", "Cyan", "Magenta" };

		List<String> list = new ArrayList<>(Arrays.asList(colors));

		Collections.sort(list);
		System.out.println("Sorted ArrayList: " + list);

		printSearchResults(list, "Black");
		printSearchResults(list, "Purple");
		printSearchResults(list, "Gray");
		printSearchResults(list, "Teal");

		

	}

	private static void printSearchResults(List<String> list, String key) {
		int result = 0;

		System.out.println("Searching for key " + key);
		result = Collections.binarySearch(list, key);

		if (result >= 0) {
			System.out.println("Found at index " + result);
		} else {
			System.out.println("Not found");
		}

	}

}
