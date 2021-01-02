
package br.com.reqs.already.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de todosOsProdutosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="todosOsProdutosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produtos" type="{http://ws.v1.api.already.reqs.com.br/}listaProdutoDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "todosOsProdutosResponse", propOrder = {
    "produtos"
})
public class TodosOsProdutosResponse {

    protected ListaProdutoDTO produtos;

    /**
     * Obtém o valor da propriedade produtos.
     * 
     * @return
     *     possible object is
     *     {@link ListaProdutoDTO }
     *     
     */
    public ListaProdutoDTO getProdutos() {
        return produtos;
    }

    /**
     * Define o valor da propriedade produtos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaProdutoDTO }
     *     
     */
    public void setProdutos(ListaProdutoDTO value) {
        this.produtos = value;
    }

}
