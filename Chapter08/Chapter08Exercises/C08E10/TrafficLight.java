
/**
 * Exercise 8.10 -TrafficLight Class
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public enum TrafficLight {
	RED(40), GREEN(50), YELLOW(60);

	private final int duration;


	TrafficLight(int duration) {

		this.duration = duration;

	}

	public int getDuration() {

		return this.duration;

	}
}
