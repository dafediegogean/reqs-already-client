
package br.com.reqs.already.api.v1.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.reqs.already.api.v1.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AtualizarPedidoResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "atualizarPedidoResponse");
    private final static QName _CriarPedidoResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "criarPedidoResponse");
    private final static QName _GetPedidosResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "getPedidosResponse");
    private final static QName _AtualizarPedido_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "atualizarPedido");
    private final static QName _ListaPedidoDTO_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "listaPedidoDTO");
    private final static QName _PedidoDTO_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "pedidoDTO");
    private final static QName _GetPedidoByIdResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "getPedidoByIdResponse");
    private final static QName _ProdutoDTO_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "produtoDTO");
    private final static QName _Token_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "token");
    private final static QName _GetPedidoById_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "getPedidoById");
    private final static QName _GetPedidos_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "getPedidos");
    private final static QName _RemoverPedidoResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "removerPedidoResponse");
    private final static QName _AuthorizationFault_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "AuthorizationFault");
    private final static QName _CriarPedido_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "criarPedido");
    private final static QName _RemoverPedido_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "removerPedido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.reqs.already.api.v1.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CriarPedido }
     * 
     */
    public CriarPedido createCriarPedido() {
        return new CriarPedido();
    }

    /**
     * Create an instance of {@link RemoverPedido }
     * 
     */
    public RemoverPedido createRemoverPedido() {
        return new RemoverPedido();
    }

    /**
     * Create an instance of {@link RemoverPedidoResponse }
     * 
     */
    public RemoverPedidoResponse createRemoverPedidoResponse() {
        return new RemoverPedidoResponse();
    }

    /**
     * Create an instance of {@link GetPedidoById }
     * 
     */
    public GetPedidoById createGetPedidoById() {
        return new GetPedidoById();
    }

    /**
     * Create an instance of {@link GetPedidos }
     * 
     */
    public GetPedidos createGetPedidos() {
        return new GetPedidos();
    }

    /**
     * Create an instance of {@link GetPedidoByIdResponse }
     * 
     */
    public GetPedidoByIdResponse createGetPedidoByIdResponse() {
        return new GetPedidoByIdResponse();
    }

    /**
     * Create an instance of {@link ListaPedidoDTO }
     * 
     */
    public ListaPedidoDTO createListaPedidoDTO() {
        return new ListaPedidoDTO();
    }

    /**
     * Create an instance of {@link PedidoDTO }
     * 
     */
    public PedidoDTO createPedidoDTO() {
        return new PedidoDTO();
    }

    /**
     * Create an instance of {@link ProdutoDTO }
     * 
     */
    public ProdutoDTO createProdutoDTO() {
        return new ProdutoDTO();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link CriarPedidoResponse }
     * 
     */
    public CriarPedidoResponse createCriarPedidoResponse() {
        return new CriarPedidoResponse();
    }

    /**
     * Create an instance of {@link GetPedidosResponse }
     * 
     */
    public GetPedidosResponse createGetPedidosResponse() {
        return new GetPedidosResponse();
    }

    /**
     * Create an instance of {@link AtualizarPedido }
     * 
     */
    public AtualizarPedido createAtualizarPedido() {
        return new AtualizarPedido();
    }

    /**
     * Create an instance of {@link AtualizarPedidoResponse }
     * 
     */
    public AtualizarPedidoResponse createAtualizarPedidoResponse() {
        return new AtualizarPedidoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "atualizarPedidoResponse")
    public JAXBElement<AtualizarPedidoResponse> createAtualizarPedidoResponse(AtualizarPedidoResponse value) {
        return new JAXBElement<AtualizarPedidoResponse>(_AtualizarPedidoResponse_QNAME, AtualizarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "criarPedidoResponse")
    public JAXBElement<CriarPedidoResponse> createCriarPedidoResponse(CriarPedidoResponse value) {
        return new JAXBElement<CriarPedidoResponse>(_CriarPedidoResponse_QNAME, CriarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "getPedidosResponse")
    public JAXBElement<GetPedidosResponse> createGetPedidosResponse(GetPedidosResponse value) {
        return new JAXBElement<GetPedidosResponse>(_GetPedidosResponse_QNAME, GetPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "atualizarPedido")
    public JAXBElement<AtualizarPedido> createAtualizarPedido(AtualizarPedido value) {
        return new JAXBElement<AtualizarPedido>(_AtualizarPedido_QNAME, AtualizarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPedidoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "listaPedidoDTO")
    public JAXBElement<ListaPedidoDTO> createListaPedidoDTO(ListaPedidoDTO value) {
        return new JAXBElement<ListaPedidoDTO>(_ListaPedidoDTO_QNAME, ListaPedidoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "pedidoDTO")
    public JAXBElement<PedidoDTO> createPedidoDTO(PedidoDTO value) {
        return new JAXBElement<PedidoDTO>(_PedidoDTO_QNAME, PedidoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "getPedidoByIdResponse")
    public JAXBElement<GetPedidoByIdResponse> createGetPedidoByIdResponse(GetPedidoByIdResponse value) {
        return new JAXBElement<GetPedidoByIdResponse>(_GetPedidoByIdResponse_QNAME, GetPedidoByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "produtoDTO")
    public JAXBElement<ProdutoDTO> createProdutoDTO(ProdutoDTO value) {
        return new JAXBElement<ProdutoDTO>(_ProdutoDTO_QNAME, ProdutoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "getPedidoById")
    public JAXBElement<GetPedidoById> createGetPedidoById(GetPedidoById value) {
        return new JAXBElement<GetPedidoById>(_GetPedidoById_QNAME, GetPedidoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "getPedidos")
    public JAXBElement<GetPedidos> createGetPedidos(GetPedidos value) {
        return new JAXBElement<GetPedidos>(_GetPedidos_QNAME, GetPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "removerPedidoResponse")
    public JAXBElement<RemoverPedidoResponse> createRemoverPedidoResponse(RemoverPedidoResponse value) {
        return new JAXBElement<RemoverPedidoResponse>(_RemoverPedidoResponse_QNAME, RemoverPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "AuthorizationFault")
    public JAXBElement<String> createAuthorizationFault(String value) {
        return new JAXBElement<String>(_AuthorizationFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "criarPedido")
    public JAXBElement<CriarPedido> createCriarPedido(CriarPedido value) {
        return new JAXBElement<CriarPedido>(_CriarPedido_QNAME, CriarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "removerPedido")
    public JAXBElement<RemoverPedido> createRemoverPedido(RemoverPedido value) {
        return new JAXBElement<RemoverPedido>(_RemoverPedido_QNAME, RemoverPedido.class, null, value);
    }

}
