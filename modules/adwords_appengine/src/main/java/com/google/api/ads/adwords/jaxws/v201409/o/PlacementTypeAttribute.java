
package com.google.api.ads.adwords.jaxws.v201409.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains a {@link PlacementType} value.
 *           
 * 
 * <p>Java class for PlacementTypeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementTypeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201409}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201409}SiteConstants.PlacementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementTypeAttribute", propOrder = {
    "value"
})
public class PlacementTypeAttribute
    extends Attribute
{

    protected SiteConstantsPlacementType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SiteConstantsPlacementType }
     *     
     */
    public SiteConstantsPlacementType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConstantsPlacementType }
     *     
     */
    public void setValue(SiteConstantsPlacementType value) {
        this.value = value;
    }

}
