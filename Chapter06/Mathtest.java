

public class Mathtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pow(2, 3));

		if (Math.pow(2, 3) == pow(2, 3)) {
			System.out.println("Math.pow is true");
		}

		
		double hypotenus = hypotenuse(3, 4);
		System.out.println(hypotenus);
		
		System.out.println("smallest num "+ smallest(13,22,22));
		
	
		System.out.println(	Math.floor(-6.4));
		
		System.out.println(Math.ceil(-Math.abs(-8 +Math.floor(-5.5))));
	}

	public static int pow(int number1, int number2) {

		int result = 1;

		for (int counter = 0; counter < number2; counter++) {
			result = number1 * result;
		}

		return result;

	}
	
	
	public static double hypotenuse(double side1, double side2) {

		double hypotenus = Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2,2));
	
		return hypotenus;

	}
	
	
	public static int smallest(int a, int b,int c) {

		int smallest;
		
		smallest = a;
		
		if(a > b) {
			
			smallest = b;
			if(b>c) {
				smallest = c;
			}
			
		}
		else if(a>c) {
			smallest = c;
		}
		
		return smallest;

	}
}
