
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists the generic errors associated with {@link AdUnit#adUnitCode}.
 *           
 * 
 * <p>Java class for AdUnitCodeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnitCodeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201411}AdUnitCodeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnitCodeError", propOrder = {
    "reason"
})
public class AdUnitCodeError
    extends ApiError
{

    protected AdUnitCodeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitCodeErrorReason }
     *     
     */
    public AdUnitCodeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitCodeErrorReason }
     *     
     */
    public void setReason(AdUnitCodeErrorReason value) {
        this.reason = value;
    }

}
