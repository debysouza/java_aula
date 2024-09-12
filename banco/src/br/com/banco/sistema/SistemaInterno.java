package br.com.banco.sistema;

import br.com.banco.contas.ContaCorrente;
import br.com.banco.contas.ContaPoupanca;
import br.com.banco.enums.TipoContaEnum;
import br.com.banco.enums.TipoUsuarioEnum;
import br.com.banco.io.LeituraEscrita;
import br.com.banco.io.Relatorio;
import br.com.banco.usuarios.Funcionario;
import br.com.banco.usuarios.Gerente;

//DecimalFormat df = new DecimalFormat("0,000.00");
//double saldo = 2500.;
//System.out.println(df.format(saldo));

public class SistemaInterno {

	public static void main(String[] args) {
		
		LeituraEscrita.leitor("dados");
		Relatorio.relatorioGerente();

		/*Teste criação de objetos ContaCorrente e ContaPoupança*/
		ContaCorrente cc = new ContaCorrente(TipoContaEnum.CORRENTE, 123, 123456, 101, "Lucas", 200., true);
		System.out.println(cc);
		
		ContaPoupanca cp = new ContaPoupanca(TipoContaEnum.POUPANCA, 456, 987654, 102, "Diogo", 2000.);
		System.out.println(cp);
		/**/

		/*Teste Objeto Gerente com Herança*/
		Gerente gerente1 = new Gerente(15, 0., "Thallis", "123", 200., 123, "thallis");
		System.out.println(gerente1.autenticar(147, "thallis"));
		System.out.println(gerente1.getBonificacao());
		/**/

		/*Teste Polimorfismo*/
		Gerente gerente = new Gerente(15, 0., "Thallis", "123", 200., 123, "thallis");
		Funcionario funcionario = gerente;
		funcionario.getSalario();
		Gerente ger = (Gerente) funcionario;
		System.out.println(ger.getBonificacao());

		Funcionario funcionario1 = new Gerente(15, 0., "Thallis", "123", 5000., 123, "thallis");
		System.out.println(funcionario1.getBonificacao());

		Gerente g = new Gerente();
		g.getBalanco();
		/**/
		
		/*Teste Enum*/
		if (4 == TipoUsuarioEnum.OPERADOR_CAIXA.ordinal()) {
			System.out.println("Tipo de usuário é " + TipoUsuarioEnum.OPERADOR_CAIXA.name());
		} else if ("Gerente Regional".equalsIgnoreCase(TipoUsuarioEnum.GERENTE_REGIONAL.getTipo())) {
			System.out.println("Tipo de usuário é " + TipoUsuarioEnum.GERENTE_REGIONAL.name());
		} else {
			System.out.println("Nenhuma das opções acima!");
		}
		/**/
	}

}
