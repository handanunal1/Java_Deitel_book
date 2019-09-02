package chapter21.exercises.e13;
/**
 * Exercise 13  PostfixEvaluator
 * 
 * @author Handan
 */
import chapter21.exercises.e12.EmptyListException;
import chapter21.exercises.e12.StackCompositions;

public class PostfixEvaluator {
	public static void main(String[] args) throws EmptyListException {
		String postfix = "34+37*+";

		StackCompositions<Character> stackPostfix = new StackCompositions<Character>();
		System.out.println("Result of postfix "+postfix+" expression is "+evaluatePostfix(postfix));

	}

	public static int evaluatePostfix(String exp) throws EmptyListException {

		StackCompositions<Integer> stackInteger = new StackCompositions<Integer>();

		for (int i = 0; i < exp.length(); i++) {

			char c = exp.charAt(i);

			if (Character.isDigit(c)) {
				stackInteger.push(c - '0');
			} else {
				int val1 = stackInteger.pop();
				int val2 = stackInteger.pop();

				switch (c) {
				case '+':
					stackInteger.push(val1 + val2);
					break;
				case '-':
					stackInteger.push(val1 - val2);
					break;
				case '/':
					stackInteger.push(val1 / val2);
					break;
				case '*':
					stackInteger.push(val1 * val2);
					break;
				case '%':
					stackInteger.push(val1 % val2);
					break;
				default:
					break;
				}
			}
		}

		return stackInteger.pop();

	}

}
