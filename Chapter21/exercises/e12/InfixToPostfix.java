package chapter21.exercises.e12;

import java.io.PushbackInputStream;

import chapter20.figures.f07.Stack;

public class InfixToPostfix {

	public static void main(String[] args) throws EmptyListException {
		StringBuffer infix = new StringBuffer();
		StringBuffer postfix = new StringBuffer();
		infix.append("(6+2)*5-8/4");
		System.out.println(infix);

		StackCompositions<Character> stackPostfix = new StackCompositions<Character>();
		InfixToPostfixConvert(infix, postfix, stackPostfix);

	}

	public static StringBuffer InfixToPostfixConvert(StringBuffer infix, StringBuffer postfix,
			StackCompositions<Character> stackPostfix) throws EmptyListException {

		StringBuffer stringInvalidBuffer = new StringBuffer();
		stringInvalidBuffer.append("İnvalid Expressions");
		for (int i = 0; i < infix.length(); ++i) {
			char c = infix.charAt(i);

			// If the scanned character is an operand, add it to output.
			if (Character.isLetterOrDigit(c))
				postfix.append(c);

			// If the scanned character is an '(', push it to the stack.
			else if (c == '(')
				stackPostfix.push(c);

			// If the scanned character is an ')', pop and output from the stack
			// until an '(' is encountered.
			else if (c == ')') {
				while (!stackPostfix.isEmpty() && stackPostfix.peek() != '(')
					postfix.append(stackPostfix.pop());

				if (!stackPostfix.isEmpty() && stackPostfix.peek() != '(')
					return stringInvalidBuffer; // invalid expression
				else
					stackPostfix.pop();
			} else // an operator is encountered
			{
				while (!stackPostfix.isEmpty() && precedenceLevel(c) <= precedenceLevel(stackPostfix.peek())) {
					if (stackPostfix.peek() == '(')
						return stringInvalidBuffer; // invalid expression
					postfix.append(stackPostfix.pop());
				}
				stackPostfix.push(c);
			}

		}

		// pop all the operators from the stack
		while (!stackPostfix.isEmpty()) {
			if (stackPostfix.peek() == '(')
				return stringInvalidBuffer; // invalid expression
			postfix.append(stackPostfix.pop());
		}
		return postfix;
	}

	public static int precedenceLevel(char op) {
		switch (op) {
		case '+':
		case '-':
			return 0;
		case '*':
		case '/':
		case '%':
			return 1;
		case '^':
			return 2;
		default:
			throw new IllegalArgumentException("Operator unknown: " + op);
		}
	}
}
