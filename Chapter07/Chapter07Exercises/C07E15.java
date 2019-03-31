/**
 * Exercise 7.15 - Duplicate Elimination
 * Size of array is supplied by command line argument. 
 * if it is zero,default size = 10.
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

public class C07E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		if (args.length == 1) {
			number = Integer.parseInt(args[0]);
		} else {
			number = 10;
		}

		int[] Array = new int[number];

		for (int i = 0; i < Array.length; i++) {
			System.out.println(i);
		}
	}

}
