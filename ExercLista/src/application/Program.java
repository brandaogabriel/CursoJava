package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quantos = Integer.parseInt(sc.nextLine());
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < quantos; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("id: ");
			String id = sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			sc.nextLine();
			list.add(new Employee(id, nome, salario));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		String id = sc.nextLine();
		Employee result = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
		
		if (result == null) {
			System.out.println("This id does not exist!\n");
	
		}
		else {
			System.out.print("Enter the percentage: ");
			double aumento = Double.parseDouble(sc.nextLine());
			result.alteraSalario(aumento);		
		}
		
		for (Employee obj : list) {
			System.out.println(obj.toString());
		}
		sc.close();
	}

}
