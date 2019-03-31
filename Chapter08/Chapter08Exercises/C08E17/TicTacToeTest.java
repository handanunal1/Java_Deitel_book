/**
 * Exercise 8.17 -  TicTacToeTest
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

import java.util.Scanner;

public class TicTacToeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe ticTacToe = new TicTacToe();

		TicTacEnum player1 = TicTacEnum.X;
		TicTacEnum player2 = TicTacEnum.O;

		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Player 1: ");

		int input = scanner.nextInt();
		counter = 1;
		while (input < 9 && input >= 0) {

			int x = (input / 3);
			int y = (input % 3);

			if (counter % 2 == 1) {
				ticTacToe.setTicTacToe(x, y, player1);
				ticTacToe.printList();
				if (ticTacToe.Winner()) {
					System.out.println("first player is winner");
					return;
				}
			} else {
				ticTacToe.setTicTacToe(x, y, player2);
				ticTacToe.printList();
				if (ticTacToe.Winner()) {
					System.out.println("second player is winner");
					return;
				}
			}
			System.out.println("Player "+((counter%2)+1)+": ");
			input = scanner.nextInt();
			counter++;
		}

		counter++;

	}

}
