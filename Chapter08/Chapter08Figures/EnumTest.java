/**
 * Figure 8.11 - Enum Test class
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Figures;

public class EnumTest {

	public static void main(String[] args) {

		System.out.println("All books:");

		for (Book book : Book.values()) {
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
		}
	}

}
