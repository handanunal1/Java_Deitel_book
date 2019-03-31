/**
 * Figure 8.6 - Time2Test - Invoking the constructions
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Figures;

public class Time2Test {

	public static void main(String[] args) {

		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 21, 34);
		Time2 t5 = new Time2(t4);
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified,default minute,second", t2);
		displayTime("t3: hour and minute specified,default second", t3);
		displayTime("t4: all of them specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);

	}

	private static void displayTime(String string, Time2 t) {
		// TODO Auto-generated method stub
		System.out.printf("%s%n   %s%n   %s%n", string, t.toUniversalString(), t.toString());
	}

}
