package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

/*
 * Lista 1 - Exercício 1
 * Escreva e leia o nome e sobrenome.
 */
public class PrimeiroExercicio {
	
	public static void main(String[] args) {
		//instância
		Scanner sc = new Scanner(System.in);
		//cadeia nome
		String nome;
		//cadeia nome
		String sobrenome;
		//escreva("Digite seu nome: ")
		System.out.print("Digite seu nome: ");
		//leia(nome)
		nome = sc.nextLine();
		//escreva("Digite seu sobrenome: ")
		System.out.print("Digite seu sobrenome: ");
		//leia(sobrenome)
		sobrenome = sc.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome + ". Seja bem-vindo ao mundo de POO!");
//		System.out.printf("Olá, %s %s", nome, sobrenome);
		sc.close();
	}
	
}
