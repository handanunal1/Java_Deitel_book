package chapter21.exercises.e20;

public class PrintListBackward {

	public static void main(String[] args) {
		List <Integer> list_Integer = new List<Integer>();
		list_Integer.InsertAtback(1);
		list_Integer.InsertAtback(2);
		list_Integer.InsertAtback(3);
		
		list_Integer.print();
        list_Integer.printReverseRecursive();

	}

}
