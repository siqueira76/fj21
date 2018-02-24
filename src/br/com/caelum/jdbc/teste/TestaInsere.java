package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// Pronto para gravar
		Contato contato = new Contato();
		
		contato.setNome("Josy Siqueira");
		contato.setEmail("josy@siqueira.com.br");
		contato.setEndereco("Rua Marilia, 85");
		contato.setDataNascimento(Calendar.getInstance());
		
		//Grave a conexão
		ContatoDao dao = new ContatoDao();
		
		//Metodo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado");

	}

}
