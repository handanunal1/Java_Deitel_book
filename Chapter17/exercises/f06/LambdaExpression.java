/**
 * Exercises 17.06 LambdaExpression
 * 
 * Author: Handan Unal
 * 
 */
package chapter17.exercises.f06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class LambdaExpression {
	interface Sayable {
		public String say();
	}

	public static void main(String[] args) {

		double a = 23.4;
		double b = 33.4;
		double[] values = { 2.0, 3.0 };
		System.out.println("Sum  of double values  : " + DoubleStream.of(values).sum());
		System.out.println("Sum  of double values  : " + DoubleStream.of(a, b).sum());

		Sayable s = () -> {
			return "Welcome to lambdas!";
		};
		System.out.println(s.say());
		
		/* Constructor reference for ArrayList */
		List<String> strList = Arrays.asList("1", "2", "3");
		List<Integer> intList = strList.stream().map(Integer::new).collect(Collectors.toList());
		
		intList.forEach (e -> System.out.println(e) );
	}


	
	


}
