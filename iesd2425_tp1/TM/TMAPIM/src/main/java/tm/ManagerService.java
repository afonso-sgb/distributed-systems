
package tm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ManagerService", targetNamespace = "http://manager/", wsdlLocation = "http://localhost:2020/Manager?wsdl")
public class ManagerService
    extends Service
{

    private static final URL MANAGERSERVICE_WSDL_LOCATION;
    private static final WebServiceException MANAGERSERVICE_EXCEPTION;
    private static final QName MANAGERSERVICE_QNAME = new QName("http://manager/", "ManagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2020/Manager?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANAGERSERVICE_WSDL_LOCATION = url;
        MANAGERSERVICE_EXCEPTION = e;
    }

    public ManagerService() {
        super(__getWsdlLocation(), MANAGERSERVICE_QNAME);
    }

    public ManagerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANAGERSERVICE_QNAME, features);
    }

    public ManagerService(URL wsdlLocation) {
        super(wsdlLocation, MANAGERSERVICE_QNAME);
    }

    public ManagerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANAGERSERVICE_QNAME, features);
    }

    public ManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IManager
     */
    @WebEndpoint(name = "ManagerPort")
    public IManager getManagerPort() {
        return super.getPort(new QName("http://manager/", "ManagerPort"), IManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IManager
     */
    @WebEndpoint(name = "ManagerPort")
    public IManager getManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://manager/", "ManagerPort"), IManager.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANAGERSERVICE_EXCEPTION!= null) {
            throw MANAGERSERVICE_EXCEPTION;
        }
        return MANAGERSERVICE_WSDL_LOCATION;
    }

}
