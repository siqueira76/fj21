package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();

		Contato contato = new Contato();
		contato.setNome("José");
		contato.setEmail("jc@siqueira.com.br");
		contato.setEndereco("Rua Marilia");
		contato.setDataNascimento(Calendar.getInstance());

		dao.altera(contato);

	}

}
