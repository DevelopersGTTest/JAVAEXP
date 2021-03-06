
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OperationsWebService", targetNamespace = "http://api.hackobo.org/", wsdlLocation = "http://localhost:8080/Backend-WS/OperationsWebService?WSDL")
public class OperationsWebService_Service
    extends Service
{

    private final static URL OPERATIONSWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException OPERATIONSWEBSERVICE_EXCEPTION;
    private final static QName OPERATIONSWEBSERVICE_QNAME = new QName("http://api.hackobo.org/", "OperationsWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Backend-WS/OperationsWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERATIONSWEBSERVICE_WSDL_LOCATION = url;
        OPERATIONSWEBSERVICE_EXCEPTION = e;
    }

    public OperationsWebService_Service() {
        super(__getWsdlLocation(), OPERATIONSWEBSERVICE_QNAME);
    }

    public OperationsWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERATIONSWEBSERVICE_QNAME, features);
    }

    public OperationsWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERATIONSWEBSERVICE_QNAME);
    }

    public OperationsWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERATIONSWEBSERVICE_QNAME, features);
    }

    public OperationsWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperationsWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperationsWebService
     */
    @WebEndpoint(name = "OperationsWebServicePort")
    public OperationsWebService getOperationsWebServicePort() {
        return super.getPort(new QName("http://api.hackobo.org/", "OperationsWebServicePort"), OperationsWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsWebService
     */
    @WebEndpoint(name = "OperationsWebServicePort")
    public OperationsWebService getOperationsWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.hackobo.org/", "OperationsWebServicePort"), OperationsWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERATIONSWEBSERVICE_EXCEPTION!= null) {
            throw OPERATIONSWEBSERVICE_EXCEPTION;
        }
        return OPERATIONSWEBSERVICE_WSDL_LOCATION;
    }

}
