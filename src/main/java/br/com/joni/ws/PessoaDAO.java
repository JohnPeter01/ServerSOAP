package br.com.joni.ws;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaDAO")
public class PessoaDAO {

	protected final static Map<String, Pessoa> PESSOAS = new HashMap<String, Pessoa>();
	static {
		PESSOAS.put("Paulo", new Pessoa("Paulo Guilherme Silveira",36,"165.232.356-98"));
		PESSOAS.put("Rodrigo", new Pessoa("Rodrigo Turini Versanini",56,"267.834.123-99"));
	}

	public Pessoa getPesoa(String nome) {
		return PESSOAS.get(nome);
	}

}
