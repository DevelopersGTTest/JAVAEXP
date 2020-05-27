
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _SumaNumbers_QNAME = new QName("http://api.hackobo.org/", "sumaNumbers");
    private final static QName _SumaNumbersResponse_QNAME = new QName("http://api.hackobo.org/", "sumaNumbersResponse");
    private final static QName _MultiNumbers_QNAME = new QName("http://api.hackobo.org/", "multiNumbers");
    private final static QName _MultiNumbersResponse_QNAME = new QName("http://api.hackobo.org/", "multiNumbersResponse");
    private final static QName _DivisionNumbers_QNAME = new QName("http://api.hackobo.org/", "divisionNumbers");
    private final static QName _DivisionNumbersResponse_QNAME = new QName("http://api.hackobo.org/", "divisionNumbersResponse");
    private final static QName _RestaNumbers_QNAME = new QName("http://api.hackobo.org/", "restaNumbers");
    private final static QName _RestaNumbersResponse_QNAME = new QName("http://api.hackobo.org/", "restaNumbersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SumaNumbers }
     * 
     */
    public SumaNumbers createSumaNumbers() {
        return new SumaNumbers();
    }

    /**
     * Create an instance of {@link SumaNumbersResponse }
     * 
     */
    public SumaNumbersResponse createSumaNumbersResponse() {
        return new SumaNumbersResponse();
    }

    /**
     * Create an instance of {@link MultiNumbers }
     * 
     */
    public MultiNumbers createMultiNumbers() {
        return new MultiNumbers();
    }

    /**
     * Create an instance of {@link MultiNumbersResponse }
     * 
     */
    public MultiNumbersResponse createMultiNumbersResponse() {
        return new MultiNumbersResponse();
    }

    /**
     * Create an instance of {@link DivisionNumbers }
     * 
     */
    public DivisionNumbers createDivisionNumbers() {
        return new DivisionNumbers();
    }

    /**
     * Create an instance of {@link DivisionNumbersResponse }
     * 
     */
    public DivisionNumbersResponse createDivisionNumbersResponse() {
        return new DivisionNumbersResponse();
    }

    /**
     * Create an instance of {@link RestaNumbers }
     * 
     */
    public RestaNumbers createRestaNumbers() {
        return new RestaNumbers();
    }

    /**
     * Create an instance of {@link RestaNumbersResponse }
     * 
     */
    public RestaNumbersResponse createRestaNumbersResponse() {
        return new RestaNumbersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "sumaNumbers")
    public JAXBElement<SumaNumbers> createSumaNumbers(SumaNumbers value) {
        return new JAXBElement<SumaNumbers>(_SumaNumbers_QNAME, SumaNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "sumaNumbersResponse")
    public JAXBElement<SumaNumbersResponse> createSumaNumbersResponse(SumaNumbersResponse value) {
        return new JAXBElement<SumaNumbersResponse>(_SumaNumbersResponse_QNAME, SumaNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "multiNumbers")
    public JAXBElement<MultiNumbers> createMultiNumbers(MultiNumbers value) {
        return new JAXBElement<MultiNumbers>(_MultiNumbers_QNAME, MultiNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "multiNumbersResponse")
    public JAXBElement<MultiNumbersResponse> createMultiNumbersResponse(MultiNumbersResponse value) {
        return new JAXBElement<MultiNumbersResponse>(_MultiNumbersResponse_QNAME, MultiNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "divisionNumbers")
    public JAXBElement<DivisionNumbers> createDivisionNumbers(DivisionNumbers value) {
        return new JAXBElement<DivisionNumbers>(_DivisionNumbers_QNAME, DivisionNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "divisionNumbersResponse")
    public JAXBElement<DivisionNumbersResponse> createDivisionNumbersResponse(DivisionNumbersResponse value) {
        return new JAXBElement<DivisionNumbersResponse>(_DivisionNumbersResponse_QNAME, DivisionNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "restaNumbers")
    public JAXBElement<RestaNumbers> createRestaNumbers(RestaNumbers value) {
        return new JAXBElement<RestaNumbers>(_RestaNumbers_QNAME, RestaNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.hackobo.org/", name = "restaNumbersResponse")
    public JAXBElement<RestaNumbersResponse> createRestaNumbersResponse(RestaNumbersResponse value) {
        return new JAXBElement<RestaNumbersResponse>(_RestaNumbersResponse_QNAME, RestaNumbersResponse.class, null, value);
    }

}
