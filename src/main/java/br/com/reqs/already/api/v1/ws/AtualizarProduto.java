
package br.com.reqs.already.api.v1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atualizarProduto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atualizarProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produto" type="{http://ws.v1.api.already.reqs.com.br/}produtoDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atualizarProduto", propOrder = {
    "produto"
})
public class AtualizarProduto {

    @XmlElement(required = true)
    protected ProdutoDTO produto;

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

}
