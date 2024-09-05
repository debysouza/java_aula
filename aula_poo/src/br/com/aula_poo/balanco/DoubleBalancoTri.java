package br.com.aula_poo.balanco;

import java.text.DecimalFormat;

/*
 * Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. 
 * Para fechar o balanço do  primeiro trimestre, precisamos somar o 
 * gasto total. Sabendo que, 
 * em Janeiro, foram gastos R$  15000, 
 * em Fevereiro, R$ 23000, e 
 * em Março, R$ 17000, 
 * faça um programa que calcule e imprima o  gasto total no trimestre.
 */
public class DoubleBalancoTri {
	
//	private Integer janeiro = 15000;
//	private Integer fevereiro = 23000;
//	private Integer marco = 17000;
	
	public static void main(String[] args) {
		//Removendo necessidade do static nos demais métodos ou atributos
		DoubleBalancoTri doubleBalanco = new DoubleBalancoTri();
		doubleBalanco.soma();
	}
	
	public void soma() {
		Double janeiro = 15000.;
		Double fevereiro = 23000.;
		Double marco = 17000.;
		double soma;
		
		soma = janeiro + fevereiro + marco;
		
		System.out.println("O gasto total do trimestre foi: " + soma);
		
		System.out.printf("O gasto total do trimestre foi: %.2f", soma);
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\nO gasto total do trimestre foi: " + df.format(soma));
	}
	
}
