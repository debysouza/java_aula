package br.com.aula_poo.exercicios_aula;

/*
 * 2) Declare dois caracteres: ‘A’ e ‘Z’, depois realize sua soma 
 * e armazene em uma variável do tipo int.
 */
public class Alfabeto {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'Z';
		
		int soma = c1 + c2;
		System.out.println(soma);
		
		//Casting
		String a = "a";
		int valorConvertido = Integer.parseInt(a);
		System.out.println(valorConvertido);
	}
	
}
