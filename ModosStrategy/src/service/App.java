package service;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a distância: ");
		int distancia = sc.nextInt();
		System.out.print("Qual o tipo de frete (1) Normal, (2) Sedex: ");
		int opcaoFrete = sc.nextInt();
		
		TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
		
		Frete frete = tipoFrete.obterFrete();
		double preco = frete.calcularPreco(distancia);
		System.out.printf("O valor total é de R$ %.2f", preco);
		
		
		sc.close();
	}

}
