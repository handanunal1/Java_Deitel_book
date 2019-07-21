package chapter18.figures.f03;

public class FactorialCalculator {

	public static void main(String[] args) {

		for (int i = 1; i < 21; i++) {
			System.out.println("Number: "+i+ "Factorial of number: " + Factorial(i));
		}

	}

	public static long Factorial(long number) {

		if (number <= 1)
			return 1;

		else
			return number * Factorial(number - 1);

	}

}
