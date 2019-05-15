package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1)+ " data:");
			sc.nextLine();
			System.out.print("Indivual or company (i/c)? ");
			String tipo = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(tipo.equals("i")) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				pessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			}
			else if (tipo.equals("c")) {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				pessoas.add(new PessoaJuridica(name, anualIncome, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(Pessoa p : pessoas) {
			sum += p.calculaImposto();
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.calculaImposto()));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + sum);
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
