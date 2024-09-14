package br.com.banco.contas;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.logging.Level;

import br.com.banco.utils.Util;

public abstract class Conta {

	DecimalFormat df = new DecimalFormat("#,##0.00");
	
	//definição dos atributos
	private int numero;
	private int agencia;
	private String titular;
	protected double saldo;
	private LocalDateTime dtHrAbertura;
	private static int totalContas;
	
	//Construtor default
	public Conta() {
	}

	//Construtor parametrizado
	Conta(int numero, int agencia, String titular, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.dtHrAbertura = LocalDateTime.now();
		totalContas += 1;
	}

	//Get e Set
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public static int getTotalContas() {
		return totalContas;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", titular=" + titular + ", saldoFormatado=" + df.format(saldo) + ", saldo=" + saldo + "]";
	}

	public LocalDateTime getDtHrAbertura() {
		return dtHrAbertura;
	}

	public void sacar(Double valor) {
		if(valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
		} else {
			Util.setupLogger().log(Level.INFO, "Saldo insuficiente!");
		}
	}
	
	public abstract void depositar(Double valor);
	
}
