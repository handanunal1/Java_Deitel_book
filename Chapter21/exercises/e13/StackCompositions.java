
package chapter21.exercises.e13;


/**
 * Figure 21.12  StackCompositions
 *  @author Handan
 */
public class StackCompositions <T>{

	private List<T> stackList;

	public StackCompositions() {
	
		this.stackList = new List<T>("stack");
	}
	
	public void push(T object) {
		stackList.InsertAtFront(object);
	}
	
	public T pop() throws EmptyListException{
		try {
			return stackList.removeFromFront();
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	public boolean isEmpty() {

		return stackList.isEmpty();
	}
	
	public void Print() {
		stackList.print();
	}
}
