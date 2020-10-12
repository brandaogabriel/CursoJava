package entities;

public class Santander implements CalculaJurosStrategyInterface{

	@Override
	public double getTaxaJuros(Pedido pedido) {
		return 10;
	}

}
