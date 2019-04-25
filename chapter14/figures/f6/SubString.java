/**
 *Figures 14.6 -  Substring
 * 
 * Author: Handan Unal
 * 
 */
package figures.f6;

public class SubString {

	public static void main(String[] args) {
		 String letters = "abcdefghijklmabcdefghijklm";

		 
		 System.out.println("From 20 index to end: " +letters.substring(20));
		 
		 System.out.println("From 3 index to 6. index but not including 6 : " +letters.substring(3,6));
	}

}
