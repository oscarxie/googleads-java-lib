
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation used to create or mutate an AdGroupFeed.
 *           
 * 
 * <p>Java class for AdGroupFeedOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupFeedOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201409}AdGroupFeed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupFeedOperation", propOrder = {
    "operand"
})
public class AdGroupFeedOperation
    extends Operation
{

    protected AdGroupFeed operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupFeed }
     *     
     */
    public AdGroupFeed getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupFeed }
     *     
     */
    public void setOperand(AdGroupFeed value) {
        this.operand = value;
    }

}
