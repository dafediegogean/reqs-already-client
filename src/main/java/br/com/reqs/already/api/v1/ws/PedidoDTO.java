
package br.com.reqs.already.api.v1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidoDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://ws.v1.api.already.reqs.com.br/}produtoDTO"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoDTO", propOrder = {
    "id",
    "produto",
    "descricao",
    "quantidade",
    "dataCompra"
})
public class PedidoDTO {

    protected Long id;
    @XmlElement(required = true)
    protected ProdutoDTO produto;
    @XmlElement(required = true)
    protected String descricao;
    protected int quantidade;
    @XmlElement(required = true)
    protected String dataCompra;

    /**
     * Obt�m o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obt�m o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoDTO }
     *     
     */
    public ProdutoDTO getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoDTO }
     *     
     */
    public void setProduto(ProdutoDTO value) {
        this.produto = value;
    }

    /**
     * Obt�m o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obt�m o valor da propriedade quantidade.
     * 
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     */
    public void setQuantidade(int value) {
        this.quantidade = value;
    }

    /**
     * Obt�m o valor da propriedade dataCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * Define o valor da propriedade dataCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCompra(String value) {
        this.dataCompra = value;
    }

}
