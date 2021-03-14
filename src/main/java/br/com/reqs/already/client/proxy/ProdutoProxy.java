package br.com.reqs.already.client.proxy;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.reqs.already.api.v1.ws.AuthorizationException;
import br.com.reqs.already.api.v1.ws.GetProdutos;
import br.com.reqs.already.api.v1.ws.GetProdutosResponse;
import br.com.reqs.already.api.v1.ws.ProdutoWS;
import br.com.reqs.already.api.v1.ws.Token;

@WebService
public class ProdutoProxy {
		
	/**
	 * Endpoint getProdutos, recebe como parâmetro o token,
	 * busca e retorna todos os produtos cadastrados na base de dados.
	 * 
	 * @param token
	 * @return
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "getProdutos")
	@WebResult(name = "produtos")
	public GetProdutosResponse getProdutos(@WebParam(name = "token", header = true) String token) 
			throws MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/ProdutoWS?wsdl");
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "ProdutoWSService");
		
		Service service = Service.create(url, qname);
		
		ProdutoWS produtoWs = service.getPort(ProdutoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		GetProdutos parameters = new GetProdutos();
		parameters.setPaginacao(true);
		
		GetProdutosResponse produtos = produtoWs.getProdutos(parameters, novoToken);
		
		return produtos;
	}
	
}
