/**
 * Exercise 7.17 - Dice Rolling  
 * Write an application for Dice Rolling
 * The application should use an object of class Random once to roll the first die and again to roll the second die
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

import java.security.SecureRandom;

public class C07E17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom sRandom = new SecureRandom();
		int frequency[] = new int[13];
		int dice1, dice2;

		for (int i = 0; i < 36; i++) {
			dice1 = 1 + sRandom.nextInt(6);
			dice2 = 1 + sRandom.nextInt(6);

			frequency[dice1 + dice2]++;
		}
		

		for (int i = 2; i < frequency.length; i++) {
			System.out.println(i + " " + frequency[i]);
		}

	}

}
