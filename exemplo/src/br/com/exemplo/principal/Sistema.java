package br.com.exemplo.principal;

import br.com.exemplo.conteudos.Disciplina;

public class Sistema {

	public static void main(String[] args) {
		Disciplina disciplina;
		disciplina = new Disciplina();
		disciplina.setNome("POO");
		disciplina.setProfessor("Déby");
		disciplina.setNivel(3);
		System.out.println(disciplina);
		
		Disciplina disciplinaParametrizada = new Disciplina("POO", "Déby", 3);
		System.out.println(disciplinaParametrizada);
		
		Disciplina disciplinaParametrizada1 = new Disciplina("POO");
		System.out.println(disciplinaParametrizada1.getNome());
		
	}
}
