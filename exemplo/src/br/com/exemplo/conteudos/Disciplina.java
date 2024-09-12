package br.com.exemplo.conteudos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Disciplina implements Comparable<Disciplina> {

	//definições dos atributos
	private String professor;
	public String nome;
	protected int nivel;
	
	public static List<Disciplina> disciplinas = new ArrayList<>();
	
	//Construtor default
	public Disciplina() {
	}
	
	//Construtor parametrizado
	public Disciplina(int nivel, String professor, String nome) {
		this.professor = professor;
		this.nome = nome;
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
		return "\nDisciplina [professor=" + professor + ", nome=" + nome + ", nivel=" + nivel + "]";
	}
	
//	@Override
//	public int compareTo(Disciplina disc) {
//		return this.professor.compareTo(disc.professor);
//	}

	@Override
	public int compareTo(Disciplina disc) {
		Integer professor = this.professor.compareTo(disc.professor);
		if(professor != 0) {
			return professor;
		}
		return this.nome.compareTo(disc.nome);
	}
	
//	Comparator
//	Comparar o objeto inteiro
//	@Override
//	public int compare(Disciplina d1, Disciplina d2) {
//		return d1.compare(d1, d2);
//	}
	
}
