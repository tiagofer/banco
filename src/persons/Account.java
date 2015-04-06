package persons;

public class Account {
	private String numAccount;
	private double balance = 0;
	private double limit = 1000.0;
	Clients client;
	private static int totalAccount;
	
	public Account(Clients client){
		this.client = client;	
		if (client.getPublicEmployer() == 0){
			limit = 2000.0;
		}
		Account.totalAccount++;
	}
	
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
		return this.balance + this.limit;
	}
	public void setLimit(double limit){
		this.limit = limit;
	}
	public static int getTotalAccount(){
		return Account.totalAccount;
	}
	
	
	public boolean draw(double value){
		if(value > (this.balance + this.limit)){
			System.out.println("Saldo Insuficiente");
			return false;
		}else {
			this.balance -=value;
			return true;
		}
	}
	
	public boolean deposit(double value){
		if (value < 0){
			System.out.println("Deposito Inválido");
			return false;
		} 		
		this.balance += value;	
		return true;
	}
	
	public boolean transferTo(Account target, double value){
		if (target.getBalance() < value){
			return false;
		}else {
			this.balance += value;
			target.draw(getBalance() - value);
			return true;
		}
	}
	
	
}
