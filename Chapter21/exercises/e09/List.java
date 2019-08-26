package chapter21.exercises.e09;

import java.net.Inet4Address;

/**
 * Exercise 21.08 ListNode
 */
class ListNode<T> implements Comparable<ListNode<T>> {

	protected final Comparable<T> data;
	protected ListNode<T> nextNode;

	ListNode(T object) {
		this(object, null);
	}

	ListNode(T object, ListNode<T> node) {
		data = (Comparable<T>) object;
		nextNode = node;
	}

	public T getData() {
		return (T) data;
	}

	public ListNode<T> getNextNode() {
		return nextNode;
	}

	public static void main(String[] args) {

	}

	@Override
	public int compareTo(ListNode<T> other) {
		return data.compareTo((T) other.data);
	}

}

public class List<T> {

	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;

	public List() {
		this("list");
	}

	public List(String name) {
		this.name = name;
		firstNode = lastNode = null;

	}

	public void InsertAtFront(T insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new ListNode<T>(insertItem);
		} else {
			firstNode = new ListNode<T>(insertItem, firstNode);
		}
	}

	public boolean isEmpty() {

		return firstNode == null;
	}

	public void InsertAtback(T insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new ListNode<T>(insertItem);
		} else {
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);

		}
	}

	public T removeFromFront() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		T removedItem = (T) firstNode.data;

		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;

		return removedItem;
	}

	public T removeFromBack() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		T removedItem = (T) lastNode.data;

		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else {
			ListNode<T> current = firstNode;
			while (current.nextNode != lastNode)
				current = current.nextNode;

			lastNode = current;
			current.nextNode = null;
		}

		return removedItem;
	}

	public void print() {
		if (isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return;
		}

		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;

		while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;

		}
		System.out.println();
	}

	public List<T> CopyListBackward(List<T> liste) {

		List<T> copy = new List<T>();
		if (isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return copy;
		}

		ListNode<T> current = liste.firstNode;

		while (current != null) {

			copy.InsertAtFront(current.getData());
			current = current.nextNode;
			if (current == null) {
				break;
			}
			

		}

		return copy;

	}

}