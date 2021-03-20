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

import br.com.reqs.already.api.v1.ws.AuthorizationException;
import br.com.reqs.already.api.v1.ws.GetPedidos;
import br.com.reqs.already.api.v1.ws.GetPedidosResponse;
import br.com.reqs.already.api.v1.ws.PedidoWS;
import br.com.reqs.already.api.v1.ws.Token;

/**
 * WebService que atende as demais operations para buscar, criar, atualizar 
 * e remover ao pedido.
 * 
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 30 de out de 2020, 21:42:10
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
	

	
}
