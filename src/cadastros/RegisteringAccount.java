package cadastros;
import javax.swing.*;
import persons.*;

public class RegisteringAccount {

	public static void main(String[] args) {
		
//		Account conta1 = new Account();
		Clients cliente1 = new Clients();
		Clients cliente2 = new Clients();
		Employees funcionario1 = new Employees();
		
		cliente2.setName("Tiago");
		cliente2.setSurname("Ferreira");
		cliente2.setNumberPersonalRecords("111-111-111-11");
		cliente2.setPublicEmployer(1);
		
		Account conta1 = new Account(cliente2);
		
//		conta1.setClient(cliente1);
//		conta1.setNumAccount("6513");
	
	
		cliente1.setName(JOptionPane.showInputDialog("Nome"));
		cliente1.setSurname(JOptionPane.showInputDialog("Sobrenome"));
		cliente1.setNumberPersonalRecords(JOptionPane.showInputDialog("CPF"));
		cliente1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
		cliente1.setPublicEmployer(JOptionPane.showConfirmDialog(null, "Funcionario Público?", null, JOptionPane.YES_NO_OPTION));
		
		Account conta2 = new Account(cliente1);
		
		System.out.println(conta2.getBalance());
		System.out.println(conta1.getBalance());
		System.out.println(Account.getTotalAccount());
//		switch (cliente1.getPublicEmployer()){
//			case 0 : JOptionPane.showMessageDialog(null, "Funcionario P"); break;
//			case 1 : JOptionPane.showMessageDialog(null, "Funcionario Inativo"); break;
//			default : JOptionPane.showMessageDialog(null, "Operação cancelada");			
//		}

//		System.out.println("Salario: " + funcionario1.getSalary());
//		System.out.println("Nome: " + funcionario1.getName());
//		System.out.println("Salario Anual: " + funcionario1.returnAnnualSalary());
//		System.out.println("RG: " + funcionario1.getPersonalRegister());
//		System.out.println("Departamento: " + funcionario1.getDepartment());
//		System.out.println("Data de Inicio: " + funcionario1.getStartDate());
//
//		funcionario1.applyIncrease(Double.parseDouble(JOptionPane.showInputDialog("Porcentagem de Aumento")));
//		System.out.println("Salario Com Aumento: " + funcionario1.getSalary());		
		
	}

}
