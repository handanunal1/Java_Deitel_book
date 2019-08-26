package chapter21.exercises.e10;

import java.util.Scanner;

/**
 * Exercise 10 ReverseSentence
 * 
 * @author Handan
 */
public class ReverseSentence {

	public static void main(String[] args) {

		System.out.println("Please write a sentence for make reverse: ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		StackCompositions<String> stackString = new StackCompositions<String>();
		reverseSentence(stackString, sentence);

	}

	public static <T> void reverseSentence(StackCompositions<T> stack, String sentence) {

		String[] stringList = sentence.split(" ");
		for (String word : stringList) {
			stack.push((T) word);
		}
		stack.Print();
	}

}
