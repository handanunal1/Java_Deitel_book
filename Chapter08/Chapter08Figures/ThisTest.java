/**
 * Figure 8.1 - ThisTest / Calling "this" explicitly and implicitly
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Figures;

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	}

}

class SimpleTime {
	private int hour;
	private int minute;
	private int second;

	public SimpleTime(int hour, int minute, int second) {

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toUniversalString() {

		return String.format("%02d:%02d:%02d", hour, minute, second);

	}

	public String buildString() {
		return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(),
				"toUniversalString()", this.toUniversalString());
	}

}