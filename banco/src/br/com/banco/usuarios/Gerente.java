package br.com.banco.usuarios;

import java.util.HashMap;
import java.util.Map;

import br.com.banco.enums.TipoUsuarioEnum;

public class Gerente extends Funcionario {

	// Definição dos atributos
	private TipoUsuarioEnum tipo = TipoUsuarioEnum.GERENTE_REGIONAL;
	private int id;
	private int numeroFuncionarios;
	private double balanco;
	private static Map<Integer, Gerente> mapaGerentes = new HashMap<>();

	// Construtor default
	public Gerente() {
		super();
	}
	
	// Construtor parametrizado do pai
	public Gerente(TipoUsuarioEnum tipo, int id, String nome, String cpf, double salario, int senha, String login) {
		super(nome, cpf, salario, senha, login);
		this.id = id;
	}

	// Construtor parametrizado
	public Gerente(int numeroFuncionarios, double balanco, String nome, String cpf, double salario, int senha, String login) {
		super(nome, cpf, salario, senha, login);
		this.numeroFuncionarios = numeroFuncionarios;
		this.balanco = balanco;
	}

	public double getBonificacao() {
		return super.getSalario() * 0.15;
	}
	
	//Método de autenticação
	public boolean autenticar(int senha, String login) {
		if(super.getSenha() == senha && super.getLogin().equals(login)) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	// Get e Set
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public double getBalanco() {
		return balanco;
	}

	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}

	@Override
	public String toString() {
		return "Gerente [numeroFuncionarios=" + numeroFuncionarios + ", balanco=" + balanco + "]";
	}

	public TipoUsuarioEnum getTipo() {
		return tipo;
	}

	public int getId() {
		return id;
	}

	public static Map<Integer, Gerente> getMapaGerentes() {
		return mapaGerentes;
	}

}
