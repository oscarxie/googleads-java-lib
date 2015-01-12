
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for approving {@link Order} objects. All {@link LineItem}
 *             objects within the order will be approved as well.
 *           
 * 
 * <p>Java class for ApproveOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproveOrders">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}OrderAction">
 *       &lt;sequence>
 *         &lt;element name="skipInventoryCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproveOrders", propOrder = {
    "skipInventoryCheck"
})
@XmlSeeAlso({
    ApproveAndOverbookOrders.class
})
public class ApproveOrders
    extends OrderAction
{

    protected Boolean skipInventoryCheck;

    /**
     * Gets the value of the skipInventoryCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipInventoryCheck() {
        return skipInventoryCheck;
    }

    /**
     * Sets the value of the skipInventoryCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipInventoryCheck(Boolean value) {
        this.skipInventoryCheck = value;
    }

}
