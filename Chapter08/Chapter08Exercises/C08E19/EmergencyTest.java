/**
 * Exercise 8.19 -  Emergency System
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class EmergencyTest {

	public static void main(String[] args) {

		Emergency emergency1 = new Emergency("Jane", "Doe", "4448283", "Umbridge", EmergencyType.FIRE);

		System.out.println(emergency1.toString());
		if(emergency1.getEmergencyStatus() == EmergencyStatus.PENDING) {
			emergency1.setEmergencyStatus(EmergencyStatus.IN_PROGRESS);
		}
	}

	
	
}
