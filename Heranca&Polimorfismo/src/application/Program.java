package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empregados = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int employees = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < employees; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced? (y/n)");
			char resposta = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			
			if (resposta == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				empregados.add(new OutsourceEmployee(nome, hours, value, additional));
			}
			else {
				empregados.add(new Employee(nome, hours, value));
			}
		
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : empregados) {
			System.out.println(e.getName() + " - " + " $ " + String.format("%.2f", e.payment()));
		}
		
		
		
		
		
		sc.close();
	}

}
