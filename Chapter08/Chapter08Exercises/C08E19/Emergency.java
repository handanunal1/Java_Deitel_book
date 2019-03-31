/**
 * Exercise 8.19 -  Emergency System
 * 
 * Author: Handan Unal
 * 
 */

package Chapter08Exercises;

public class Emergency {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String locationEmergency;
	private EmergencyType emergencyType;
	private EmergencyStatus emergencyStatus;

	public Emergency(String firstName, String lastName, String phoneNumber, String locationEmergency,
			EmergencyType emergencyType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.locationEmergency = locationEmergency;
		this.emergencyType = emergencyType;
		this.emergencyStatus = EmergencyStatus.PENDING;
	}

	public EmergencyType getEmergencyType() {
		return emergencyType;
	}

	public void setEmergencyType(EmergencyType emergencyType) {
		this.emergencyType = emergencyType;
	}

	public EmergencyStatus getEmergencyStatus() {
		return emergencyStatus;
	}

	public void setEmergencyStatus(EmergencyStatus emergencyStatus) {
		this.emergencyStatus = emergencyStatus;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emergency Information:\nName:" + this.firstName + "\nLastname:" + this.lastName + "\nAdress: " + this.locationEmergency + "\nPhoneNumber:"
				+ this.phoneNumber + "\nEmergencyType:" + this.emergencyType + "\nStatus:" + this.emergencyStatus;
	}

	
	
}
