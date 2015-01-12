
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This operand specifies a place of interest category for semantic targeting.
 *           
 * 
 * <p>Java class for PlacesOfInterestOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacesOfInterestOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="category" type="{https://adwords.google.com/api/adwords/cm/v201409}PlacesOfInterestOperand.Category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacesOfInterestOperand", propOrder = {
    "category"
})
public class PlacesOfInterestOperand
    extends FunctionArgumentOperand
{

    protected PlacesOfInterestOperandCategory category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesOfInterestOperandCategory }
     *     
     */
    public PlacesOfInterestOperandCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesOfInterestOperandCategory }
     *     
     */
    public void setCategory(PlacesOfInterestOperandCategory value) {
        this.category = value;
    }

}
