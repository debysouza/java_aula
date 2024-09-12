package br.com.exemplo.principal;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
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
		
//		Disciplina disciplinaParametrizada = new Disciplina("POO", "Déby", 3);
//		System.out.println(disciplinaParametrizada);
		
		Disciplina disciplinaParametrizada1 = new Disciplina("POO");
		System.out.println(disciplinaParametrizada1.getNome());

		Disciplina d3 = new Disciplina(3, "Déby", "POO");
		Disciplina d1 = new Disciplina(5, "Déby", "LP");
		Disciplina d2 = new Disciplina(2, "Ricardo", "BD");
		
//		List<Disciplina> listaD = new ArrayList<>();
		Disciplina.disciplinas.add(d1);
		Disciplina.disciplinas.add(d2);
		Disciplina.disciplinas.add(d3);
//		Collections.sort(Disciplina.disciplinas);
		log.log(Level.INFO, Disciplina.disciplinas::toString);
		
		/*Volta da ordenação*/
//		List<String> listaP = new ArrayList<>();
//		listaP.add(d1.getProfessor());
//		listaP.add(d2.getProfessor());
//		listaP.add(d3.getProfessor());
//		Collections.sort(listaP);
//		log.log(Level.INFO, listaP::toString);
		
		/*Percorrer os objetos Disciplina, localizar pelo nome do professor e adicionar em uma nova lista*/
//		List<Disciplina> listaOrdenada = new ArrayList<>();
//		while(!listaP.isEmpty()) {
//			for(Disciplina disc : listaD) {
//				if(disc.getProfessor().equals(listaP.get(0))) {
//					listaOrdenada.add(disc);
//					listaP.remove(0);
	//				listaD.remove(listaD.indexOf(disc));
//				}
//				if(listaP.isEmpty()) {
//					break;
//				}
//			}
//		}
//		log.log(Level.INFO, listaOrdenada::toString);
		/**/
		
		Set<Disciplina> listaSetDisc = new TreeSet<>();
		listaSetDisc.add(d2);
		listaSetDisc.add(d3);
		listaSetDisc.add(d1);
		log.log(Level.INFO, "Lista com Set");
		log.log(Level.INFO, listaSetDisc::toString);
		
	}
}
