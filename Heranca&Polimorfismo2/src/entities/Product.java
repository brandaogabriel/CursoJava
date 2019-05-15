package entities;

public class Product {
	
	private String name;
	protected double price;
	
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}

	public String priceTag() {
		return this.name + " $ " + String.format("%.2f", this.price);
	}
	
	
}
