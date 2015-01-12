
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents violations of a single policy by some text in a field.
 *             
 *             Violations of a single policy by the same string in multiple places
 *             within a field is reported in one instance of this class and only one
 *             exemption needs to be filed.
 *             Violations of a single policy by two different strings is reported
 *             as two separate instances of this class.
 *             
 *             e.g. If 'ACME' violates 'capitalization' and occurs twice in a text ad it
 *             would be represented by one instance. If the ad also contains 'INC' which
 *             also violates 'capitalization' it would be represented in a separate
 *             instance.
 *           
 * 
 * <p>Java class for PolicyViolationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyViolationError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}ApiError">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/cm/v201409}PolicyViolationKey" minOccurs="0"/>
 *         &lt;element name="externalPolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalPolicyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalPolicyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isExemptable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="violatingParts" type="{https://adwords.google.com/api/adwords/cm/v201409}PolicyViolationError.Part" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyViolationError", propOrder = {
    "key",
    "externalPolicyName",
    "externalPolicyUrl",
    "externalPolicyDescription",
    "isExemptable",
    "violatingParts"
})
@XmlSeeAlso({
    AdParamPolicyError.class,
    CriterionPolicyError.class
})
public class PolicyViolationError
    extends ApiError
{

    protected PolicyViolationKey key;
    protected String externalPolicyName;
    protected String externalPolicyUrl;
    protected String externalPolicyDescription;
    protected Boolean isExemptable;
    protected List<PolicyViolationErrorPart> violatingParts;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyViolationKey }
     *     
     */
    public PolicyViolationKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyViolationKey }
     *     
     */
    public void setKey(PolicyViolationKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the externalPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPolicyName() {
        return externalPolicyName;
    }

    /**
     * Sets the value of the externalPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPolicyName(String value) {
        this.externalPolicyName = value;
    }

    /**
     * Gets the value of the externalPolicyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPolicyUrl() {
        return externalPolicyUrl;
    }

    /**
     * Sets the value of the externalPolicyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPolicyUrl(String value) {
        this.externalPolicyUrl = value;
    }

    /**
     * Gets the value of the externalPolicyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPolicyDescription() {
        return externalPolicyDescription;
    }

    /**
     * Sets the value of the externalPolicyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPolicyDescription(String value) {
        this.externalPolicyDescription = value;
    }

    /**
     * Gets the value of the isExemptable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExemptable() {
        return isExemptable;
    }

    /**
     * Sets the value of the isExemptable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExemptable(Boolean value) {
        this.isExemptable = value;
    }

    /**
     * Gets the value of the violatingParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the violatingParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViolatingParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyViolationErrorPart }
     * 
     * 
     */
    public List<PolicyViolationErrorPart> getViolatingParts() {
        if (violatingParts == null) {
            violatingParts = new ArrayList<PolicyViolationErrorPart>();
        }
        return this.violatingParts;
    }

}
