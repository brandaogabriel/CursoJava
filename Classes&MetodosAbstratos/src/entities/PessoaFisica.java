package entities;

public class PessoaFisica extends Pessoa {

	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double calculaImposto() {
		double imposto = 0.0;
		if(super.getRendaAnual() < 20000.00) {
			imposto = 0.15;
		}
		else if(super.getRendaAnual() >= 20000.00) {
			imposto = 0.25;
		}
		return (super.getRendaAnual() * imposto) - (this.gastosSaude * 0.5);		
	}
	
}
