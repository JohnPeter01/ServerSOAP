package br.com.joni.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import br.com.joni.config.BuscaService;

@ComponentScan("br.com.joni.config")
@WebService(endpointInterface = "br.com.joni.ws.BuscaPessoa")
public class BuscaPessoaImpl implements BuscaPessoa{

	@Autowired
	BuscaService service;
	@Autowired
	ApplicationContext context;
	
	@WebMethod
	public String buscaPessoa(String nome) {
		
		service = context.getBean(BuscaService.class);
		
		return service.buscaPessoa(nome);
	}

}