
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data associated with an advertiser experiment for an AdGroupAd
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for AdGroupAdExperimentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupAdExperimentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="experimentDeltaStatus" type="{https://adwords.google.com/api/adwords/cm/v201409}ExperimentDeltaStatus" minOccurs="0"/>
 *         &lt;element name="experimentDataStatus" type="{https://adwords.google.com/api/adwords/cm/v201409}ExperimentDataStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupAdExperimentData", propOrder = {
    "experimentId",
    "experimentDeltaStatus",
    "experimentDataStatus"
})
public class AdGroupAdExperimentData {

    protected Long experimentId;
    protected ExperimentDeltaStatus experimentDeltaStatus;
    protected ExperimentDataStatus experimentDataStatus;

    /**
     * Gets the value of the experimentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExperimentId() {
        return experimentId;
    }

    /**
     * Sets the value of the experimentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExperimentId(Long value) {
        this.experimentId = value;
    }

    /**
     * Gets the value of the experimentDeltaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentDeltaStatus }
     *     
     */
    public ExperimentDeltaStatus getExperimentDeltaStatus() {
        return experimentDeltaStatus;
    }

    /**
     * Sets the value of the experimentDeltaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentDeltaStatus }
     *     
     */
    public void setExperimentDeltaStatus(ExperimentDeltaStatus value) {
        this.experimentDeltaStatus = value;
    }

    /**
     * Gets the value of the experimentDataStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentDataStatus }
     *     
     */
    public ExperimentDataStatus getExperimentDataStatus() {
        return experimentDataStatus;
    }

    /**
     * Sets the value of the experimentDataStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentDataStatus }
     *     
     */
    public void setExperimentDataStatus(ExperimentDataStatus value) {
        this.experimentDataStatus = value;
    }

}
