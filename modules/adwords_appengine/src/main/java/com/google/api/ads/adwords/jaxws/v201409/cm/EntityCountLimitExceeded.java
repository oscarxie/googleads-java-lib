
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Signals that an entity count limit was exceeded for some level.
 *             For example, too many criteria for a campaign.
 *           
 * 
 * <p>Java class for EntityCountLimitExceeded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityCountLimitExceeded">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201409}EntityCountLimitExceeded.Reason" minOccurs="0"/>
 *         &lt;element name="enclosingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="accountLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityCountLimitExceeded", propOrder = {
    "reason",
    "enclosingId",
    "limit",
    "accountLimitType",
    "existingCount"
})
@XmlSeeAlso({
    AdGroupCriterionLimitExceeded.class,
    AdGroupAdCountLimitExceeded.class
})
public class EntityCountLimitExceeded
    extends ApiError
{

    protected EntityCountLimitExceededReason reason;
    protected String enclosingId;
    protected Integer limit;
    protected String accountLimitType;
    protected Integer existingCount;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCountLimitExceededReason }
     *     
     */
    public EntityCountLimitExceededReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCountLimitExceededReason }
     *     
     */
    public void setReason(EntityCountLimitExceededReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the enclosingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosingId() {
        return enclosingId;
    }

    /**
     * Sets the value of the enclosingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosingId(String value) {
        this.enclosingId = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the accountLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLimitType() {
        return accountLimitType;
    }

    /**
     * Sets the value of the accountLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLimitType(String value) {
        this.accountLimitType = value;
    }

    /**
     * Gets the value of the existingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingCount() {
        return existingCount;
    }

    /**
     * Sets the value of the existingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingCount(Integer value) {
        this.existingCount = value;
    }

}
