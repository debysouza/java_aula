package br.com.exemplo.principal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.exemplo.conteudos.Disciplina;
import br.com.exemplo.io.LeituraEscrita;
import br.com.exemplo.utils.Util;

public class Sistema {

	//chamada do Logger
	private static Logger log = Util.setupLogger();
	
	public static void main(String[] args) throws IOException {
		
		LeituraEscrita.leitor("dados");
		LeituraEscrita.escritor("dados");
		
		Logger logger = Logger.getLogger(Sistema.class.getName());
		Disciplina disciplina;
		disciplina = new Disciplina();
		disciplina.setNome("POO");
		disciplina.setProfessor("Déby");
		disciplina.setNivel(3);
		
		System.out.println(disciplina);
		logger.info(disciplina::toString); //com informações adicionais do Logger
		String dados = disciplina.toString() + "Teste";
		log.log(Level.INFO, dados); //Logger formatado
		log.log(Level.INFO, disciplina::toString);
		log.log(Level.INFO, "Teste realizado!");
		
		Disciplina disciplinaParametrizada = new Disciplina("POO", "Déby", 3);
		System.out.println(disciplinaParametrizada);
		
		Disciplina disciplinaParametrizada1 = new Disciplina("POO");
		System.out.println(disciplinaParametrizada1.getNome());
		
	}
}
