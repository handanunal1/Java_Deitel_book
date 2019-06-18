package chapter16.figures.f15;

import java.util.PriorityQueue;

/**
 * Figures 16.15 PriorityQueueTest;
 * 
 * Author: Handan Unal
 * 
 */
public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<Double> queue = new PriorityQueue<>();
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		queue.offer(3.5);

		System.out.println(queue);

		System.out.println("Polling from queue: ");

		while (queue.size() > 0) {
			System.out.println(queue.peek());
			queue.poll();
		}
	}

}
