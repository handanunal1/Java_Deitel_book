/**
 * Exercise 7.29 -(Fibonacci Series)
  * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

class C07E29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Fibonacci(7));
		System.out.println(Fibonacci(5.0));
	}

	public static int Fibonacci(int n) {

		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;

		}

		return c;
	}

	public static double Fibonacci(double n) {

		double a = 0;
		double b = 1;
		double c = 0;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}

}
