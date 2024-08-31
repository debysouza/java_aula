package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		double soma;
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextDouble();
		soma = n1 + n2;
		System.out.println("A soma é " + soma);
		sc.close();
	}
	
}
