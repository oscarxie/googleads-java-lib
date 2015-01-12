
package com.google.api.ads.dfp.jaxws.v201411;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CreativeService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201411/CreativeService?wsdl")
public class CreativeService
    extends Service
{

    private final static URL CREATIVESERVICE_WSDL_LOCATION;
    private final static WebServiceException CREATIVESERVICE_EXCEPTION;
    private final static QName CREATIVESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201411", "CreativeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201411/CreativeService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREATIVESERVICE_WSDL_LOCATION = url;
        CREATIVESERVICE_EXCEPTION = e;
    }

    public CreativeService() {
        super(__getWsdlLocation(), CREATIVESERVICE_QNAME);
    }

    public CreativeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CreativeServiceInterface
     */
    @WebEndpoint(name = "CreativeServiceInterfacePort")
    public CreativeServiceInterface getCreativeServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "CreativeServiceInterfacePort"), CreativeServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreativeServiceInterface
     */
    @WebEndpoint(name = "CreativeServiceInterfacePort")
    public CreativeServiceInterface getCreativeServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "CreativeServiceInterfacePort"), CreativeServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREATIVESERVICE_EXCEPTION!= null) {
            throw CREATIVESERVICE_EXCEPTION;
        }
        return CREATIVESERVICE_WSDL_LOCATION;
    }

}
