
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an item in a feed.
 *           
 * 
 * <p>Java class for FeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feedItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItem.Status" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeValues" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validationDetails" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemValidationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="devicePreference" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemDevicePreference" minOccurs="0"/>
 *         &lt;element name="scheduling" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemScheduling" minOccurs="0"/>
 *         &lt;element name="campaignTargeting" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemCampaignTargeting" minOccurs="0"/>
 *         &lt;element name="adGroupTargeting" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemAdGroupTargeting" minOccurs="0"/>
 *         &lt;element name="keywordTargeting" type="{https://adwords.google.com/api/adwords/cm/v201409}Keyword" minOccurs="0"/>
 *         &lt;element name="urlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201409}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItem", propOrder = {
    "feedId",
    "feedItemId",
    "status",
    "startTime",
    "endTime",
    "attributeValues",
    "validationDetails",
    "devicePreference",
    "scheduling",
    "campaignTargeting",
    "adGroupTargeting",
    "keywordTargeting",
    "urlCustomParameters"
})
public class FeedItem {

    protected Long feedId;
    protected Long feedItemId;
    protected FeedItemStatus status;
    protected String startTime;
    protected String endTime;
    protected List<FeedItemAttributeValue> attributeValues;
    protected List<FeedItemValidationDetail> validationDetails;
    protected FeedItemDevicePreference devicePreference;
    protected FeedItemScheduling scheduling;
    protected FeedItemCampaignTargeting campaignTargeting;
    protected FeedItemAdGroupTargeting adGroupTargeting;
    protected Keyword keywordTargeting;
    protected CustomParameters urlCustomParameters;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the feedItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedItemId() {
        return feedItemId;
    }

    /**
     * Sets the value of the feedItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedItemId(Long value) {
        this.feedItemId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemStatus }
     *     
     */
    public FeedItemStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemStatus }
     *     
     */
    public void setStatus(FeedItemStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the attributeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemAttributeValue }
     * 
     * 
     */
    public List<FeedItemAttributeValue> getAttributeValues() {
        if (attributeValues == null) {
            attributeValues = new ArrayList<FeedItemAttributeValue>();
        }
        return this.attributeValues;
    }

    /**
     * Gets the value of the validationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemValidationDetail }
     * 
     * 
     */
    public List<FeedItemValidationDetail> getValidationDetails() {
        if (validationDetails == null) {
            validationDetails = new ArrayList<FeedItemValidationDetail>();
        }
        return this.validationDetails;
    }

    /**
     * Gets the value of the devicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemDevicePreference }
     *     
     */
    public FeedItemDevicePreference getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the value of the devicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemDevicePreference }
     *     
     */
    public void setDevicePreference(FeedItemDevicePreference value) {
        this.devicePreference = value;
    }

    /**
     * Gets the value of the scheduling property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemScheduling }
     *     
     */
    public FeedItemScheduling getScheduling() {
        return scheduling;
    }

    /**
     * Sets the value of the scheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemScheduling }
     *     
     */
    public void setScheduling(FeedItemScheduling value) {
        this.scheduling = value;
    }

    /**
     * Gets the value of the campaignTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemCampaignTargeting }
     *     
     */
    public FeedItemCampaignTargeting getCampaignTargeting() {
        return campaignTargeting;
    }

    /**
     * Sets the value of the campaignTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemCampaignTargeting }
     *     
     */
    public void setCampaignTargeting(FeedItemCampaignTargeting value) {
        this.campaignTargeting = value;
    }

    /**
     * Gets the value of the adGroupTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemAdGroupTargeting }
     *     
     */
    public FeedItemAdGroupTargeting getAdGroupTargeting() {
        return adGroupTargeting;
    }

    /**
     * Sets the value of the adGroupTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemAdGroupTargeting }
     *     
     */
    public void setAdGroupTargeting(FeedItemAdGroupTargeting value) {
        this.adGroupTargeting = value;
    }

    /**
     * Gets the value of the keywordTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Keyword }
     *     
     */
    public Keyword getKeywordTargeting() {
        return keywordTargeting;
    }

    /**
     * Sets the value of the keywordTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keyword }
     *     
     */
    public void setKeywordTargeting(Keyword value) {
        this.keywordTargeting = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

}
