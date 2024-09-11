package br.com.banco.contas;

import br.com.banco.enums.TipoContaEnum;

public class ContaCorrente extends Conta {

	private TipoContaEnum tipo = TipoContaEnum.CORRENTE;
	private boolean chequeEspecial;
	private final double TAXA = 15.99;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(TipoContaEnum tipo, int numero, int agencia, String titular, double saldo, boolean chequeEspecial) {
		super(numero, agencia, titular, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getTAXA() {
		return TAXA;
	}

	@Override
	public String toString() {
		return "ContaCorrente [" + super.toString() + ", chequeEspecial=" + chequeEspecial + ", TAXA=" + TAXA + "]";
	}

	public TipoContaEnum getTipo() {
		return tipo;
	}
	
}
