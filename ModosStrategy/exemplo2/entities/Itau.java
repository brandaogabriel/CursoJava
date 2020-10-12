package entities;

public class Itau implements CalculaJurosStrategyInterface{

	@Override
	public double getTaxaJuros(Pedido pedido) {
		return 20;
	}

}
