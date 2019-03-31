/**
* Exercise 7.35 -(SML COMPUTER)
* Author: Handan Unal
* The first two digits of each SML instruction
* are the operation code specifying the operation to be performed. 
* The last two digits of an SML instruction are the operand—the address 
* of the memory location containing the word to which the operation applies.
*/

package Chapter07Exercises;

import java.util.Scanner;

public class C07E35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int READ = 10;
		final int WRITE = 11;
		final int LOAD = 20;
		final int STORE = 21;
		final int ADD = 30;
		final int SUBTRACT = 31;
		final int DIVIDE = 32;
		final int MULTIPLY = 33;
		final int BRANCH = 40;
		final int BRANCHNEG = 41;
		final int BRANCHZERO = 42;
		final int HALT = 43;

		int[] SimpletronArray = new int[100];

		Scanner scanner = new Scanner(System.in);
		int instructionNumber;
		int accumulator = 0;
		System.out.println("Please enter the 4 digit instruction: ");
		instructionNumber = scanner.nextInt();
		while (instructionNumber != HALT) {

			int instruction = (instructionNumber / 100);
			switch (instruction) {
			case READ:
				System.out.println("Enter the number for READ Instruction: ");
				int number = scanner.nextInt();
				SimpletronArray[instructionNumber % 100] = number;
				break;
			case WRITE:
				System.out.println("WRITE");
				System.out.println("The result: " + SimpletronArray[instructionNumber % 100]);
				break;
			case LOAD:
				System.out.println("LOAD");
				accumulator = SimpletronArray[instructionNumber % 100];
				break;
			case STORE:
				System.out.println("STORE");
				SimpletronArray[instructionNumber % 100] = accumulator;
				break;
			case ADD:
				System.out.println("ADD");
				accumulator = accumulator + SimpletronArray[instructionNumber % 100];
				break;
			case SUBTRACT:
				System.out.println("SUBTRACT");
				accumulator = accumulator - SimpletronArray[instructionNumber % 100];
				break;
			case MULTIPLY:
				System.out.println("MULTIPLY");
				accumulator = accumulator * SimpletronArray[instructionNumber % 100];
				break;
			case DIVIDE:
				System.out.println("DIVIDE");
				accumulator = accumulator / SimpletronArray[instructionNumber % 100];
				break;

			default:
				break;
			}
			System.out.println("Please enter the 4 digit instruction: ");
			instructionNumber = scanner.nextInt();

		}

	}

	public static void FirstProgram() {

	}

}
