
package isos.tutorial.isyvector.cesvector.servector;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isos.tutorial.isyvector.cesvector.servector package. 
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

    private static final QName _InvariantCheck_QNAME = new QName("http://iesd.isos.isyvector.cesvector.servectorserver", "invariantCheck");
    private static final QName _InvariantCheckResponse_QNAME = new QName("http://iesd.isos.isyvector.cesvector.servectorserver", "invariantCheckResponse");
    private static final QName _Read_QNAME = new QName("http://iesd.isos.isyvector.cesvector.servectorserver", "read");
    private static final QName _ReadResponse_QNAME = new QName("http://iesd.isos.isyvector.cesvector.servectorserver", "readResponse");
    private static final QName _Write_QNAME = new QName("http://iesd.isos.isyvector.cesvector.servectorserver", "write");
    private static final QName _WriteResponse_QNAME = new QName("http://iesd.isos.isyvector.cesvector.servectorserver", "writeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isos.tutorial.isyvector.cesvector.servector
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvariantCheck }
     * 
     * @return
     *     the new instance of {@link InvariantCheck }
     */
    public InvariantCheck createInvariantCheck() {
        return new InvariantCheck();
    }

    /**
     * Create an instance of {@link InvariantCheckResponse }
     * 
     * @return
     *     the new instance of {@link InvariantCheckResponse }
     */
    public InvariantCheckResponse createInvariantCheckResponse() {
        return new InvariantCheckResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InvariantCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvariantCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://iesd.isos.isyvector.cesvector.servectorserver", name = "invariantCheck")
    public JAXBElement<InvariantCheck> createInvariantCheck(InvariantCheck value) {
        return new JAXBElement<>(_InvariantCheck_QNAME, InvariantCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvariantCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvariantCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://iesd.isos.isyvector.cesvector.servectorserver", name = "invariantCheckResponse")
    public JAXBElement<InvariantCheckResponse> createInvariantCheckResponse(InvariantCheckResponse value) {
        return new JAXBElement<>(_InvariantCheckResponse_QNAME, InvariantCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Read }{@code >}
     */
    @XmlElementDecl(namespace = "http://iesd.isos.isyvector.cesvector.servectorserver", name = "read")
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
    @XmlElementDecl(namespace = "http://iesd.isos.isyvector.cesvector.servectorserver", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Write }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Write }{@code >}
     */
    @XmlElementDecl(namespace = "http://iesd.isos.isyvector.cesvector.servectorserver", name = "write")
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
    @XmlElementDecl(namespace = "http://iesd.isos.isyvector.cesvector.servectorserver", name = "writeResponse")
    public JAXBElement<WriteResponse> createWriteResponse(WriteResponse value) {
        return new JAXBElement<>(_WriteResponse_QNAME, WriteResponse.class, null, value);
    }

}
