package chapter21.figures.f13;
/**
 * Figure 21.13   Queue<T>
 *  @author Handan
 */
public class Queue<T> {

	private List<T> queueList;

	public Queue() {
		queueList = new List<T>("queue");
	}

	public void enqueue(T object) {
		queueList.InsertAtback(object);
	}

	public T dequeue() throws EmptyListException {
		return queueList.removeFromFront();
	}

	public boolean isEmpty() {
		return queueList.isEmpty();
	}

	public void print() {
		queueList.print();
	}
}
