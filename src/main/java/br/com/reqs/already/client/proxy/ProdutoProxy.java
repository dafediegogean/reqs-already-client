package br.com.reqs.already.client.proxy;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.reqs.already.api.v1.ws.ProdutoWS;
import br.com.reqs.already.api.v1.ws.TodosOsProdutos;
import br.com.reqs.already.api.v1.ws.TodosOsProdutosResponse;
import br.com.reqs.already.api.v1.ws.Token;

@WebService
public class ProdutoProxy {
	
	/**
	 * Método getAll(String token), recebe como parâmetro o token,
	 * busca e retorna todos os produtos cadastrados na base de dados.
	 * 
	 * @param token
	 * @return ListaProdutoDTO
	 * @throws MalformedURLException 
	 */
	@WebMethod(operationName = "consumeGetAll")
	@WebResult(name = "produtos")
	public TodosOsProdutosResponse consumeGetAll(@WebParam(name = "token", header = true) String token) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/ProdutoWS?wsdl");
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "ProdutoWSService");
		
		Service service = Service.create(url, qname);
		
		ProdutoWS produtoWs = service.getPort(ProdutoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		TodosOsProdutos parameters = new TodosOsProdutos();
		parameters.setPaginacao(true);
		
		TodosOsProdutosResponse todosOsProdutos = produtoWs.todosOsProdutos(parameters, novoToken);
		
		return todosOsProdutos;
//		return new ListaProdutoDTO(produtos);
	}
	
}
