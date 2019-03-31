/**
 * Exercise 8.14 - Set of Integers
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class IntegerSetTest {

	public static void main(String[] args) {
		 IntegerSet integerSet1 = new IntegerSet();
		 IntegerSet integerSet2 = new IntegerSet();
		 
		 integerSet1.insertElement(2);
		 integerSet1.insertElement(3);
		 integerSet1.insertElement(12);
		 System.out.println("Integer Set1: "+ integerSet1.toString());
		 System.out.println("Integer Set2: "+ integerSet2);
		 
		 integerSet2.insertElement(4);
		 System.out.println("Intersection of IntegerSet1 and IntegerSet2: "+IntegerSet.intersection( integerSet1, integerSet2).toString());
		 System.out.println("Union        of IntegerSet1 and IntegerSet2: "+IntegerSet.union(integerSet1, integerSet2).toString());
		 
		 integerSet2.deleteElement(4);
		 System.out.println("Deletion test: "+ integerSet2);
		 
	}

}
