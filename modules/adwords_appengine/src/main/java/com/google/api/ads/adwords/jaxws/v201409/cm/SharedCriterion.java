
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sharedSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/cm/v201409}Criterion" minOccurs="0"/>
 *         &lt;element name="negative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedCriterion", propOrder = {
    "sharedSetId",
    "criterion",
    "negative"
})
public class SharedCriterion {

    protected Long sharedSetId;
    protected Criterion criterion;
    protected Boolean negative;

    /**
     * Gets the value of the sharedSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedSetId() {
        return sharedSetId;
    }

    /**
     * Sets the value of the sharedSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedSetId(Long value) {
        this.sharedSetId = value;
    }

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link Criterion }
     *     
     */
    public Criterion getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criterion }
     *     
     */
    public void setCriterion(Criterion value) {
        this.criterion = value;
    }

    /**
     * Gets the value of the negative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegative() {
        return negative;
    }

    /**
     * Sets the value of the negative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegative(Boolean value) {
        this.negative = value;
    }

}
