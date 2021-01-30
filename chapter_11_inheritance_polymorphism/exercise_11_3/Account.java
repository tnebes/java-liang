public class Account {
	private boolean active;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();

	Account() {
		this.active = false;
		this.id = -1;
		this.balance = 0;
		Account.annualInterestRate = 0;
		this.dateCreated = new java.util.Date(); 
	}

	Account(int id, double balance) {
		this.active = true;
		this.id = id;
		this.balance = balance;
		this.dateCreated = new java.util.Date();
	}

	public void setId(int id) {
		if (id != -1)
			this.active = false;
		else
			this.active = true;
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	public boolean isActive() {
		return active;
	}

	public void withdraw(double amount) {
		amount = Math.abs(amount);
		if (!(amount >= balance))
			balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public String toString() {
		if (active) {
			return String.format("Id: %d\nBalance: %.2f\nMonthly interest rate: %.2f\nMonthly interest: %.2f\nDate created: %s",
					this.getId(),
					this.getBalance(),
					this.getMonthlyInterestRate(),
					this.getMonthlyInterest(),
					this.getDateCreated().toString()
			);
		} else {
			return "Account is inactive.";
		}
	}
}