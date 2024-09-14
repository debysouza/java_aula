package br.com.banco.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

import br.com.banco.contas.ContaCorrente;
import br.com.banco.contas.ContaPoupanca;
import br.com.banco.enums.TipoContaEnum;
import br.com.banco.enums.TipoUsuarioEnum;
import br.com.banco.usuarios.Funcionario;
import br.com.banco.usuarios.Gerente;
import br.com.banco.utils.Util;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) {
		BufferedReader buffRead;
		try {
			buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
			String linha = "";

			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					String[] dados = linha.split(";");
					// ContaCorrente(TipoContaEnum tipo, int id, int numero, int agencia, String
					// titular, double saldo, boolean chequeEspecial)
					if (dados[0].equalsIgnoreCase(TipoContaEnum.CORRENTE.getTipo())) {
						ContaCorrente cc = new ContaCorrente(TipoContaEnum.CORRENTE, Integer.parseInt(dados[1]),
								Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), dados[4],
								Double.parseDouble(dados[5]), Boolean.parseBoolean(dados[6]));
						Util.setupLogger().log(Level.INFO, cc::toString);
						// Inserir o Map
						ContaCorrente.getMapaContasCorrente().put(Integer.parseInt(dados[1]), cc);
						// ContaPoupanca(TipoContaEnum tipo, int id, int numero, int agencia, String
						// titular, double saldo)
					} else if (dados[0].equalsIgnoreCase(TipoContaEnum.POUPANCA.getTipo())) {
						ContaPoupanca cp = new ContaPoupanca(TipoContaEnum.POUPANCA, Integer.parseInt(dados[1]),
								Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), dados[4],
								Double.parseDouble(dados[5]));
						Util.setupLogger().log(Level.INFO, cp::toString);
						ContaPoupanca.getMapaContasPoupanca().put(Integer.parseInt(dados[1]), cp);
						// Gerente(TipoUsuarioEnum tipo, int id, String nome, String cpf, double
						// salario, int senha, String login)
					} else if (TipoUsuarioEnum.GERENTE_REGIONAL.getTipo().contains(dados[0])) {
						Gerente gg = new Gerente(TipoUsuarioEnum.GERENTE_REGIONAL, Integer.parseInt(dados[1]), dados[2],
								dados[3], Double.parseDouble(dados[4]), Integer.parseInt(dados[5]), dados[6]);
						Util.setupLogger().log(Level.INFO, gg::toString);
						Gerente.getMapaGerentes().put(Integer.parseInt(dados[1]), gg);
						/*Adicionando o Gerente no Mapa de Funcionários*/
						Funcionario.getMapaFuncionarios().put(dados[3], gg);
						/**/
					}
				} else {
					break;
				}
			}
			buffRead.close();
		} catch (FileNotFoundException e) {
			String result = "Arquivo não encontrado no caminho " + PATH_BASICO + path + EXTENSAO;
			Util.setupLogger().log(Level.INFO, result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
