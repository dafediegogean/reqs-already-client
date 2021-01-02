
package br.com.reqs.already.api.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.reqs.already.api.v1 package. 
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

    private final static QName _TodosOsProdutos_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "todosOsProdutos");
    private final static QName _ListaProdutoDTO_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "listaProdutoDTO");
    private final static QName _ProdutoDTO_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "produtoDTO");
    private final static QName _Token_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "token");
    private final static QName _GetProdutoByIdResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "getProdutoByIdResponse");
    private final static QName _GetProdutoById_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "getProdutoById");
    private final static QName _TodosOsProdutosResponse_QNAME = new QName("http://ws.v1.api.already.reqs.com.br/", "todosOsProdutosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.reqs.already.api.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProdutoById }
     * 
     */
    public GetProdutoById createGetProdutoById() {
        return new GetProdutoById();
    }

    /**
     * Create an instance of {@link TodosOsProdutosResponse }
     * 
     */
    public TodosOsProdutosResponse createTodosOsProdutosResponse() {
        return new TodosOsProdutosResponse();
    }

    /**
     * Create an instance of {@link GetProdutoByIdResponse }
     * 
     */
    public GetProdutoByIdResponse createGetProdutoByIdResponse() {
        return new GetProdutoByIdResponse();
    }

    /**
     * Create an instance of {@link TodosOsProdutos }
     * 
     */
    public TodosOsProdutos createTodosOsProdutos() {
        return new TodosOsProdutos();
    }

    /**
     * Create an instance of {@link ListaProdutoDTO }
     * 
     */
    public ListaProdutoDTO createListaProdutoDTO() {
        return new ListaProdutoDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsProdutos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "todosOsProdutos")
    public JAXBElement<TodosOsProdutos> createTodosOsProdutos(TodosOsProdutos value) {
        return new JAXBElement<TodosOsProdutos>(_TodosOsProdutos_QNAME, TodosOsProdutos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "listaProdutoDTO")
    public JAXBElement<ListaProdutoDTO> createListaProdutoDTO(ListaProdutoDTO value) {
        return new JAXBElement<ListaProdutoDTO>(_ListaProdutoDTO_QNAME, ListaProdutoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "getProdutoByIdResponse")
    public JAXBElement<GetProdutoByIdResponse> createGetProdutoByIdResponse(GetProdutoByIdResponse value) {
        return new JAXBElement<GetProdutoByIdResponse>(_GetProdutoByIdResponse_QNAME, GetProdutoByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "getProdutoById")
    public JAXBElement<GetProdutoById> createGetProdutoById(GetProdutoById value) {
        return new JAXBElement<GetProdutoById>(_GetProdutoById_QNAME, GetProdutoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsProdutosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.v1.api.already.reqs.com.br/", name = "todosOsProdutosResponse")
    public JAXBElement<TodosOsProdutosResponse> createTodosOsProdutosResponse(TodosOsProdutosResponse value) {
        return new JAXBElement<TodosOsProdutosResponse>(_TodosOsProdutosResponse_QNAME, TodosOsProdutosResponse.class, null, value);
    }

}
