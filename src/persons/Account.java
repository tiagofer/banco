package persons;

public class Account {
	private String numAccount;
	private double balance;
	private double limit;
	private Clients client;
	
	
	public String getNumAccount() {
		return numAccount;
	}
	public Clients getClient() {
		return client;
	}
	public void setClient(Clients client) {
		this.client = client;
	}
	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public boolean draw(double value){
		if(value > this.balance){
			return false;
		}else {
			this.balance -=value;
			return true;
		}
	}
	
	public void deposit(double value){
		this.balance += value;
	}
	
	public boolean transferTo(Account target, double value){
		if (target.getBalance() < value){
			return false;
		}else {
			this.balance += value;
			target.setBalance(getBalance() - value);
			return true;
		}
	}
	
	
}
