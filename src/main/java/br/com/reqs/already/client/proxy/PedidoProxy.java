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

import br.com.reqs.already.api.v1.ws.AtualizarPedido;
import br.com.reqs.already.api.v1.ws.AuthorizationException;
import br.com.reqs.already.api.v1.ws.CriarPedido;
import br.com.reqs.already.api.v1.ws.GetPedidoById;
import br.com.reqs.already.api.v1.ws.GetPedidoByIdResponse;
import br.com.reqs.already.api.v1.ws.GetPedidos;
import br.com.reqs.already.api.v1.ws.GetPedidosResponse;
import br.com.reqs.already.api.v1.ws.PedidoWS;
import br.com.reqs.already.api.v1.ws.RemoverPedido;
import br.com.reqs.already.api.v1.ws.Token;

/**
 * WebService que atende as demais operations para buscar, criar, atualizar 
 * e remover ao pedido.
 * 
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 20 de mar de 2021, 20:24:10
 */
@WebService
public class PedidoProxy {

	/**
	 * Endpoint getPedidos, recebe como parâmetro o token no header, e um booleano, a 
	 * paginacao. Lista todos os pedidos cadastrados.
	 * 
	 * @param token
	 * @param paginacao
	 * @return ListaPedidoDTO
	 * @throws AuthorizationException 
	 */
	@WebMethod(operationName = "getPedidos")
	@WebResult(name = "pedidos")
	public GetPedidosResponse getAll(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "paginacao") @XmlElement(required = false) boolean paginacao) throws 
		MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/PedidoWS?wsdl");
		
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSService");
		
		Service service = Service.create(url, qname);
		
		PedidoWS pedidoWs = service.getPort(PedidoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		GetPedidos pedidoRequest = new GetPedidos();
		pedidoRequest.setPaginacao(true);
		
		GetPedidosResponse pedidoResponse = pedidoWs.getPedidos(pedidoRequest, novoToken);
		
		
		return pedidoResponse;
	}
	
	/**
	 * Endpoint getPedidoById, recebe como parâmetro o token no header, e o id. Busca
	 * o pedido através do id passado.
	 * 
	 * @param token
	 * @param paginacao
	 * @return
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "getPedidoById")
	@WebResult(name = "pedido")
	public GetPedidoByIdResponse getPedidoById(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "id") @XmlElement(required = true) Long id) throws 
		MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/PedidoWS?wsdl");
		
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSService");
		
		Service service = Service.create(url, qname);
		
		PedidoWS pedidoWs = service.getPort(PedidoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		GetPedidoById pedidoRequest = new GetPedidoById();
		pedidoRequest.setId(id);
		
		GetPedidoByIdResponse pedidoResponse = pedidoWs.getPedidoById(pedidoRequest, novoToken);
		
		return pedidoResponse;
	}
	
	/**
	 * Endpoint criar, recebe como parâmetro o token no header, e PedidoDTO. Cria
	 * um novo dado de pedido no banco de dados.
	 * 
	 * @param token
	 * @param pedidoRequest
	 * @return
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "criarPedido")
	@WebResult(name = "pedido")
	public void criar(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "pedido") @XmlElement(required = true) CriarPedido pedidoRequest) throws 
		MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/PedidoWS?wsdl");
		
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSService");
		
		Service service = Service.create(url, qname);
		
		PedidoWS pedidoWs = service.getPort(PedidoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		pedidoWs.criarPedido(pedidoRequest, novoToken);
	}

	/**
	 * Endpoint atualizar, recebe como parâmetro o token no header, PedidoDTO. 
	 * Atualiza um registro já existente no banco de dados.
	 * 
	 * @param token
	 * @param pedidoRequest
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "atualizarPedido")
	@WebResult(name = "pedido")
	public void atualizar(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "pedido") @XmlElement(required = true) AtualizarPedido pedidoRequest) throws 
		MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/PedidoWS?wsdl");
		
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSService");
		
		Service service = Service.create(url, qname);
		
		PedidoWS pedidoWs = service.getPort(PedidoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		pedidoWs.atualizarPedido(pedidoRequest, novoToken);
	}
	
	/**
	 * Endpoint remover, recebe como parâmetro o token no header, e o id do pedido,
	 * para remover da base de dados.
	 * 
	 * @param token
	 * @param id
	 * @throws MalformedURLException
	 * @throws AuthorizationException
	 */
	@WebMethod(operationName = "removerPedido")
	@WebResult(name = "pedido")
	public void remover(@WebParam(name = "token", header = true) String token,
			@WebParam(name = "id") @XmlElement(required = true) Long id) throws 
		MalformedURLException, AuthorizationException {
		URL url = new URL("http://localhost:8080/reqs-already-service-0.0.1/PedidoWS?wsdl");
		
		QName qname = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSService");
		
		Service service = Service.create(url, qname);
		
		PedidoWS pedidoWs = service.getPort(PedidoWS.class);
		
		Token novoToken = new Token();
		novoToken.setToken(token);
		
		RemoverPedido pedidoRequest = new RemoverPedido();
		pedidoRequest.setId(id);
		
		pedidoWs.removerPedido(pedidoRequest, novoToken);
	}

}
