
package tm;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tm package. 
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

    private static final QName _CheckServiceVector_QNAME = new QName("http://servicevectorserver", "checkServiceVector");
    private static final QName _CheckServiceVectorResponse_QNAME = new QName("http://servicevectorserver", "checkServiceVectorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckServiceVector }
     * 
     * @return
     *     the new instance of {@link CheckServiceVector }
     */
    public CheckServiceVector createCheckServiceVector() {
        return new CheckServiceVector();
    }

    /**
     * Create an instance of {@link CheckServiceVectorResponse }
     * 
     * @return
     *     the new instance of {@link CheckServiceVectorResponse }
     */
    public CheckServiceVectorResponse createCheckServiceVectorResponse() {
        return new CheckServiceVectorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckServiceVector }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckServiceVector }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "checkServiceVector")
    public JAXBElement<CheckServiceVector> createCheckServiceVector(CheckServiceVector value) {
        return new JAXBElement<>(_CheckServiceVector_QNAME, CheckServiceVector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckServiceVectorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckServiceVectorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "checkServiceVectorResponse")
    public JAXBElement<CheckServiceVectorResponse> createCheckServiceVectorResponse(CheckServiceVectorResponse value) {
        return new JAXBElement<>(_CheckServiceVectorResponse_QNAME, CheckServiceVectorResponse.class, null, value);
    }

}
