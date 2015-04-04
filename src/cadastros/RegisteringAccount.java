package cadastros;
import javax.swing.*;
import persons.*;

public class RegisteringAccount {

	public static void main(String[] args) {
		
		Account conta1 = new Account();
		Clients cliente1 = new Clients();
		Employees funcionario1 = new Employees();
		
		cliente1.setName("Tiago");
		cliente1.setSurname("Ferreira");
		cliente1.setNumberPersonalRecords("111-111-111-11");
		
		conta1.setClient(cliente1);
		conta1.setNumAccount("6513");
		conta1.setLimit(1000);
	
		funcionario1.setName(JOptionPane.showInputDialog("Nome do Funcionário"));
		funcionario1.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Salario")));
		funcionario1.setDepartment(JOptionPane.showInputDialog("Departamento"));
		funcionario1.setPersonalRegister(JOptionPane.showInputDialog("RG"));
		funcionario1.setStartDate(JOptionPane.showInputDialog("Data de Início"));
		funcionario1.setInCompany(JOptionPane.showConfirmDialog(null, "Funcionário ainda na companhia?", null, JOptionPane.YES_NO_OPTION));
		switch (funcionario1.isInCompany()){
			case 0 : JOptionPane.showMessageDialog(null, "Funcionário Ativo"); break;
			case 1 : JOptionPane.showMessageDialog(null, "Funcionário Inativo"); break;
			default : JOptionPane.showMessageDialog(null, "Operação cancelada");			
		}

		System.out.println("Salario: " + funcionario1.getSalary());
		System.out.println("Nome: " + funcionario1.getName());
		System.out.println("Salario Anual: " + funcionario1.returnAnnualSalary());
		System.out.println("RG: " + funcionario1.getPersonalRegister());
		System.out.println("Departamento: " + funcionario1.getDepartment());
		System.out.println("Data de Início: " + funcionario1.getStartDate());

		funcionario1.applyIncrease(Double.parseDouble(JOptionPane.showInputDialog("Porcentagem de Aumento")));
		System.out.println("Salario Com Aumento: " + funcionario1.getSalary());		
		
	}

}
