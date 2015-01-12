
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents browser languages that are being targeted or excluded by the
 *             {@link LineItem}.
 *           
 * 
 * <p>Java class for BrowserLanguageTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrowserLanguageTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isTargeted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="browserLanguages" type="{https://www.google.com/apis/ads/publisher/v201411}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowserLanguageTargeting", propOrder = {
    "isTargeted",
    "browserLanguages"
})
public class BrowserLanguageTargeting {

    protected Boolean isTargeted;
    protected List<Technology> browserLanguages;

    /**
     * Gets the value of the isTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTargeted() {
        return isTargeted;
    }

    /**
     * Sets the value of the isTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTargeted(Boolean value) {
        this.isTargeted = value;
    }

    /**
     * Gets the value of the browserLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the browserLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrowserLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getBrowserLanguages() {
        if (browserLanguages == null) {
            browserLanguages = new ArrayList<Technology>();
        }
        return this.browserLanguages;
    }

}
