package br.com.aula_poo.balanco;

/*
 * Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. 
 * Para fechar o balanço do  primeiro trimestre, precisamos somar o 
 * gasto total. Sabendo que, 
 * em Janeiro, foram gastos R$  15000, 
 * em Fevereiro, R$ 23000, e 
 * em Março, R$ 17000, 
 * faça um programa que calcule e imprima o  gasto total no trimestre.
 */
public class IntegerBalancoTri {

//	private Integer janeiro = 15000;
//	private Integer fevereiro = 23000;
//	private Integer marco = 17000;
	
	public static void main(String[] args) {
		//Removendo necessidade do static nos demais métodos ou atributos
		IntegerBalancoTri intBalanco = new IntegerBalancoTri();
		intBalanco.soma();
//		int soma = intBalanco.janeiro + intBalanco.fevereiro + intBalanco.marco;
	}
	
	public void soma() {
		Integer janeiro = 15000;
		Integer fevereiro = 23000;
		Integer marco = 17000;
		int soma;
		
		soma = janeiro + fevereiro + marco;
		System.out.println("O gasto total do trimestre foi: " + soma);
	}
	
}
