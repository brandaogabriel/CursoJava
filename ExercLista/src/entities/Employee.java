package entities;

public class Employee {

	private String id;
	private String nome;
	private double salario;

	public Employee(String id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void alteraSalario(double porcentagem) {
		this.salario = salario * porcentagem / 100 + this.salario;
	}
	
	public String getId() {
		return this.id;
	}
	
	
	public String toString() {
		return "List of employees:" + System.lineSeparator() + "id= " + this.id + ", nome= " + this.nome + ", salario= " + this.salario +
				System.lineSeparator();
	}
	
	
	
	
	
}
