package br.com.banco.contas;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import br.com.banco.enums.TipoContaEnum;
import br.com.banco.utils.Util;

public class ContaCorrente extends Conta implements Transacao {

	private TipoContaEnum tipo = TipoContaEnum.CORRENTE;
	private int id;
	private boolean chequeEspecial;
	private final double TAXA = 15.99;
	private static Map<Integer, ContaCorrente> mapaContasCorrente = new HashMap<>();
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(TipoContaEnum tipo, int id, int numero, int agencia, String titular, double saldo, boolean chequeEspecial) {
		super(numero, agencia, titular, saldo);
		this.id = id;
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

	public int getId() {
		return id;
	}

	public static Map<Integer, ContaCorrente> getMapaContasCorrente() {
		return mapaContasCorrente;
	}

	@Override
	public String toString() {
		return "ContaCorrente [" + super.toString() + ", chequeEspecial=" + chequeEspecial + ", TAXA=" + TAXA + "]";
	}

	public TipoContaEnum getTipo() {
		return tipo;
	}

	@Override
	public void depositar(Double valor) {
		if(valor > 0) {
			saldo += valor;
		} else {
			Util.setupLogger().log(Level.INFO, "Valor inexistente!");
		}		
	}

	@Override
	public void transferir(Double valor, Conta destino) {
		sacar(valor);
		((ContaCorrente) destino).depositar(valor);
	}

}
