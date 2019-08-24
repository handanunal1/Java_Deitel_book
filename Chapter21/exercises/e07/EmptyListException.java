package chapter21.exercises.e07;

public class EmptyListException extends Throwable {

	public EmptyListException() {
		this("List"); // call other EmptyListException constructor
	}

	// constructor
	public EmptyListException(String name) {
		super(name + " is empty"); // call superclass constructor
	}
}
