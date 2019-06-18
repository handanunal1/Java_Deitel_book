package chapter16.figures.f14;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		
		Stack<Number> stack = new Stack<>();
		stack.push(12L);
		System.out.println("Pushed 12L");
		printstack(stack);
		stack.push(34567);
		System.out.println("Pushed 34567");
		printstack(stack);
		stack.push(1.0F);
		printstack(stack);
		stack.push(1234.5678); // push double value 1234.5678
		System.out.println("Pushed 1234.5678 ");
		printstack(stack);
		
		
		try {
			Number removedObject = null;
			
			while(true) {
				removedObject = stack.pop();
				System.out.println("Removed object "+removedObject);
				printstack(stack);
			}
			
		} catch (EmptyStackException emptysException) {
			// TODO: handle exception
		}
	}

	private static void printstack(Stack<Number> stack) {
		if(stack.isEmpty()) {
			System.out.printf("stack is empty%n%n"); // the stack is empty
		}
		else {
			System.out.println("Stack contains: "+stack);
		}
		
	}

}
