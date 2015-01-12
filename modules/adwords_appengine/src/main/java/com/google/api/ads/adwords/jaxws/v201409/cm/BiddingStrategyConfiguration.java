
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Encapsulates the information about bids and bidding strategies.
 *             
 *             Bidding Strategy can be set on campaigns, ad groups or ad group criteria.
 *             A bidding strategy can be set using one of the following:
 *             <ul>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingScheme bidding scheme}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyType bidding strategy type}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyId bidding strategy ID} for
 *             flexible bid strategies.</li>
 *             </ul>
 *             If the bidding strategy type is used, then schemes are created using default values.
 *             
 *             Bids can be set only on ad groups and ad group criteria. They cannot be set on campaigns.
 *             Multiple bids can be set at the same time. Only the bids that apply to the campaign's
 *             {@linkplain Campaign#biddingStrategyConfiguration bidding strategy} will be used.
 *             
 *             For more information on flexible bidding, visit the
 *             <a href="https://support.google.com/adwords/answer/2979071">Help Center</a>.
 *           
 * 
 * <p>Java class for BiddingStrategyConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingStrategyConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biddingStrategyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="biddingStrategyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biddingStrategyType" type="{https://adwords.google.com/api/adwords/cm/v201409}BiddingStrategyType" minOccurs="0"/>
 *         &lt;element name="biddingStrategySource" type="{https://adwords.google.com/api/adwords/cm/v201409}BiddingStrategySource" minOccurs="0"/>
 *         &lt;element name="biddingScheme" type="{https://adwords.google.com/api/adwords/cm/v201409}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="bids" type="{https://adwords.google.com/api/adwords/cm/v201409}Bids" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingStrategyConfiguration", propOrder = {
    "biddingStrategyId",
    "biddingStrategyName",
    "biddingStrategyType",
    "biddingStrategySource",
    "biddingScheme",
    "bids"
})
public class BiddingStrategyConfiguration {

    protected Long biddingStrategyId;
    protected String biddingStrategyName;
    protected BiddingStrategyType biddingStrategyType;
    protected BiddingStrategySource biddingStrategySource;
    protected BiddingScheme biddingScheme;
    protected List<Bids> bids;

    /**
     * Gets the value of the biddingStrategyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBiddingStrategyId() {
        return biddingStrategyId;
    }

    /**
     * Sets the value of the biddingStrategyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBiddingStrategyId(Long value) {
        this.biddingStrategyId = value;
    }

    /**
     * Gets the value of the biddingStrategyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiddingStrategyName() {
        return biddingStrategyName;
    }

    /**
     * Sets the value of the biddingStrategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiddingStrategyName(String value) {
        this.biddingStrategyName = value;
    }

    /**
     * Gets the value of the biddingStrategyType property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyType }
     *     
     */
    public BiddingStrategyType getBiddingStrategyType() {
        return biddingStrategyType;
    }

    /**
     * Sets the value of the biddingStrategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyType }
     *     
     */
    public void setBiddingStrategyType(BiddingStrategyType value) {
        this.biddingStrategyType = value;
    }

    /**
     * Gets the value of the biddingStrategySource property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategySource }
     *     
     */
    public BiddingStrategySource getBiddingStrategySource() {
        return biddingStrategySource;
    }

    /**
     * Sets the value of the biddingStrategySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategySource }
     *     
     */
    public void setBiddingStrategySource(BiddingStrategySource value) {
        this.biddingStrategySource = value;
    }

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the bids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bids }
     * 
     * 
     */
    public List<Bids> getBids() {
        if (bids == null) {
            bids = new ArrayList<Bids>();
        }
        return this.bids;
    }

}
