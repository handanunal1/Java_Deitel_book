/**
 * Exercise 7.14 - Sales Commissions  
 * Write an application that uses an enhanced for statement to sum the double values passed by the command-line arguments.
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

public class C07E16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double total = 0;
		for(String member: args) {
			total = total + Double.parseDouble(member);
		}
		
		System.out.println("Sum of Arguments: "+ total);
	}

}
