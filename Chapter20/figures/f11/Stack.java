/**
 * 
 */
package chapter20.figures.f11;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *Figures 20.11    Stack
 * 
 * Author: Handan Unal
 * 
 */
public class Stack<T> {
	
	private final ArrayList<T> elements;

	public Stack() {
		this(10);
	}
	
	public Stack(int capacity) {
		int initCapacity = capacity > 0 ? capacity : 10;
		elements = new ArrayList<T>(initCapacity);
	}

	
	public void push(T pushValue) {
		elements.add(pushValue);
	}
	
	
	public  T pop() {
		if(elements.isEmpty()) {
			throw new EmptyStackException();
		}
		else{
			return elements.remove(elements.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
