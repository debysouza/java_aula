package br.com.aula_poo.exercicios_aula;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/*
 * Escreva um programa que escreva na console o dia de hoje, o dia da semana, 
 * mês e ano atual. 
 * Alem disso, exiba a quantidade de anos desde sua data de nascimento.
 */

public class Data {

	public static void main(String[] args) {
		/*Renata*/
		Locale brasil = new Locale("pt", "BR");
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy", brasil);
		/**/
		LocalDate ld = LocalDate.now(zoneId);
		System.out.println("Data atual: " + ld);
		/*Data atual formatada*/
		System.out.println("Data atual formatada: " + ld.format(formatador));
		/**/
		System.out.println("Dia da semana: " + ld.getDayOfWeek().name());
		System.out.println("Dia da semana: " + ld.getDayOfWeek().getValue());
		/*Dia da semana formatada*/
		System.out.println("Dia da semana formatada: " + ld.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		/**/
		System.out.println("Mês atual: " + ld.getMonth());
		System.out.println("Mês atual: " + ld.getMonthValue());
		System.out.println("Ano atual: " + ld.getYear());
		System.out.println("Dia atual: " + ld.getDayOfMonth());
		
		LocalDate dataAniversario = LocalDate.of(1990, Month.SEPTEMBER, 5);
		Period periodo = Period.between(dataAniversario, ld);
		System.out.println("Anos completos desde o aniversário: " + periodo.getYears());
	}

	
}
