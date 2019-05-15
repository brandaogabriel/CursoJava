package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturedDate;

	public UsedProduct(String name, double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public final String priceTag() {
		return this.getName() + " (used) $ " + String.format("%.2f", this.price) + 
				" (Manufacture date: " + sdf.format(this.manufacturedDate) + ")";
	}
	
}
