/**
 * Figure 10.1 - PolymorphismTest
 * 
 * Author: Handan Unal
 * 
 */

package Chapter10Figures;

public class PolymorphismTest {

	public static void main(String[] args) {
		
	
		BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Jane", "Doe", "111-11-11", 10000, .06,300);
		
		CommissionEmployee commissionEmployee2 =  basePlusCommisionEmployee;
		System.out.println(commissionEmployee2.toString());

	}

}
