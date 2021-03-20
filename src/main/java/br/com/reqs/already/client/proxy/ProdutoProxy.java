package br.com.reqs.already.client.proxy;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.reqs.already.api.v1.ws.AtualizarProduto;
import br.com.reqs.already.api.v1.ws.AtualizarProdutoResponse;
import br.com.reqs.already.api.v1.ws.AuthorizationException;
import br.com.reqs.already.api.v1.ws.CriarProduto;
import br.com.reqs.already.api.v1.ws.CriarProdutoResponse;
import br.com.reqs.already.api.v1.ws.GetProdutoById;
import br.com.reqs.already.api.v1.ws.GetProdutoByIdResponse;
import br.com.reqs.already.api.v1.ws.GetProdutos;
import br.com.reqs.already.api.v1.ws.GetProdutosResponse;
import br.com.reqs.already.api.v1.ws.ProdutoWS;
import br.com.reqs.already.api.v1.ws.RemoverProduto;
import br.com.reqs.already.api.v1.ws.RemoverProdutoResponse;
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
	
	/**
	 * Endpoint getProdutoById, recebe como parâmetro o token, e o id,
	 * busca e retorna o produto cadastrados na base de dados.
	 * 
	 * @param token
	 * @param id
	 * @return
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "getProdutoById")
	@WebResult(name = "produtos")
	public GetProdutoByIdResponse getProdutoById(@WebParam(name = "token", header = true) String token, 
			@WebParam(name = "id") @XmlElement(required = true) Long id) 
			throws MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/ProdutoWS?wsdl");
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "ProdutoWSService");
		
		Service service = Service.create(url, qname);
		
		ProdutoWS produtoWs = service.getPort(ProdutoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		GetProdutoById produtoRequest = new GetProdutoById();
		produtoRequest.setId(1L);
		
		GetProdutoByIdResponse produtoResponse = produtoWs.getProdutoById(produtoRequest, novoToken);
		
		return produtoResponse;
	}
	
	/**
	 * Endpoint criar, recebe como parâmetro o token no header, e ProdutoDTO. Cria
	 * um novo dado de produto no banco de dados.
	 * 
	 * @param token
	 * @param produtoRequest
	 * @return
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "criarProduto")
	@WebResult(name = "produto")
	public CriarProdutoResponse criar(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "produto") @XmlElement(required = true) CriarProduto produtoRequest) 
			throws MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/ProdutoWS?wsdl");
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "ProdutoWSService");
		
		Service service = Service.create(url, qname);
		
		ProdutoWS produtoWs = service.getPort(ProdutoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		CriarProdutoResponse produtoResponse = produtoWs.criarProduto(produtoRequest, novoToken);
		
		return produtoResponse;
	}
	
	/**
	 * Endpoint atualizar, recebe como parâmetro o token no header, ProdutoDTO. 
	 * Atualiza um registro já existente no banco de dados.
	 * 
	 * @param token
	 * @param produtoDTO
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "atualizarProduto")
	@WebResult(name = "produto")
	public AtualizarProdutoResponse atualizar(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "produto") @XmlElement(required = true) AtualizarProduto produtoRequest) 
			throws MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/ProdutoWS?wsdl");
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "ProdutoWSService");
		
		Service service = Service.create(url, qname);
		
		ProdutoWS produtoWs = service.getPort(ProdutoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		AtualizarProdutoResponse produtoResponse = produtoWs.atualizarProduto(produtoRequest, novoToken);
		
		return produtoResponse;
	}

	@WebMethod(operationName = "removerProduto")
	@WebResult(name = "produto")
	public RemoverProdutoResponse remover(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "produto") @XmlElement(required = true) RemoverProduto produtoRequest) 
			throws MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/ProdutoWS?wsdl");
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "ProdutoWSService");
		
		Service service = Service.create(url, qname);
		
		ProdutoWS produtoWs = service.getPort(ProdutoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		RemoverProdutoResponse produtoResponse = produtoWs.removerProduto(produtoRequest, novoToken);
		
		return produtoResponse;
	}	
	
}
