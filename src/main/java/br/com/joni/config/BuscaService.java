package br.com.joni.config;

import java.time.Instant;

import org.springframework.stereotype.Controller;

import br.com.joni.ws.Pessoa;
import br.com.joni.ws.PessoaDAO;

@Controller
public class BuscaService {
	
	public String buscaPessoa(String nome) {
		
		PessoaDAO people = new PessoaDAO();
		
		Pessoa pessoa = people.getPesoa(nome);
		
		return pessoa.toString() + " " + Instant.now();
	}
}