package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt(); // Tamanho da matriz
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j ++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(matriz[i][1]);
		}
		
		sc.close();
	}

}
