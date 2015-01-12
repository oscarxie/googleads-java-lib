
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation not permitted due to the invoked service's access policy.
 *           
 * 
 * <p>Java class for OperationAccessDenied complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationAccessDenied">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201409}OperationAccessDenied.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationAccessDenied", propOrder = {
    "reason"
})
public class OperationAccessDenied
    extends ApiError
{

    protected OperationAccessDeniedReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link OperationAccessDeniedReason }
     *     
     */
    public OperationAccessDeniedReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationAccessDeniedReason }
     *     
     */
    public void setReason(OperationAccessDeniedReason value) {
        this.reason = value;
    }

}
