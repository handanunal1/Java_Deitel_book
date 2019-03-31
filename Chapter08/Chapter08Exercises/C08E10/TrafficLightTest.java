
/**
 * Exercise 8.10 -TrafficLightTest Class
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Exercises;

public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     

		for (TrafficLight light : TrafficLight.values()){
		  System.out.println(light + " duration:"+ light.getDuration());
		}
	}

	
	
}
