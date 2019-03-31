/**
 * Figure 8.10 - Enum type
 * 
 * Author: Handan Unal
 * 
 */

package Chapter08Figures;

public enum Book {
	JHTP("Java How to Program", "2015"), CSHARPHTP("Visual C# How to Program", "2014");

	private final String title;
	private final String copyrightYear;

	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	
	public String getTitle() {
		 return title; 
	}


	public String getCopyrightYear() {
		return copyrightYear;
	}
	
	

}
