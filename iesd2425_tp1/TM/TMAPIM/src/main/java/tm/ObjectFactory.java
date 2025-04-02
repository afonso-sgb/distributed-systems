
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
    private static final QName _Read_QNAME = new QName("http://servicevectorserver", "read");
    private static final QName _ReadResponse_QNAME = new QName("http://servicevectorserver", "readResponse");
    private static final QName _ReceiveMessage_QNAME = new QName("http://servicevectorserver", "receiveMessage");
    private static final QName _ReceiveMessageResponse_QNAME = new QName("http://servicevectorserver", "receiveMessageResponse");
    private static final QName _ReturnCurrentVector_QNAME = new QName("http://servicevectorserver", "returnCurrentVector");
    private static final QName _ReturnCurrentVectorResponse_QNAME = new QName("http://servicevectorserver", "returnCurrentVectorResponse");
    private static final QName _Write_QNAME = new QName("http://servicevectorserver", "write");
    private static final QName _WriteResponse_QNAME = new QName("http://servicevectorserver", "writeResponse");

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
     * Create an instance of {@link Read }
     * 
     * @return
     *     the new instance of {@link Read }
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     * @return
     *     the new instance of {@link ReadResponse }
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
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
     * Create an instance of {@link ReturnCurrentVector }
     * 
     * @return
     *     the new instance of {@link ReturnCurrentVector }
     */
    public ReturnCurrentVector createReturnCurrentVector() {
        return new ReturnCurrentVector();
    }

    /**
     * Create an instance of {@link ReturnCurrentVectorResponse }
     * 
     * @return
     *     the new instance of {@link ReturnCurrentVectorResponse }
     */
    public ReturnCurrentVectorResponse createReturnCurrentVectorResponse() {
        return new ReturnCurrentVectorResponse();
    }

    /**
     * Create an instance of {@link Write }
     * 
     * @return
     *     the new instance of {@link Write }
     */
    public Write createWrite() {
        return new Write();
    }

    /**
     * Create an instance of {@link WriteResponse }
     * 
     * @return
     *     the new instance of {@link WriteResponse }
     */
    public WriteResponse createWriteResponse() {
        return new WriteResponse();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Read }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "read")
    public JAXBElement<Read> createRead(Read value) {
        return new JAXBElement<>(_Read_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiveMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "receiveMessage")
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
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "receiveMessageResponse")
    public JAXBElement<ReceiveMessageResponse> createReceiveMessageResponse(ReceiveMessageResponse value) {
        return new JAXBElement<>(_ReceiveMessageResponse_QNAME, ReceiveMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnCurrentVector }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnCurrentVector }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "returnCurrentVector")
    public JAXBElement<ReturnCurrentVector> createReturnCurrentVector(ReturnCurrentVector value) {
        return new JAXBElement<>(_ReturnCurrentVector_QNAME, ReturnCurrentVector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnCurrentVectorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnCurrentVectorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "returnCurrentVectorResponse")
    public JAXBElement<ReturnCurrentVectorResponse> createReturnCurrentVectorResponse(ReturnCurrentVectorResponse value) {
        return new JAXBElement<>(_ReturnCurrentVectorResponse_QNAME, ReturnCurrentVectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Write }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Write }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "write")
    public JAXBElement<Write> createWrite(Write value) {
        return new JAXBElement<>(_Write_QNAME, Write.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WriteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicevectorserver", name = "writeResponse")
    public JAXBElement<WriteResponse> createWriteResponse(WriteResponse value) {
        return new JAXBElement<>(_WriteResponse_QNAME, WriteResponse.class, null, value);
    }

}
