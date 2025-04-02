
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

    private static final QName _Check_QNAME = new QName("http://tmserver", "check");
    private static final QName _CheckResponse_QNAME = new QName("http://tmserver", "checkResponse");
    private static final QName _SendTransaction_QNAME = new QName("http://tmserver", "sendTransaction");
    private static final QName _SendTransactionResponse_QNAME = new QName("http://tmserver", "sendTransactionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Check }
     * 
     * @return
     *     the new instance of {@link Check }
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link CheckResponse }
     * 
     * @return
     *     the new instance of {@link CheckResponse }
     */
    public CheckResponse createCheckResponse() {
        return new CheckResponse();
    }

    /**
     * Create an instance of {@link SendTransaction }
     * 
     * @return
     *     the new instance of {@link SendTransaction }
     */
    public SendTransaction createSendTransaction() {
        return new SendTransaction();
    }

    /**
     * Create an instance of {@link SendTransactionResponse }
     * 
     * @return
     *     the new instance of {@link SendTransactionResponse }
     */
    public SendTransactionResponse createSendTransactionResponse() {
        return new SendTransactionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Check }{@code >}
     */
    @XmlElementDecl(namespace = "http://tmserver", name = "check")
    public JAXBElement<Check> createCheck(Check value) {
        return new JAXBElement<>(_Check_QNAME, Check.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tmserver", name = "checkResponse")
    public JAXBElement<CheckResponse> createCheckResponse(CheckResponse value) {
        return new JAXBElement<>(_CheckResponse_QNAME, CheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendTransaction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendTransaction }{@code >}
     */
    @XmlElementDecl(namespace = "http://tmserver", name = "sendTransaction")
    public JAXBElement<SendTransaction> createSendTransaction(SendTransaction value) {
        return new JAXBElement<>(_SendTransaction_QNAME, SendTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendTransactionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendTransactionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tmserver", name = "sendTransactionResponse")
    public JAXBElement<SendTransactionResponse> createSendTransactionResponse(SendTransactionResponse value) {
        return new JAXBElement<>(_SendTransactionResponse_QNAME, SendTransactionResponse.class, null, value);
    }

}
