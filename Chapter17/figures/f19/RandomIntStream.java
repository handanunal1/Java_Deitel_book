/**
 * Figures 17.19   RandomIntStream
 * 
 * Author: Handan Unal
 * 
 * 
 */
package chapter17.figures.f19;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {

	public static void main(String[] args) {
		SecureRandom secureRandom = new SecureRandom();
		System.out.printf("%-6s%s%n", "Face", "Frequency");
		secureRandom.ints(6000000, 1, 7).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));
	}

}
