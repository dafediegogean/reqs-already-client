package br.com.reqs.already.api.v1.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2021-03-13T21:52:20.333-03:00
 * Generated source version: 2.7.13
 * 
 */
@WebServiceClient(name = "PedidoWSService", 
                  wsdlLocation = "file:/C:/development/reqs-already/workspace/reqs-already-service/PedidoWSService.wsdl",
                  targetNamespace = "http://ws.v1.api.already.reqs.com.br/") 
public class PedidoWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSService");
    public final static QName PedidoWSPort = new QName("http://ws.v1.api.already.reqs.com.br/", "PedidoWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/development/reqs-already/workspace/reqs-already-service/PedidoWSService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PedidoWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/development/reqs-already/workspace/reqs-already-service/PedidoWSService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PedidoWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PedidoWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedidoWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PedidoWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PedidoWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PedidoWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PedidoWS
     */
    @WebEndpoint(name = "PedidoWSPort")
    public PedidoWS getPedidoWSPort() {
        return super.getPort(PedidoWSPort, PedidoWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedidoWS
     */
    @WebEndpoint(name = "PedidoWSPort")
    public PedidoWS getPedidoWSPort(WebServiceFeature... features) {
        return super.getPort(PedidoWSPort, PedidoWS.class, features);
    }

}