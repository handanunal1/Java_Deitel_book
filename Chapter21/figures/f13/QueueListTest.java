package chapter21.figures.f13;
/**
 * Figure 21.13    QueueListTest<T>
 *  @author Handan
 */
public class QueueListTest {

	public static void main(String[] args) throws EmptyListException  {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(-1);
		queue.print();
		queue.enqueue(2);
        queue.print();
        queue.enqueue(-3);
        queue.print();
        
        
        try {
        	
        	int removedItem;
        	while(true) {
        		removedItem = queue.dequeue();
        		System.out.println(removedItem);
        		queue.print();
        	}
			
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}

}
