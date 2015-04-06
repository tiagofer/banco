package persons;


public class Clients {
	private String name;
	private String surname;
	private String numberPersonalRecords;
	private int idade;
	private int publicEmployer;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNumberPersonalRecords() {
		return numberPersonalRecords;
	}
	public void setNumberPersonalRecords(String numberPersonalRecords) {
		this.numberPersonalRecords = numberPersonalRecords;
	}
	public void setPublicEmployer(int publicEmployer){
		this.publicEmployer = publicEmployer;
	}
	public int getPublicEmployer(){
		return publicEmployer;
	}
}
