/**
 * Exercises 17.08  LambdaRandom
 * 
 * Author: Handan Unal
 * First the SecureRandom -> random object generates number from 1 to 3, 10000000 times. 
 * "Boxed" returns a stream.
 *  Collectors makes reduction on the strean using "groupingBy"
 *  Returns a map, and In the map, each element is on output.
 */

package chapter17.exercises.e08;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaRandom {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		random.ints(1000000, 1, 3).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  
				.forEach((side, frequency) -> System.out.println("Side " + side + " frequency" + frequency));
	}

}
