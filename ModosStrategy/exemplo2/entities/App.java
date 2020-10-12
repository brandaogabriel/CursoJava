package entities;

public class App {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(10);

		CalculadoraDeJuros calculadora = new CalculadoraDeJuros(new Itau());
		double result = calculadora.calculaJuros(pedido);
	
		System.out.println(result);
	}

}
