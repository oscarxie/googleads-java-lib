
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A premium of a {@link RateCard} which could be applied to the line item
 *             and charges extra.
 *           
 * 
 * <p>Java class for PremiumRateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumRateValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premiumRateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="premiumFeature" type="{https://www.google.com/apis/ads/publisher/v201411}PremiumFeature" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201411}RateType" minOccurs="0"/>
 *         &lt;element name="adjustmentType" type="{https://www.google.com/apis/ads/publisher/v201411}PremiumAdjustmentType" minOccurs="0"/>
 *         &lt;element name="adjustmentSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumRateValue", propOrder = {
    "premiumRateId",
    "premiumFeature",
    "rateType",
    "adjustmentType",
    "adjustmentSize"
})
public class PremiumRateValue {

    protected Long premiumRateId;
    protected PremiumFeature premiumFeature;
    protected RateType rateType;
    protected PremiumAdjustmentType adjustmentType;
    protected Long adjustmentSize;

    /**
     * Gets the value of the premiumRateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPremiumRateId() {
        return premiumRateId;
    }

    /**
     * Sets the value of the premiumRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPremiumRateId(Long value) {
        this.premiumRateId = value;
    }

    /**
     * Gets the value of the premiumFeature property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumFeature }
     *     
     */
    public PremiumFeature getPremiumFeature() {
        return premiumFeature;
    }

    /**
     * Sets the value of the premiumFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumFeature }
     *     
     */
    public void setPremiumFeature(PremiumFeature value) {
        this.premiumFeature = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAdjustmentType }
     *     
     */
    public PremiumAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAdjustmentType }
     *     
     */
    public void setAdjustmentType(PremiumAdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustmentSize() {
        return adjustmentSize;
    }

    /**
     * Sets the value of the adjustmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustmentSize(Long value) {
        this.adjustmentSize = value;
    }

}
