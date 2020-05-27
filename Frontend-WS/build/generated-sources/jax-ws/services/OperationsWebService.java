
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OperationsWebService", targetNamespace = "http://api.hackobo.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OperationsWebService {


    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "restaNumbers", targetNamespace = "http://api.hackobo.org/", className = "services.RestaNumbers")
    @ResponseWrapper(localName = "restaNumbersResponse", targetNamespace = "http://api.hackobo.org/", className = "services.RestaNumbersResponse")
    @Action(input = "http://api.hackobo.org/OperationsWebService/restaNumbersRequest", output = "http://api.hackobo.org/OperationsWebService/restaNumbersResponse")
    public float restaNumbers(
        @WebParam(name = "n1", targetNamespace = "")
        String n1,
        @WebParam(name = "n2", targetNamespace = "")
        String n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divisionNumbers", targetNamespace = "http://api.hackobo.org/", className = "services.DivisionNumbers")
    @ResponseWrapper(localName = "divisionNumbersResponse", targetNamespace = "http://api.hackobo.org/", className = "services.DivisionNumbersResponse")
    @Action(input = "http://api.hackobo.org/OperationsWebService/divisionNumbersRequest", output = "http://api.hackobo.org/OperationsWebService/divisionNumbersResponse")
    public float divisionNumbers(
        @WebParam(name = "n1", targetNamespace = "")
        String n1,
        @WebParam(name = "n2", targetNamespace = "")
        String n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumaNumbers", targetNamespace = "http://api.hackobo.org/", className = "services.SumaNumbers")
    @ResponseWrapper(localName = "sumaNumbersResponse", targetNamespace = "http://api.hackobo.org/", className = "services.SumaNumbersResponse")
    @Action(input = "http://api.hackobo.org/OperationsWebService/sumaNumbersRequest", output = "http://api.hackobo.org/OperationsWebService/sumaNumbersResponse")
    public float sumaNumbers(
        @WebParam(name = "n1", targetNamespace = "")
        String n1,
        @WebParam(name = "n2", targetNamespace = "")
        String n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiNumbers", targetNamespace = "http://api.hackobo.org/", className = "services.MultiNumbers")
    @ResponseWrapper(localName = "multiNumbersResponse", targetNamespace = "http://api.hackobo.org/", className = "services.MultiNumbersResponse")
    @Action(input = "http://api.hackobo.org/OperationsWebService/multiNumbersRequest", output = "http://api.hackobo.org/OperationsWebService/multiNumbersResponse")
    public float multiNumbers(
        @WebParam(name = "n1", targetNamespace = "")
        String n1,
        @WebParam(name = "n2", targetNamespace = "")
        String n2);

}
