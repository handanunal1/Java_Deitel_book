package chapter16.exercises.e21;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Exercise 16.21 ChangePriorityQueue - Descending
 * 
 * Author: Handan Unal
 * 
 */
public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<Double> queue = new PriorityQueue<>( new DoubleComparator()); 
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		queue.offer(3.5);

		System.out.println(queue);

		System.out.println("Polling from queue: ");

		while (queue.size() > 0) {
			System.out.println(queue.poll());

		}
	}

}

class DoubleComparator implements Comparator<Double> {

	public int compare(Double s1, Double s2) {
		if (s1 < s2)
			return 1;
		else if (s1 > s2)
			return -1;
		return 0;
	}
}