package br.com.banco.enums;

public enum TipoContaEnum {

	CORRENTE("Corrente", 1),
	POUPANCA("Poupança", 2);

	private String tipo;
	private int codigo;
	
	TipoContaEnum(String tipo, int codigo) {
		this.tipo = tipo;
		this.codigo = codigo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
