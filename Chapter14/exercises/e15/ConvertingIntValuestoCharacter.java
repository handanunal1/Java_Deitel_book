/**
 *Exercises 14.15 -   ConvertingIntValuestoCharacter
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e15;

import java.security.SecureRandom;

public class ConvertingIntValuestoCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecureRandom random = new SecureRandom();
		
		int number = random.nextInt(256);
		System.out.println("Number value:               "+number);
		char a = (char) number;
		
		System.out.println("Character represantation:   "+a);

	}

}
