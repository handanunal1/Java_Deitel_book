
public class Account {

	private String name;

	private double balance;

	public Account(String name, double balance) {
		super();
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    public void deposit (double depositAmount) {
    	if(depositAmount > 0.0) {
    		balance  = balance + depositAmount;
    	}
    }
    
    
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
