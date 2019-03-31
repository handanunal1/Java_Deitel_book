/**
 * Exercise 7.27 - (Sieve of Eratosthenes)
 * A prime number is any integer greater than 1 that’s evenly divisible only by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers
 * Author: Handan Unal
 * 
 */

package Chapter07Exercises;

public class C07E27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] array = new boolean[1000];

		for (int i = 0; i < array.length; i++) {
			array[i] = true;
		}

		for (int i = 0; i < array.length; i++) {
             if(i==1 ) {
            	 array[i] = false;
             }
			if (i >= 2) {

				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						array[i] = false;
						break;
					} else {
						array[i] = true;
					}
				}

			}
		}
		
		
		for (int i = 1; i < array.length; i++) {
			System.out.println(i+ " "+array[i]);
		}
	}

}
