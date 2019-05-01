/**
 *Exercises 14.3 -   Comparing Strings
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e3;

public class ComparingStrings {

	public static void main(String[] args) {

		String firstString = "Stefan P.";
		String secondString = "Handan U.";

		int result = firstString.compareTo(secondString);

		if (result == 0) {
			System.out.println(firstString + " is equal to " + secondString);
		} else if (result > 0) {
			System.out.println(firstString + " is greater than " + secondString);
		} else {
			System.out.println(firstString + " is smaller than " + secondString);
		}

	}

}
