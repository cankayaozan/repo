package tr.org.linux.kamp;

public class Account {

	private String name;
	// public protected private default
	private double balance;

	public Account(String name, double balance) {
		// constructer
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;

	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}

	public double getBalance() {
		// method
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
