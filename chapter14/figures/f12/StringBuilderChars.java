/**
 *Figures 14.12 -   StringBuilderCapLen
 * 
 * Author: Handan Unal
 * 
 */
package figures.f12;

public class StringBuilderChars {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("hello there");
		System.out.printf("buffer = %s%n", buffer.toString());
		System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n", buffer.charAt(0), buffer.charAt(4));

		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.println("The characters are: ");

		for (char a : charArray) {
			System.out.print(a);
		}

		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		System.out.printf("%n%nbuffer = %s", buffer.toString());
		buffer.reverse();
		System.out.printf("%n%nbuffer = %s", buffer.toString());
	}

}
