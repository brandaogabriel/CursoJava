package entities;

public class OutsourceEmployee extends Employee {
	
	private double additionalCharge;

	public OutsourceEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment() {
		return super.payment() + (1.1 * this.additionalCharge);
	}
	
	
	
}
