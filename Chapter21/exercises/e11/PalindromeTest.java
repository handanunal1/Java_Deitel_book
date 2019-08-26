package chapter21.exercises.e11;

import java.util.Scanner;

/**
 * Exercise 11 PalindromeTest
 * 
 * @author Handan
 */
public class PalindromeTest {

	public static void main(String[] args) throws EmptyListException {

		System.out.println("Please write a sentence to check Palindrome: ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		StackCompositions<String> stackString = new StackCompositions<String>();
		boolean result = CheckPalindromeSentence(sentence);

		System.out.println("Is the string palindrome? " + result);
	}

	public static <T> boolean CheckPalindromeSentence(String sentence) throws EmptyListException {

		boolean isPalindrome = false;
		StackCompositions<T> stack1 = new StackCompositions<T>();

		String[] stringList = sentence.split(" ");
		for (String word : stringList) {
			stack1.push((T) word);
		}

		for (String word : stringList) {
			String word2 = (String) stack1.pop();
			String reverse = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				reverse = reverse + word.charAt(i);
			}
			if (reverse.equals(word2)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}

		}

		return isPalindrome;
	}

}
