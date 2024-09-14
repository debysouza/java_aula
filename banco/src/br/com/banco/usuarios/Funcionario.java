package br.com.banco.usuarios;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {

	//definição de atributos
	private int id;
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private String login;
	/*Variável para incrementar +1 ao id de Funcionário a cada inserção no mapaS*/
	private static int totalFuncionarios = 0;
	/**/
	/*Mapa de Funcionários usando cpf como chave*/
	private static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();
	/**/
	
	//Construtor default
	public Funcionario() {
	}

	//Construtor parametrizado	
	public Funcionario(String nome, String cpf, double salario, int senha, String login) {
		this.id = totalFuncionarios;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.login = login;
		totalFuncionarios++;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	//Get e Set
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", senha=" + senha + ", login="
				+ login + "]";
	}

	public static Map<String, Funcionario> getMapaFuncionarios() {
		return mapaFuncionarios;
	}

	public int getId() {
		return id;
	}
	
}
