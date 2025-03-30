
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

    private static final QName _CheckServiceVector2_QNAME = new QName("http://servicevector2server", "checkServiceVector2");
    private static final QName _CheckServiceVector2Response_QNAME = new QName("http://servicevector2server", "checkServiceVector2Response");
    private static final QName _ReceiveMessage_QNAME = new QName("http://servicevector2server", "receiveMessage");
    private static final QName _ReceiveMessageResponse_QNAME = new QName("http://servicevector2server", "receiveMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckServiceVector2 }
     * 
     * @return
     *     the new instance of {@link CheckServiceVector2 }
     */
    public CheckServiceVector2 createCheckServiceVector2() {
        return new CheckServiceVector2();
    }

    /**
     * Create an instance of {@link CheckServiceVector2Response }
     * 
     * @return
     *     the new instance of {@link CheckServiceVector2Response }
     */
    public CheckServiceVector2Response createCheckServiceVector2Response() {
        return new CheckServiceVector2Response();
    }

    /**
     * Create an instance of {@link ReceiveMessage }
     * 
     * @return
     *     the new instance of {@link ReceiveMessage }
     */
    public ReceiveMessage createReceiveMessage() {
        return new ReceiveMessage();
    }

    /**
     * Create an instance of {@link ReceiveMessageResponse }
     * 
     * @return
     *     the new instance of {@link ReceiveMessageResponse }
     */
    public ReceiveMessageResponse createReceiveMessageResponse() {
        return new ReceiveMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckServiceVector2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckServiceVector2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevector2server", name = "checkServiceVector2")
    public JAXBElement<CheckServiceVector2> createCheckServiceVector2(CheckServiceVector2 value) {
        return new JAXBElement<>(_CheckServiceVector2_QNAME, CheckServiceVector2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckServiceVector2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckServiceVector2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevector2server", name = "checkServiceVector2Response")
    public JAXBElement<CheckServiceVector2Response> createCheckServiceVector2Response(CheckServiceVector2Response value) {
        return new JAXBElement<>(_CheckServiceVector2Response_QNAME, CheckServiceVector2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiveMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevector2server", name = "receiveMessage")
    public JAXBElement<ReceiveMessage> createReceiveMessage(ReceiveMessage value) {
        return new JAXBElement<>(_ReceiveMessage_QNAME, ReceiveMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveMessageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiveMessageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevector2server", name = "receiveMessageResponse")
    public JAXBElement<ReceiveMessageResponse> createReceiveMessageResponse(ReceiveMessageResponse value) {
        return new JAXBElement<>(_ReceiveMessageResponse_QNAME, ReceiveMessageResponse.class, null, value);
    }

}
