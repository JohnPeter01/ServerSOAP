package br.com.joni.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlRootElement;

@WebService(targetNamespace = "http://ws.joni.com.br/")
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
@XmlRootElement
public interface BuscaPessoa {

	@WebMethod
	@WebResult(partName="buscaPessoaResponse")
	String buscaPessoa(String pessoa);

}
