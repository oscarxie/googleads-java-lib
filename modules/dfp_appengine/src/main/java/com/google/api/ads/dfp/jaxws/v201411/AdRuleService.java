
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
@WebServiceClient(name = "AdRuleService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201411/AdRuleService?wsdl")
public class AdRuleService
    extends Service
{

    private final static URL ADRULESERVICE_WSDL_LOCATION;
    private final static WebServiceException ADRULESERVICE_EXCEPTION;
    private final static QName ADRULESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201411", "AdRuleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201411/AdRuleService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADRULESERVICE_WSDL_LOCATION = url;
        ADRULESERVICE_EXCEPTION = e;
    }

    public AdRuleService() {
        super(__getWsdlLocation(), ADRULESERVICE_QNAME);
    }

    public AdRuleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdRuleServiceInterface
     */
    @WebEndpoint(name = "AdRuleServiceInterfacePort")
    public AdRuleServiceInterface getAdRuleServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "AdRuleServiceInterfacePort"), AdRuleServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdRuleServiceInterface
     */
    @WebEndpoint(name = "AdRuleServiceInterfacePort")
    public AdRuleServiceInterface getAdRuleServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "AdRuleServiceInterfacePort"), AdRuleServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADRULESERVICE_EXCEPTION!= null) {
            throw ADRULESERVICE_EXCEPTION;
        }
        return ADRULESERVICE_WSDL_LOCATION;
    }

}
