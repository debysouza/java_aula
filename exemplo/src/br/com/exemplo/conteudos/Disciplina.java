package br.com.exemplo.conteudos;

public class Disciplina {

	//definições dos atributos
	public String nome;
	private String professor;
	protected int nivel;
	
	//Construtor default
	public Disciplina() {
	}
	
	//Construtor parametrizado
	public Disciplina(String nome, String professor, int nivel) {
		this.nome = nome;
		this.professor = professor;
		this.nivel = nivel;
	}
	
	//Construtor parametrizado
	public Disciplina(String nome) {
		this.nome = nome;
	}

	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Disciplina:\n\tnome=" + nome + "\n\tprofessor=" + professor + "\n\tnivel=" + nivel;
	}
	
}
