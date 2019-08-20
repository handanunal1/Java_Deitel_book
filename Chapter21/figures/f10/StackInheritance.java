package chapter21.figures.f10;
/**
 * Exercise 21.08 StackInheritance
 */
import chapter21.figures.f03.EmptyListException;

public class StackInheritance<T> extends List<T> {

	public StackInheritance() {
		super("stack");
	}


	public void push(T object) {
		InsertAtFront(object);
	}


	public T pop() throws EmptyListException, chapter21.figures.f10.EmptyListException{
		return removeFromFront();
	}


}
