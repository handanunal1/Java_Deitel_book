package chapter16.figures.f17;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		String[] colors = { "red", "white", "orange", "blue", "green", "gray", "orange", "tan", "white", "cyan",
				"peach", "gray", "orange" };
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors));
		System.out.println("Sorted set");
		printSet(tree);

		System.out.print("headSet (\"orange\"): ");

		printSet(tree.headSet("orange"));
		System.out.print("tailSet (\"orange\"): ");
		printSet(tree.tailSet("orange"));
		
		System.out.println("First element: "+tree.first());
		System.out.println("Last element: "+tree.last());
	}

	private static void printSet(SortedSet<String> tree) {
		for(String s:tree) {
			System.out.printf(s + " ");
			System.out.println();
		}

	}

}
