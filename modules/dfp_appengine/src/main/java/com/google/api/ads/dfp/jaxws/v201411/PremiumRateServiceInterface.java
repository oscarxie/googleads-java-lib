
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for managing {@link PremiumRate} objects.
 *       <p>
 *       To use this service, you need to have the new sales management solution
 *       enabled on your network. If you do not see a "Sales" tab in
 *       <a href="https://www.google.com/dfp">DoubleClick for Publishers (DFP)</a>,
 *       you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PremiumRateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PremiumRateServiceInterface {


    /**
     * 
     *         Creates a list of new {@link PremiumRate} objects.
     *         
     *         @param premiumRates the premium rates to be created
     *         @return the premium rates with their IDs filled in
     *       
     * 
     * @param premiumRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.PremiumRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "createPremiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PremiumRateServiceInterfacecreatePremiumRates")
    @ResponseWrapper(localName = "createPremiumRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PremiumRateServiceInterfacecreatePremiumRatesResponse")
    public List<PremiumRate> createPremiumRates(
        @WebParam(name = "premiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<PremiumRate> premiumRates)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link PremiumRatePage} of {@link PremiumRate} objects that
     *         satisfy the given {@link Statement#query}. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link PremiumRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link PremiumRate#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code pricingMethod}</td>
     *         <td>{@link PremiumRate#pricingMethod}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement to filter a
     *         list of premium rates.
     *         @return the premium rates that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.PremiumRatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "getPremiumRatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PremiumRateServiceInterfacegetPremiumRatesByStatement")
    @ResponseWrapper(localName = "getPremiumRatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PremiumRateServiceInterfacegetPremiumRatesByStatementResponse")
    public PremiumRatePage getPremiumRatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link PremiumRate} objects.
     *         
     *         @param premiumRates the premium rates to be updated
     *         @return the updated premium rates
     *       
     * 
     * @param premiumRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.PremiumRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "updatePremiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PremiumRateServiceInterfaceupdatePremiumRates")
    @ResponseWrapper(localName = "updatePremiumRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PremiumRateServiceInterfaceupdatePremiumRatesResponse")
    public List<PremiumRate> updatePremiumRates(
        @WebParam(name = "premiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<PremiumRate> premiumRates)
        throws ApiException_Exception
    ;

}
