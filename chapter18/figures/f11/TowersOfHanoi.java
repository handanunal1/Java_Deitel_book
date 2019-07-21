/**
 * Exercise 18.11 Towers of hanoi
 * 
 * Author: Handan Unal
 * 
 */
package chapter18.figures.f11;

public class TowersOfHanoi {

	public static void main(String[] args) {
		int startPeg = 1; // value 1 used to indicate startPeg in output
		int endPeg = 3; // value 3 used to indicate endPeg in output
		int tempPeg = 2; // value 2 used to indicate tempPeg in output
		int totalDisks = 3; // number

		solveTowers(totalDisks, startPeg, endPeg, tempPeg);

	}

	public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {

		if (disks == 1) {
			System.out.println(sourcePeg + " -> " + destinationPeg);
			return;
		}

		solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
		System.out.println( sourcePeg +" -> "+ destinationPeg);

		solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
	}

}
