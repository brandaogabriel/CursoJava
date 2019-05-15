package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> produtos = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacturedDate = sdf.parse(sc.next());
				produtos.add(new UsedProduct(name, price, manufacturedDate));
				
			}
			else if (type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				produtos.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				produtos.add(new Product(name, price));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : produtos) {
			System.out.println(p.priceTag());
		}
				
		sc.close();
	}

}
