/**
 * Exercises 17.06LambdaExpression
 * 
 * Author: Handan Unal
 * 
 */
package chapter17.exercises.f06;

import java.util.stream.DoubleStream;


public class LambdaExpression {

	public static void main(String[] args) {
		double a = 23.4;
		double b = 33.4;
		double[] values = {2.0,3.0};
		System.out.println("Sum  of double values  : " + DoubleStream.of(values).sum());
		System.out.println("Sum  of double values  : " + DoubleStream.of(a,b).sum());
	}

}