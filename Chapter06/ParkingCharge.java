
public class ParkingCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int TotalParkinghours = 0;
		TotalParkinghours = 18;
	  
		if(TotalParkinghours>24) {
			System.out.println("No parks allowed more than 25h");
			return;
		}
		System.out.println("Fee is " + calculate(TotalParkinghours));
	}

	public static double calculate(int hours) {
		double parkingFee = 0;

		if (hours <= 3) {
			parkingFee = 2;
		} else if (hours <= 24 && hours > 3) {

			parkingFee = 2 + ((hours - 3) * 0.5);

			if (parkingFee >= 10) {
				parkingFee = 10;
			}

		} 
		return parkingFee;
	}
}
