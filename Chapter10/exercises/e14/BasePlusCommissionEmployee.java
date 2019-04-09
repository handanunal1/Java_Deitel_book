package exercises.e14;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary,Date date) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate,date);
		if (this.baseSalary < 0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {

		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (this.baseSalary < 0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}

	@Override
	public double earnings() {
		return baseSalary + super.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	}

}
