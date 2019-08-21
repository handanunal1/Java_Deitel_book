package chapter21.figures.f11;

import chapter21.figures.f03.EmptyListException;
import chapter21.figures.f10.StackInheritance;

public class StackInheritanceTest {

	public static void main(String[] args) throws chapter21.figures.f10.EmptyListException {
		StackInheritance<Integer> stack = new StackInheritance<Integer>();
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();

		try {
			int removedItem = 0;

			while (true) {
				removedItem = stack.pop(); // use pop
				System.out.println(removedItem);

			}
		} catch (EmptyListException ex) {
			ex.printStackTrace();
		}
	}
}
