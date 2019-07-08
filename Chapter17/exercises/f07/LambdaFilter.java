package chapter17.exercises.f07;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaFilter {

	public static void main(String[] args) {
		
		Integer [] arrayInteger = {2,3,4,22,3,445,933,192,12};
		List<Integer> arrayList = Arrays.asList(arrayInteger);
		
		 arrayList.stream().filter(value-> value % 2 != 0).sum();
		
	
	}

}
