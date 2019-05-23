package chapter15.exercises.e4;

public class TransactionRecord {
	private int account;
	private double amount;
	public TransactionRecord(int account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}
	
	
	public TransactionRecord() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
