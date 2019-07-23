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

	}

	public int mystery(int a, int b) {
		if (b == 1)
			return a;
		else
			return a + mystery(a, b - 1);
	}

}
