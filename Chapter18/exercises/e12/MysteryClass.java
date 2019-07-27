/**
 * Exercise 18.12 MysteryClass 
 * 
 * Author: Handan Unal
 * The Mystery class sums the array
 * in the recursive function.
 * 
 */
package chapter18.exercises.e12;

public class MysteryClass {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		
		int result = mystery(array,array.length);
		System.out.println("Result is : "+ result);

	}

	private static int mystery(int[] array, int size) {
		
		if(size ==1)
			return array[0]; 
		
		else
		// TODO Auto-generated method stub
		return  array[size-1]+mystery(array, size-1);
	}

}
