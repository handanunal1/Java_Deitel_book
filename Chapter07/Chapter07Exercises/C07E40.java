
/**
 * Exercise 7.40 - Polling  
 * Use a one-dimensional array to solve the following problem
 * 
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

import java.security.SecureRandom;

public class C07E40 {

	public static void main(String[] args) {

		String[] topics = { "Global Warming   ", "Unemployement    ", "Gender inequality", "Food Crysis      ",
				"Global Wars      " };
		int[][] response = new int[5][10];
		SecureRandom random = new SecureRandom();
		System.out.println("Polling of Topics; ");
		int answer = 0;
		int counter = 0;
		double average = 0;
		int highest = 0;
		int lowest = 100;
		int lowCount = 0;
		int highCount = 0;
		while (counter < 10 && answer > -1) {
			System.out.println(
					"There are five questions below; please answer between 1 - 10, for quitting press '-1' : ");
			for (int i = 0; i < 5; i++) {
				System.out.print("What is the importance of " + topics[i]);
				answer = 1 + random.nextInt(9);
				System.out.print(" " + answer);
				response[i][counter] = answer;
				System.out.println();
			}
			counter++;
		}

		for (int i = 0; i < response.length; i++) {
			average = 0;
			System.out.print(topics[i]);
			for (int j = 0; j < response[i].length; j++) {
				System.out.print(response[i][j] + " ");
				average = average + response[i][j];
			}
			if (highest < average) {
				highest = (int) average;
				highCount = i;
			}
			if (lowest > average) {
				lowest = (int) average;
				lowCount = i;
			}

			average = (double) average / 10;
			System.out.print("Average: " + average);
			System.out.println("");
		}
		System.out.println(topics[highCount] + "has Highest points  " + highest);
		System.out.println(topics[lowCount] + "has Lowest  points  " + lowest);
	}

}
