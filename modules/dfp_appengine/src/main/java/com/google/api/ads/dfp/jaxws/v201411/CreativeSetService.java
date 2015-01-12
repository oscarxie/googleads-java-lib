
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
@WebServiceClient(name = "CreativeSetService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201411/CreativeSetService?wsdl")
public class CreativeSetService
    extends Service
{

    private final static URL CREATIVESETSERVICE_WSDL_LOCATION;
    private final static WebServiceException CREATIVESETSERVICE_EXCEPTION;
    private final static QName CREATIVESETSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201411", "CreativeSetService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201411/CreativeSetService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREATIVESETSERVICE_WSDL_LOCATION = url;
        CREATIVESETSERVICE_EXCEPTION = e;
    }

    public CreativeSetService() {
        super(__getWsdlLocation(), CREATIVESETSERVICE_QNAME);
    }

    public CreativeSetService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CreativeSetServiceInterface
     */
    @WebEndpoint(name = "CreativeSetServiceInterfacePort")
    public CreativeSetServiceInterface getCreativeSetServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "CreativeSetServiceInterfacePort"), CreativeSetServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreativeSetServiceInterface
     */
    @WebEndpoint(name = "CreativeSetServiceInterfacePort")
    public CreativeSetServiceInterface getCreativeSetServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "CreativeSetServiceInterfacePort"), CreativeSetServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREATIVESETSERVICE_EXCEPTION!= null) {
            throw CREATIVESETSERVICE_EXCEPTION;
        }
        return CREATIVESETSERVICE_WSDL_LOCATION;
    }

}
