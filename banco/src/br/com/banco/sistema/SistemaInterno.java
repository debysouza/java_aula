package br.com.banco.sistema;

import br.com.banco.contas.Conta;

//DecimalFormat df = new DecimalFormat("0,000.00");
//double saldo = 2500.;
//System.out.println(df.format(saldo));

public class SistemaInterno {

	public static void main(String[] args) {
		Conta minhaConta = new Conta(123, "Igor", 2500.);
		System.out.println(minhaConta);	
	}
	
}
