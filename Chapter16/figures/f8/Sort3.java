package chapter16.figures.f8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Figures 16.9 Sort3
 * 
 * Author: Handan Unal
 * 
 */
public class Sort3 {

	public static void main(String[] args) {
		List <Time2> list = new ArrayList<Time2>();
		
		list.add(new Time2(6,24,34));
		list.add(new Time2(18,14,34));
		list.add(new Time2(6, 05, 34));
		list.add(new Time2(12,14,58));
		
		System.out.println("Unsorted elements:  "+ list);

	
		Collections.sort(list,new TimeComparator());
		System.out.println("Sorted elements:  " +list);
	}

}
