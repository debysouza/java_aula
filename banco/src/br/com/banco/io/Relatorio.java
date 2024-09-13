package br.com.banco.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

import br.com.banco.contas.ContaCorrente;
import br.com.banco.utils.Util;

public class Relatorio {

	//Método para cadastro no banco(arquivo)
	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);  
//		Util.setupLogger().log(Level.INFO, "Escreva o nome do arquivo: ");
//		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(LeituraEscrita.PATH_BASICO+path+LeituraEscrita.EXTENSAO, true));  
		String linha = "";

		Util.setupLogger().log(Level.INFO, "Escreva algo:");
		linha = sc.nextLine();
		sc.close();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}
	//Relatório de Contas Corrente
	public static void relatorioGerente() {
		String nome = "relatorio_contas_corrente";
		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(LeituraEscrita.PATH_BASICO+nome+LeituraEscrita.EXTENSAO, true));
			buffWrite.append("###########INÍCIO##########\n");
			LocalDateTime data = LocalDateTime.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			buffWrite.append(data.format(formato));
			for(Map.Entry<Integer, ContaCorrente> cc : ContaCorrente.getMapaContasCorrente().entrySet()) {
				buffWrite.append("\nTitular: " + cc.getValue().getTitular() + "\nAgência: " + cc.getValue().getAgencia() + "\nConta Corente: " + cc.getValue().getNumero());
			}
			buffWrite.append("\n###########FIM#############\n");
			buffWrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
