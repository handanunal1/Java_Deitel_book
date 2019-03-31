

/* Craps class simulates the dice game "Craps "*/
import java.security.SecureRandom;

public class Craps {

	private enum Status {
		CONTINUE, WON, LOST
	};

	public static final SecureRandom randomNumbers = new SecureRandom();
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myPoint = 0;
		Status gameStatus;

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;

		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;

		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.println("Point is " + sumOfDice);
			break;
		}

		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();

			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			} else {
				if (sumOfDice == 7) {
					gameStatus = Status.LOST;
				}
			}

		}

		if (gameStatus == Status.WON) {
			System.out.println("player wins");
		} else {
			System.out.println("player loses");
		}

	}

	public static int rollDice() {

		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		System.out.println("Player rolled " + (die1 + die2));
		return (die1 + die2);
	}
}
