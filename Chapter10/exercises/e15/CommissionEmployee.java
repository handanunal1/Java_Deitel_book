/**
 *Exercise 10.15 -  - Concrete Class CommissionEmployee
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e15;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		if (this.grossSales < 0) {
			throw new IllegalArgumentException("GrossSales must be >= 0.0");
		}
		this.grossSales = grossSales;
		if (commissionRate < 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("commissionRate  must be >= 0.0 and <1.0");
		}
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (this.grossSales < 0) {
			throw new IllegalArgumentException("GrossSales must be >= 0.0");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate < 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("commissionRate  must be >= 0.0 and <1.0");
		}
		this.commissionRate = commissionRate;
	}


	@Override
	public String toString() {
		return String.format("%s %s%n%s: $%,.2f; %s: %.2f", "commission", super.toString(), "gross sales",
				getGrossSales(), "commission rate", getCommissionRate());
	}

	@Override
	public double getPaymountAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
