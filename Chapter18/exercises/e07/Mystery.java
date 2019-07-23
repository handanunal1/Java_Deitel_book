/**
 * Exercise 18.7 Mystery: Returns "b" parameter
 * 
 * Author: Handan Unal
 */

package chapter18.exercises.e07;

public class Mystery {

	public static void main(String[] args) {

		Mystery mystery = new Mystery();
		int result = mystery.mystery(1, 3);
		System.out.println(result);
		
		
		
		
		int resultSum = mystery.sum(3);
		System.out.println(resultSum);

	}

	public int mystery(int a, int b) {
		if (b == 1)
			return a;
		else
			return a + mystery(a, b - 1);
	}

	public int sum(int n) {
		if (n == 0)
			return 0;
		else
			
			//return n+ sum(n) -> The function does not converge on the base case
			return n + sum(n-1);
	}

}
