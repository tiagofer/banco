package persons;

public class Manager extends Employees{
	int key;
	int numberEmployees;
	
	public boolean auth(int key){
		if (this.key == key){
			System.out.println("Acesso Permitido");
			return true;
		}else {
			System.out.println("Acesso Negado");
			return false;
		}		
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	@Override
	public double getBonus() {
		return this.salary * 0.15;
	}
	
	
}
