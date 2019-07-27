/**
 * Exercise 18.13 SomeClass
 * 
 * Author: Handan Unal  
 * The recursive method first prints the last index element
 * one by one goes to prints the first element.
 */
package chapter18.exercises.e13;

public class SomeClass {

	public static void main(String[] args) {
	 
    int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		
		String result = someMethod(array,0);
		System.out.println("Result is : "+ result);
	}

	
	public static String someMethod(int[] array2, int x) {
		if(x<array2.length) 
			return String.format("%s%d ", someMethod(array2, x + 1), array2[x]);
			
			else 
				return "";
		
	}
}
