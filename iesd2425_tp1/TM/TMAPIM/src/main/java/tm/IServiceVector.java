
package tm;

import java.util.List;
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
@WebService(name = "IServiceVector", targetNamespace = "http://servicevectorserver")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IServiceVector {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "receiveMessage", targetNamespace = "http://servicevectorserver", className = "tm.ReceiveMessage")
    @ResponseWrapper(localName = "receiveMessageResponse", targetNamespace = "http://servicevectorserver", className = "tm.ReceiveMessageResponse")
    @Action(input = "http://servicevectorserver/IServiceVector/receiveMessageRequest", output = "http://servicevectorserver/IServiceVector/receiveMessageResponse")
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
    @RequestWrapper(localName = "checkServiceVector", targetNamespace = "http://servicevectorserver", className = "tm.CheckServiceVector")
    @ResponseWrapper(localName = "checkServiceVectorResponse", targetNamespace = "http://servicevectorserver", className = "tm.CheckServiceVectorResponse")
    @Action(input = "http://servicevectorserver/IServiceVector/checkServiceVectorRequest", output = "http://servicevectorserver/IServiceVector/checkServiceVectorResponse")
    public int checkServiceVector(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "returnCurrentVector", targetNamespace = "http://servicevectorserver", className = "tm.ReturnCurrentVector")
    @ResponseWrapper(localName = "returnCurrentVectorResponse", targetNamespace = "http://servicevectorserver", className = "tm.ReturnCurrentVectorResponse")
    @Action(input = "http://servicevectorserver/IServiceVector/returnCurrentVectorRequest", output = "http://servicevectorserver/IServiceVector/returnCurrentVectorResponse")
    public List<Integer> returnCurrentVector();

    /**
     * 
     * @param arg0
     * @param arg1
     */
    @WebMethod
    @RequestWrapper(localName = "write", targetNamespace = "http://servicevectorserver", className = "tm.Write")
    @ResponseWrapper(localName = "writeResponse", targetNamespace = "http://servicevectorserver", className = "tm.WriteResponse")
    @Action(input = "http://servicevectorserver/IServiceVector/writeRequest", output = "http://servicevectorserver/IServiceVector/writeResponse")
    public void write(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "read", targetNamespace = "http://servicevectorserver", className = "tm.Read")
    @ResponseWrapper(localName = "readResponse", targetNamespace = "http://servicevectorserver", className = "tm.ReadResponse")
    @Action(input = "http://servicevectorserver/IServiceVector/readRequest", output = "http://servicevectorserver/IServiceVector/readResponse")
    public int read(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
