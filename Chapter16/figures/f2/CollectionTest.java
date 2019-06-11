package chapter16.figures.f2;

/**
 *Figures 16.2 -   CollectionTest
 * 
 * Author: Handan Unal
 * 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		String[] colors = { "CYAN", "BLUE", "MAGENTA", "RED", "WHITE" };
		List<String> list = new ArrayList<String>();

		for (String color : colors) {
			list.add(color);
		}

		String[] removeColors = { "RED", "WHITE" };
		List<String> removeList = new ArrayList<String>();

		for (String color : removeColors) {
			removeList.add(color);
		}

		System.out.println("ArrayList : ");
		for (String color : list) {
			System.out.print(color + " ");
		}
		removeColors(list, removeList);
		System.out.println("\nArrayList after removing colors: ");

		for (String color : list) {
			System.out.print(color + " ");
		}
	}

	private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

		Iterator<String> iterator = collection1.iterator();

		while (iterator.hasNext()) {
			if (collection2.contains(iterator.next())) {
				iterator.remove();
			}
		}

	}

}
