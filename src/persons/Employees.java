package persons;

public class Employees {
	protected String name;
	protected String Department;
	protected String personalRegister;
	protected double salary;
	protected String startDate;
	protected int inCompany;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int isInCompany() {
		return inCompany;
	}
	public void setInCompany(int inCompany) {
		this.inCompany = inCompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getPersonalRegister() {
		return personalRegister;
	}
	public void setPersonalRegister(String personalRegister) {
		this.personalRegister = personalRegister;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void applyIncrease(double percent){
		this.salary = this.salary + this.salary*(percent/100);
	}
	
	public double returnAnnualSalary(){
		return this.salary*12;
	}
	
	public double getBonus() {
		return this.salary * 0.10;
	}
}
