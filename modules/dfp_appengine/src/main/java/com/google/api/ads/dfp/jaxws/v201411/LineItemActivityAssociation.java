
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code LineItemActivityAssociation} associates a {@link LineItem} with an {@link Activity} so
 *             that the conversions of the {@link Activity} can be counted against the {@link LineItem}.
 *           
 * 
 * <p>Java class for LineItemActivityAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemActivityAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clickThroughConversionCost" type="{https://www.google.com/apis/ads/publisher/v201411}Money" minOccurs="0"/>
 *         &lt;element name="viewThroughConversionCost" type="{https://www.google.com/apis/ads/publisher/v201411}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemActivityAssociation", propOrder = {
    "activityId",
    "clickThroughConversionCost",
    "viewThroughConversionCost"
})
public class LineItemActivityAssociation {

    protected Integer activityId;
    protected Money clickThroughConversionCost;
    protected Money viewThroughConversionCost;

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityId(Integer value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the clickThroughConversionCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getClickThroughConversionCost() {
        return clickThroughConversionCost;
    }

    /**
     * Sets the value of the clickThroughConversionCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setClickThroughConversionCost(Money value) {
        this.clickThroughConversionCost = value;
    }

    /**
     * Gets the value of the viewThroughConversionCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getViewThroughConversionCost() {
        return viewThroughConversionCost;
    }

    /**
     * Sets the value of the viewThroughConversionCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setViewThroughConversionCost(Money value) {
        this.viewThroughConversionCost = value;
    }

}
