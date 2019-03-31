/**
 * Exercise 7.10 - Sales Commissions  
 * Use a one-dimensional array to solve the following problem: 
 * A company pays its salespeople on a commission basis.
 * The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, 
 * a salesperson who grosses $5000 in sales in a week receives $200 plus 9% of $5000, or a total of $650. 
 * Write an application (using an array of counters
 * 
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

import java.util.Scanner;

public class C07E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] frequency = new int[11];
		int counter = 1;
		System.out.println("Enter the total of salesperson or -1 to exit: ");
		int input = scanner.nextInt();
		while (input != -1) {

			int salesCommision = CalculateWithCommision(input);

			if (salesCommision < 1000) {
				frequency[salesCommision / 100]++;
			} else {
				frequency[10]++;
			}

			input = scanner.nextInt();
			counter++;

		}

		for (int i = 2; i < frequency.length; i++) {
			if (i == 10) {
				System.out.printf("$%d00+   : %d\n", i, frequency[i]);
			} else {
				System.out.printf("$%d00-$%d99: %d\n", i, i, frequency[i]);
			}
		}

		scanner.close();
	}

	public static int CalculateWithCommision(int input) {
		int withCommision = (input * 9 / 100) + 200;
		return withCommision;
	}

}
