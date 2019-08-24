package chapter21.exercises.e06;

/**
 * Exercise 06 ConcetraneLinkedLis
 * 
 * @author Handan
 */
public class ConcetraneLinkedList {

	public static void main(String[] args) throws EmptyListException {

		List<Character> listFirst = new List<Character>();
		List<Character> listSecond = new List<Character>();

		char[] array1 = { 'a', 'b', 'c', 'd' };
		char[] array2 = { 'e', 'f', 'g', 'h' };

		for (Character element : array1) {
			listFirst.InsertAtback(element);
		}
		for (Character element : array2) {
			listSecond.InsertAtback(element);
		}

		listFirst.print();
		listSecond.print();

		List<Character> listConcatinate = ListConcatenate(listFirst, listSecond);
		listConcatinate.print();
	}

	public static <T> List<T> ListConcatenate(List<T> List1, List<T> List2) throws EmptyListException {
		List<T> listConcate = new List<T>();

		while (!List1.isEmpty()) {
			listConcate.InsertAtback(List1.removeFromFront());

		}

		while (!List2.isEmpty()) {
			listConcate.InsertAtback(List2.removeFromFront());

		}

		return listConcate;
	}

}
