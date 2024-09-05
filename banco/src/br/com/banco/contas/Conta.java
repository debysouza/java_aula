package br.com.banco.contas;

import java.text.DecimalFormat;

public class Conta {

	DecimalFormat df = new DecimalFormat("0,000.00");
	
	//definição dos atributos
	private int numero;
	private String titular;
	private double saldo;
	private static int totalContas;
	
	//Construtor default
	public Conta() {
	}

	//Construtor parametrizado
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		totalContas += 1;
	}

	//Get e Set
	public int getNumero() {
		return numero;
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
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldoFormatado=" + df.format(saldo) + ", saldo=" + saldo + "]";
	}

}
