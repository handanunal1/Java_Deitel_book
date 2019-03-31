import java.util.Scanner;
import java.math.*;
public class WordPopulation {

	public static void main(String[] args) {
		 double currentPop; 
	        double growthRate;
	        double annualPopIncrease;
	        double estimatedPop;
	        Scanner input = new Scanner (System.in);
	        System.out.print ("Enter Current World Population: ");
	        currentPop = input.nextLong();
	        System.out.print ("Enter Annual Population Growth Rate: ");
	        growthRate = input.nextInt();
	        annualPopIncrease = (growthRate / 100) * currentPop;
	        estimatedPop = currentPop + annualPopIncrease;
	 
	        System.out.println ();
	 
	        System.out.println("Estimated population after one year:     " + estimatedPop);
	        System.out.println("Estimated population after two years:    " + estimatedPop + (annualPopIncrease * 2));
	        System.out.println("Estimated population after three years:  " + estimatedPop + (annualPopIncrease * 3));
	        System.out.println("Estimated population after four years:   " + estimatedPop + (annualPopIncrease * 4));
	        System.out.println("Estimated population after five years:   " + estimatedPop + (annualPopIncrease * 5));
	 
	
	}

}
