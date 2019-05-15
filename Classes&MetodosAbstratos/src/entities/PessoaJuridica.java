package entities;

public class PessoaJuridica extends Pessoa {
	
	private int numeroDeFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	
	@Override
	public double calculaImposto() {
		double imposto = 0.16;
		if (this.numeroDeFuncionarios > 10) {
			imposto = 0.14;
		}
		return super.getRendaAnual() * imposto;
	}
}
