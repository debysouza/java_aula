package br.com.banco.contas;

import br.com.banco.enums.TipoContaEnum;

public class ContaPoupanca extends Conta {

	private TipoContaEnum tipo = TipoContaEnum.POUPANCA;
	private double rendimento;
	private final double TAXA = 0.005;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(TipoContaEnum tipo, int numero, int agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getTAXA() {
		return TAXA;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [" + super.toString() + ", rendimento=" + rendimento + ", TAXA=" + TAXA + "]";
	}

	public TipoContaEnum getTipo() {
		return tipo;
	}
	
}
