package br.com.joni.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "br.com.joni.ws.BuscaPessoa")
public class BuscaPessoaImpl implements BuscaPessoa{
	
	@WebMethod
	public String buscaPessoa(String nome) {
		
		PessoaDAO people = new PessoaDAO();
		
		Pessoa pessoa = people.getPesoa(nome);
		
		return pessoa.toString();
	}

}
