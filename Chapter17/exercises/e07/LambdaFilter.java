package chapter17.exercises.e07;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaFilter {

	public static void main(String[] args) {
		
		Integer [] arrayInteger = {2,933,192,12,9};
		List<Integer> arrayList = Arrays.asList(arrayInteger);
		
	//	 arrayList.stream().filter(value-> value % 2 != 0).sum();
		
		 
		 int sum = arrayList.stream()
		            .filter(value -> value % 2 != 0)
		            .mapToInt(Integer::intValue)
		            .sum();
		 
		 System.out.println("Sum of odd numbers: " + sum);
	
	}

}
