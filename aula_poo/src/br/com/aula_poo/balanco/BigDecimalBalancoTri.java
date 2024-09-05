package br.com.aula_poo.balanco;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BigDecimalBalancoTri {

//	private Integer janeiro = 15000;
//	private Integer fevereiro = 23000;
//	private Integer marco = 17000;
	
	public static void main(String[] args) {
		//Removendo necessidade do static nos demais métodos ou atributos
		BigDecimalBalancoTri bigDecimalBalanco = new BigDecimalBalancoTri();
		bigDecimalBalanco.soma();
	}
	
	public void soma() {
		BigDecimal janeiro = new BigDecimal(15000);
		BigDecimal fevereiro = new BigDecimal(23000);
		BigDecimal marco = new BigDecimal(17000);
		
//		BigDecimal soma = new BigDecimal(0);
//		soma = soma.add(janeiro);
//		soma = soma.add(fevereiro);
//		soma = soma.add(marco);
//		System.out.println("O gasto total do trimestre foi: " + soma);
		
		BigDecimal soma = janeiro.add(fevereiro).add(marco);
		System.out.println("O gasto total do trimestre foi: " + soma);
		
		BigDecimal somaFormatada = soma.setScale(2, RoundingMode.HALF_DOWN);
		System.out.println("O gasto total do trimestre foi: " + somaFormatada);
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("O gasto total do trimestre foi: " + df.format(soma));
		
		System.out.printf("O gasto total do trimestre foi: %.2f", soma);
	}
	
}
