package chapter21.figures.f11;

import chapter21.figures.f10.StackInheritance;

public class StackInheritanceTest {

	public static void main(String[] args) {
		StackInheritance<Integer> stack = new StackInheritance<Integer>();
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
	}

}
