package br.com.banco.contas;

public interface Transacao {

	public void transferir(Double valor, Conta destino);
	
}
