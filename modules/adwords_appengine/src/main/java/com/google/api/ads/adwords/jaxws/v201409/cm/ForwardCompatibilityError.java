
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A ForwardComptibilityError represents possible errors when using the forwardCompatibilityMap
 *             in some of the common services.
 *           
 * 
 * <p>Java class for ForwardCompatibilityError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardCompatibilityError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201409}ForwardCompatibilityError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardCompatibilityError", propOrder = {
    "reason"
})
public class ForwardCompatibilityError
    extends ApiError
{

    protected ForwardCompatibilityErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardCompatibilityErrorReason }
     *     
     */
    public ForwardCompatibilityErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardCompatibilityErrorReason }
     *     
     */
    public void setReason(ForwardCompatibilityErrorReason value) {
        this.reason = value;
    }

}
