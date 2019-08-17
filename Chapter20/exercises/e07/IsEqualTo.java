package chapter20.exercises.e07;
/**
 * Exercise 20.07   IsEqualto
 */
public class IsEqualTo {

	public static void main(String[] args) {
		
		Integer first = 12;
		Integer second = 13;
		
		
		Object firstObject = "string";
		Object secondObject = "string";
		
		System.out.println(first +" and  " +second + " is equal? Result: "+ isEqualTo(first, second));
		System.out.println(firstObject +" and  " +secondObject + " is equal? Result: "+ isEqualTo(firstObject, secondObject));
		

	}

	public static <T> boolean isEqualTo(T element1, T element2) {

		boolean equal = false;

		if (element1 == element2) {
			equal = true;
		}

		return equal;

	}

}
