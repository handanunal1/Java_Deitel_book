/**
 * Exercise 8.17 -  TicTacToe
 * 
 * Author: Handan Unal
 * 
 */

package Chapter08Exercises;

public class TicTacToe {

	private TicTacEnum[][] ticTacToe = new TicTacEnum[3][3];

	public TicTacToe() {
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe[i].length; j++) {
				ticTacToe[i][j] = TicTacEnum.EMPTY;
			}
		}
	}

	public void setTicTacToe(int i, int j, TicTacEnum value) {
		if(ticTacToe[i][j] == TicTacEnum.EMPTY) {
		ticTacToe[i][j] = value;
		}
		else {
			System.out.println("The index is taken!");
			System.out.println();
		}
	}

	public boolean Winner() {

		if (ticTacToe[0][0] != TicTacEnum.EMPTY) {
			if ((ticTacToe[0][0] == ticTacToe[1][1]) && (ticTacToe[1][1] == ticTacToe[2][2])) {

				return true;
			}
		}

		if (ticTacToe[0][2] != TicTacEnum.EMPTY) {
			if ((ticTacToe[0][2] == ticTacToe[1][1]) && (ticTacToe[1][1] == ticTacToe[2][0])) {

				return true;
			}
		}

		for (int j = 0; j <= 2; j++) {
			if ((ticTacToe[j][0] == ticTacToe[j][1]) && (ticTacToe[j][1] == ticTacToe[j][2])
					&& ticTacToe[j][0] != TicTacEnum.EMPTY) {
				return true;
			}
		}

		for (int j = 0; j <= 2; j++) {
			if ((ticTacToe[0][j] == ticTacToe[1][j]) && (ticTacToe[1][j] == ticTacToe[2][j])
					&& ticTacToe[0][j] != TicTacEnum.EMPTY) {
				return true;
			}
		}

		return false;

	}

	
	
	public void printList() {
		
		
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe[i].length; j++) {
				System.out.print(ticTacToe[i][j].name()+ " ");
			}
			System.out.println();
		}
	}
}
