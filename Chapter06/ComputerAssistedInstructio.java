import java.security.SecureRandom;
import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class ComputerAssistedInstructio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int a, b, level, answer, prompt;

		while (true) {
			System.out.println("Choose Level (1/2/-1 for quit): ");
			level = scan.nextInt();
			if (level == -1) {
				break;
			}
			SecureRandom secureNumber = new SecureRandom();
			if (level == 1) {
				a = 1 + secureNumber.nextInt(10);
				b = 1 + secureNumber.nextInt(10);
			} else {
				a = 10 + secureNumber.nextInt(90);
				b = 10 + secureNumber.nextInt(90);
			}

			System.out.println("How much is " + a + " times " + b);
			scan = new Scanner(System.in);
			answer = scan.nextInt();

			while (answer != a * b) {

				prompt = secureNumber.nextInt(3);
				switch (prompt) {
				case 0:
					System.out.println("Wrong.Try once more");
					break;
				case 1:
					System.out.println("Dont give up!");
					break;
				case 2:
					System.out.println("Keep trying!");
					break;
				default:
					break;
				}
				answer = scan.nextInt();
			}
			prompt = secureNumber.nextInt(3);
			switch (prompt) {
			case 0:
				System.out.println("Excellent");
				break;
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Nice work!");
				break;
			default:
				break;
			}
		}

	}
}
