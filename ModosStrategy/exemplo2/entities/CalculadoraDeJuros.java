package entities;

public class CalculadoraDeJuros {
	
	private CalculaJurosStrategyInterface calculadorDeJuros;

	public CalculadoraDeJuros(CalculaJurosStrategyInterface calculadorDeJuros) {
		this.calculadorDeJuros = calculadorDeJuros;
	}
	
	public double calculaJuros(Pedido pedido) {
		return this.calculadorDeJuros.getTaxaJuros(pedido);
	}

}
