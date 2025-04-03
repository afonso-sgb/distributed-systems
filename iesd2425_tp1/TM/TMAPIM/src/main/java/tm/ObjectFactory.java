
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

    private static final QName _ReceiveIpAndPortFromVector_QNAME = new QName("http://managerserver", "receiveIpAndPortFromVector");
    private static final QName _ReceiveIpAndPortFromVectorResponse_QNAME = new QName("http://managerserver", "receiveIpAndPortFromVectorResponse");
    private static final QName _SendIpsAndPortsToTM_QNAME = new QName("http://managerserver", "sendIpsAndPortsToTM");
    private static final QName _SendIpsAndPortsToTMResponse_QNAME = new QName("http://managerserver", "sendIpsAndPortsToTMResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiveIpAndPortFromVector }
     * 
     * @return
     *     the new instance of {@link ReceiveIpAndPortFromVector }
     */
    public ReceiveIpAndPortFromVector createReceiveIpAndPortFromVector() {
        return new ReceiveIpAndPortFromVector();
    }

    /**
     * Create an instance of {@link ReceiveIpAndPortFromVectorResponse }
     * 
     * @return
     *     the new instance of {@link ReceiveIpAndPortFromVectorResponse }
     */
    public ReceiveIpAndPortFromVectorResponse createReceiveIpAndPortFromVectorResponse() {
        return new ReceiveIpAndPortFromVectorResponse();
    }

    /**
     * Create an instance of {@link SendIpsAndPortsToTM }
     * 
     * @return
     *     the new instance of {@link SendIpsAndPortsToTM }
     */
    public SendIpsAndPortsToTM createSendIpsAndPortsToTM() {
        return new SendIpsAndPortsToTM();
    }

    /**
     * Create an instance of {@link SendIpsAndPortsToTMResponse }
     * 
     * @return
     *     the new instance of {@link SendIpsAndPortsToTMResponse }
     */
    public SendIpsAndPortsToTMResponse createSendIpsAndPortsToTMResponse() {
        return new SendIpsAndPortsToTMResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveIpAndPortFromVector }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiveIpAndPortFromVector }{@code >}
     */
    @XmlElementDecl(namespace = "http://managerserver", name = "receiveIpAndPortFromVector")
    public JAXBElement<ReceiveIpAndPortFromVector> createReceiveIpAndPortFromVector(ReceiveIpAndPortFromVector value) {
        return new JAXBElement<>(_ReceiveIpAndPortFromVector_QNAME, ReceiveIpAndPortFromVector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveIpAndPortFromVectorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiveIpAndPortFromVectorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://managerserver", name = "receiveIpAndPortFromVectorResponse")
    public JAXBElement<ReceiveIpAndPortFromVectorResponse> createReceiveIpAndPortFromVectorResponse(ReceiveIpAndPortFromVectorResponse value) {
        return new JAXBElement<>(_ReceiveIpAndPortFromVectorResponse_QNAME, ReceiveIpAndPortFromVectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIpsAndPortsToTM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendIpsAndPortsToTM }{@code >}
     */
    @XmlElementDecl(namespace = "http://managerserver", name = "sendIpsAndPortsToTM")
    public JAXBElement<SendIpsAndPortsToTM> createSendIpsAndPortsToTM(SendIpsAndPortsToTM value) {
        return new JAXBElement<>(_SendIpsAndPortsToTM_QNAME, SendIpsAndPortsToTM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIpsAndPortsToTMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendIpsAndPortsToTMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://managerserver", name = "sendIpsAndPortsToTMResponse")
    public JAXBElement<SendIpsAndPortsToTMResponse> createSendIpsAndPortsToTMResponse(SendIpsAndPortsToTMResponse value) {
        return new JAXBElement<>(_SendIpsAndPortsToTMResponse_QNAME, SendIpsAndPortsToTMResponse.class, null, value);
    }

}
