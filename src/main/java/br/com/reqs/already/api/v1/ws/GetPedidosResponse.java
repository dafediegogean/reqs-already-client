
package br.com.reqs.already.api.v1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getPedidosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getPedidosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedidos" type="{http://ws.v1.api.already.reqs.com.br/}listaPedidoDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPedidosResponse", propOrder = {
    "pedidos"
})
public class GetPedidosResponse {

    protected ListaPedidoDTO pedidos;

    /**
     * Obt�m o valor da propriedade pedidos.
     * 
     * @return
     *     possible object is
     *     {@link ListaPedidoDTO }
     *     
     */
    public ListaPedidoDTO getPedidos() {
        return pedidos;
    }

    /**
     * Define o valor da propriedade pedidos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPedidoDTO }
     *     
     */
    public void setPedidos(ListaPedidoDTO value) {
        this.pedidos = value;
    }

}
