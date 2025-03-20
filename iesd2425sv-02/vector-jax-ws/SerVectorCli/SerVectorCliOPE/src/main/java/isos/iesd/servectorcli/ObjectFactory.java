
package isos.iesd.servectorcli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isos.iesd.servectorcli package. 
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

    private final static QName _CanExecuteTransaction_QNAME = new QName("http://transactionmanager.iesd.isos/", "canExecuteTransaction");
    private final static QName _CanExecuteTransactionResponse_QNAME = new QName("http://transactionmanager.iesd.isos/", "canExecuteTransactionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isos.iesd.servectorcli
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CanExecuteTransaction }
     * 
     */
    public CanExecuteTransaction createCanExecuteTransaction() {
        return new CanExecuteTransaction();
    }

    /**
     * Create an instance of {@link CanExecuteTransactionResponse }
     * 
     */
    public CanExecuteTransactionResponse createCanExecuteTransactionResponse() {
        return new CanExecuteTransactionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanExecuteTransaction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanExecuteTransaction }{@code >}
     */
    @XmlElementDecl(namespace = "http://transactionmanager.iesd.isos/", name = "canExecuteTransaction")
    public JAXBElement<CanExecuteTransaction> createCanExecuteTransaction(CanExecuteTransaction value) {
        return new JAXBElement<CanExecuteTransaction>(_CanExecuteTransaction_QNAME, CanExecuteTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanExecuteTransactionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanExecuteTransactionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transactionmanager.iesd.isos/", name = "canExecuteTransactionResponse")
    public JAXBElement<CanExecuteTransactionResponse> createCanExecuteTransactionResponse(CanExecuteTransactionResponse value) {
        return new JAXBElement<CanExecuteTransactionResponse>(_CanExecuteTransactionResponse_QNAME, CanExecuteTransactionResponse.class, null, value);
    }

}
