
package tm;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "IServiceVector2", targetNamespace = "http://servicevector2server")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IServiceVector2 {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "receiveMessage", targetNamespace = "http://servicevector2server", className = "tm.ReceiveMessage")
    @ResponseWrapper(localName = "receiveMessageResponse", targetNamespace = "http://servicevector2server", className = "tm.ReceiveMessageResponse")
    @Action(input = "http://servicevector2server/IServiceVector2/receiveMessageRequest", output = "http://servicevector2server/IServiceVector2/receiveMessageResponse")
    public String receiveMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkServiceVector2", targetNamespace = "http://servicevector2server", className = "tm.CheckServiceVector2")
    @ResponseWrapper(localName = "checkServiceVector2Response", targetNamespace = "http://servicevector2server", className = "tm.CheckServiceVector2Response")
    @Action(input = "http://servicevector2server/IServiceVector2/checkServiceVector2Request", output = "http://servicevector2server/IServiceVector2/checkServiceVector2Response")
    public int checkServiceVector2(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
