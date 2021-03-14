
package br.com.reqs.already.api.v1.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listaPedidoDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listaPedidoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido" type="{http://ws.v1.api.already.reqs.com.br/}pedidoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPedidoDTO", propOrder = {
    "pedido"
})
public class ListaPedidoDTO {

    protected List<PedidoDTO> pedido;

    /**
     * Gets the value of the pedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoDTO }
     * 
     * 
     */
    public List<PedidoDTO> getPedido() {
        if (pedido == null) {
            pedido = new ArrayList<PedidoDTO>();
        }
        return this.pedido;
    }

}
