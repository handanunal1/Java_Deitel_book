/**
 * Exercise 9.14
 * 
 * Author: Handan Unal
 * 
 */

package Chapter10Figures;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);

		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("CommisionRate must be between 0.0 and 1.0 ");
		}
	}

	

	public double earnings() {

		return getCommissionRate() * getGrossSales();
	}

	public double getGrossSales() {
		return grossSales;
	}



	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}



	public double getCommissionRate() {
		return commissionRate;
	}



	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\n%s %s\n%s %s",super.toString(), "commision rate: ",getCommissionRate(),"gross sales" ,getGrossSales());
	}
}
