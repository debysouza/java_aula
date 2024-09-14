package br.com.banco.contas;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import br.com.banco.enums.TipoContaEnum;
import br.com.banco.utils.Util;

public class ContaPoupanca extends Conta implements Transacao {

	private TipoContaEnum tipo = TipoContaEnum.POUPANCA;
	private int id;
	private double rendimento;
	private final double TAXA = 0.005;
	private static Map<Integer, ContaPoupanca> mapaContasPoupanca = new HashMap<>();
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(TipoContaEnum tipo, int id, int numero, int agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
		this.id = id;
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

	public int getId() {
		return id;
	}

	public static Map<Integer, ContaPoupanca> getMapaContasPoupanca() {
		return mapaContasPoupanca;
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
		((ContaPoupanca) destino).depositar(valor);
	}
	
}
