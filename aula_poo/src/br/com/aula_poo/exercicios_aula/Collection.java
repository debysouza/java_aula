package br.com.aula_poo.exercicios_aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

import br.com.aula_poo.utils.Util;

public class Collection {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Luan");
		lista.add("Ana");
		lista.add("Igor");
		Util.setupLogger().log(Level.INFO, lista::toString);
		
		/*Ordena em ordem alfabética*/
		Collections.sort(lista);
		Util.setupLogger().log(Level.INFO, lista::toString);
		/**/
		
		lista.remove(1);
		Util.setupLogger().log(Level.INFO, lista::toString);
		
		/*Imprime um elemento específico da lista*/
		Util.setupLogger().log(Level.INFO, lista.get(1));
		/**/
	}
}
