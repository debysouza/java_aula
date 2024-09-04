package br.com.aula_poo.exercicios_aula;

import java.util.Scanner;

/*
 * 1) Declare duas variáveis do tipo int e realize sua soma. 
 * Em  seguida, realize o casting destes dois inteiros para 
 * double para  realizar sua divisão.
 */
public class Casting {

	public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número 1: ");
		num1 = sc.nextInt();
		
		System.out.print("Informe o número 2: ");
		num2 = sc.nextInt();
		sc.close();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		double div = (double) num1 / (double) num2;
		System.out.println("O resultado da divisão é: " + div);
	}
	
}
