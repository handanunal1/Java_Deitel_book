package chapter21.figures.f03;

public class ListTest {

	public static void main(String[] args)  throws EmptyListException {
		List<Integer> list = new List<>();
		list.InsertAtFront(-1);
		list.print();
		list.InsertAtFront(0);
		list.print();
		list.InsertAtback(4);
		list.print();
		list.InsertAtback(5);
		list.print();
	
	
		try
		 {
		int removedItem = list.removeFromFront();
		System.out.printf("%n%d removed%n", removedItem);
		list.print();
		
		
		removedItem = list.removeFromBack();
		System.out.printf("%n%d removed%n", removedItem);
		list.print();
		 }
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	

}
