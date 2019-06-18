package chapter16.figures.f16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Figures 16.16 SetTest;
 * 
 * Author: Handan Unal
 * 
 */
public class SetTest {

	public static void main(String[] args) {
		String[] colors = { "red", "white","orange", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
				"orange" };
		List<String> list = Arrays.asList(colors);
		System.out.println(list);

		printNonDuplicates(list);
	}

	private static void printNonDuplicates(Collection<String> list) {
		Set<String> setString = new HashSet<>(list);
		System.out.println("Nonduplicates are: ");

		for (String token : setString) {

			System.out.println(token);
		}
	}

}
