
public class CheckingAccount extends Account {

	private double overdraftLimit;
	
	public CheckingAccount() {
		super();
		this.overdraftLimit = 0;
	}

	public CheckingAccount(int id, double balance) {
		this(id, balance, 0);
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = 0;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (!(overdraftLimit + this.getBalance() < Math.abs(amount))) 
			super.withdraw(amount);
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format("\nAccount type: Checking account\nOverdraft limit: %.2f",
				this.overdraftLimit
		));
	}


}
