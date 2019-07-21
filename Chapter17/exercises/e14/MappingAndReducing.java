package chapter17.exercises.e14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MappingAndReducing {

	public static void main(String[] args) {
		int[] values = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };

		System.out.println("Original values: ");
		IntStream.of(values).forEach(value -> System.out.printf("%d ", value));

		System.out.println();

		System.out.println("Count: " + IntStream.of(values).count());
		System.out.println("Minimum: " + IntStream.of(values).min().getAsInt());
		System.out.println("Maximum: " + IntStream.of(values).max().getAsInt());
		System.out.println("Sum    : " + IntStream.of(values).sum());
		System.out.println("Average: " + IntStream.of(values).average().getAsDouble());

		System.out.println("Sum via reduce method: " + IntStream.of(values).reduce(0, (x, y) -> x + y));
		// sum of squares of values with reduce method

		List<Integer> numbers = Arrays.stream(values).boxed().collect(Collectors.toList());
		Function<Integer, Integer> square = x -> x * x;

		// Changed by mapping/
		System.out.println(
				"Sum of squares via reduce method: " + numbers.stream().map(square).reduce(0, (x, y) -> x + y));

		System.out.println("Product via reduce method: " + IntStream.of(values).reduce(1, (x, y) -> x * y));
		System.out.print("Even values displayed in sorted order: ");
		IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.print(value + " "));
		System.out.print("\nOdd values displayed in sorted order:  ");
		IntStream.of(values).filter(value -> value % 2 == 1).sorted().forEach(value -> System.out.print(value + " "));
		System.out.println("\nSum of integers from 1 to 10: " + IntStream.range(1, 10).sum());
		System.out.println("Sum of integers from 1 to 10: " + IntStream.rangeClosed(1, 10).sum());

		System.out.println(IntStream.of(values).summaryStatistics());

	}

}
