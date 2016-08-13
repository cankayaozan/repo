
public class Account {

	private double balance;
	private int id;
	
	public Account(double balance, int id){
		
		this.balance=balance;
		this.id=id;
	}
	
	
	public double getBalance() {
		return balance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void withDraw(double amount){
		if(balance>=amount)
		balance-=amount;
		else
			System.out.println("paran yok fakiirr");

		
	}
	
	public void deposit(double amount){
		
		balance+=amount;
	}

}
