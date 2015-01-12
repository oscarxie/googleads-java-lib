
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
@WebServiceClient(name = "ProposalLineItemService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201411/ProposalLineItemService?wsdl")
public class ProposalLineItemService
    extends Service
{

    private final static URL PROPOSALLINEITEMSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROPOSALLINEITEMSERVICE_EXCEPTION;
    private final static QName PROPOSALLINEITEMSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201411", "ProposalLineItemService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201411/ProposalLineItemService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROPOSALLINEITEMSERVICE_WSDL_LOCATION = url;
        PROPOSALLINEITEMSERVICE_EXCEPTION = e;
    }

    public ProposalLineItemService() {
        super(__getWsdlLocation(), PROPOSALLINEITEMSERVICE_QNAME);
    }

    public ProposalLineItemService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ProposalLineItemServiceInterface
     */
    @WebEndpoint(name = "ProposalLineItemServiceInterfacePort")
    public ProposalLineItemServiceInterface getProposalLineItemServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "ProposalLineItemServiceInterfacePort"), ProposalLineItemServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProposalLineItemServiceInterface
     */
    @WebEndpoint(name = "ProposalLineItemServiceInterfacePort")
    public ProposalLineItemServiceInterface getProposalLineItemServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "ProposalLineItemServiceInterfacePort"), ProposalLineItemServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROPOSALLINEITEMSERVICE_EXCEPTION!= null) {
            throw PROPOSALLINEITEMSERVICE_EXCEPTION;
        }
        return PROPOSALLINEITEMSERVICE_WSDL_LOCATION;
    }

}
