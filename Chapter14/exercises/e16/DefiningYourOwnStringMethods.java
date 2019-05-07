/**
 *Exercises 14.16 -   ConvertingIntValuestoCharacter
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e16;

public class DefiningYourOwnStringMethods {

	public static void main(String[] args) {
		String stringExample = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt";

		int index = IndexOf(stringExample, 'i');
		if (index == -1) {
			System.out.println("The character can not be found");

		} else {
			System.out.println("The character is at "+index +" index for the first time");
		}
		
		
		

		index= LastIndexOf(stringExample, 'i');
		if (index == -1) {
			System.out.println("The character can not be found");

		} else {
			System.out.println("The character is at "+index +" index for the last time");
		}
	}

	public static int IndexOf(String string, char character) {

		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			if (character == string.charAt(i)) {
				index = i;
				break;
			}
			index = -1;
		}

		return index;

	}

	public static int LastIndexOf(String string, char character) {
		int index = 0;
		for (int i = string.length()-1; i >= 0; i--) {
			if (character == string.charAt(i)) {
				index = i;
				break;
			}
			index = -1;
		}
		return index;
	}

}
