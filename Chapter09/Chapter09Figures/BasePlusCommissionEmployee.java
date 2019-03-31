
/**
 * Figure 9.8 -CommisionEmployee
 * 
 * Author: Handan Unal
 * 
 */
package Chapter09Figures;

public class BasePlusCommissionEmployee extends CommisionEmployee {

	private double baseSalary; //

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

	}

	public void setBaseSalary(double baseSalary) {

		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary; 
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return	 baseSalary+(commissionRate*grossSales);
	}
	
}
