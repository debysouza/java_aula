package br.com.banco.sistema;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

import br.com.banco.enums.TipoUsuarioEnum;
import br.com.banco.io.Relatorio;
import br.com.banco.usuarios.Funcionario;
import br.com.banco.usuarios.Gerente;
import br.com.banco.utils.Util;

public class Menu {

	boolean autenticado = false;
	Scanner sc = new Scanner(System.in);

	public void menu() throws InterruptedException {
		logo();
		Funcionario func = autenticacao();
		if (autenticado) {
			menuPrincipal(func);
		}
	}

	public void logo() {
		Util.setupLogger().log(Level.INFO, "LOGO");
	}

	public Funcionario autenticacao() {
		String login;
		int senha;
		
		Util.setupLogger().log(Level.INFO, "Informe seu login: ");
		login = sc.next();
		Util.setupLogger().log(Level.INFO, "Informe sua senha: ");
		senha = sc.nextInt();

		/* Exemplo de verificação com Map na superclasse */
		for (Map.Entry<String, Funcionario> ff : Funcionario.getMapaFuncionarios().entrySet()) {
			if (ff.getValue().getLogin().equals(login) && ff.getValue().getSenha() == senha) {
				autenticado = true;
				return ff.getValue();
			}
		}
		/**/
		/*
		 * Exemplo de verificação com Map nas subclasses, precisa de um campo para o
		 * usuário informar qual o tipo de acesso dele, pode ser um switch/case
		 */
		if (TipoUsuarioEnum.GERENTE_REGIONAL.getTipo().equalsIgnoreCase("Gerente")) {
			for (Map.Entry<Integer, Gerente> gg : Gerente.getMapaGerentes().entrySet()) {
				if (gg.getValue().getLogin().equals(login) && gg.getValue().getSenha() == senha) {
					autenticado = true;
					return gg.getValue();
				}
			}
		}
		/**/
		return null;
	}

	public void menuPrincipal(Funcionario funcionario) throws InterruptedException {
		int opcao;
		char opcaoMenu;

		Util.setupLogger().log(Level.INFO, () -> "Bem-vindo(a), " + funcionario.getNome());
		Util.setupLogger().log(Level.INFO,
				"Menu:\n[1]\tRelatório Impresso\n[2]\tRelatório na Tela\n[3]\tSair\nDigite a opção: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			opcaoMenu = 'i';
			menuRelatorio(opcaoMenu);
			break;
		case 2:
			opcaoMenu = 't';
			menuRelatorio(opcaoMenu);
			break;
		case 3:
			Util.setupLogger().log(Level.INFO, "Volte sempre!");
			break;
		default:
			Util.setupLogger().log(Level.INFO, "Opção inválida, tente novamente!");
			Thread.sleep(2000);
			menuPrincipal(funcionario);
			break;
		}
	}

	public void menuRelatorio(char op) {
		switch (op) {
		case 'i':
			Relatorio.relatorioGerente('i');
			break;
		case 't':
			Relatorio.relatorioGerente('t');
			break;
		default:
			Util.setupLogger().log(Level.INFO, "Erro");
			break;
		}
	}

}
