
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link AdExclusionRule} objects.
 *             
 *             @param adExclusionRules the ad exclusion rules to update
 *             @return the updated rules
 *           
 * 
 * <p>Java class for updateAdExclusionRules element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateAdExclusionRules">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adExclusionRules" type="{https://www.google.com/apis/ads/publisher/v201411}AdExclusionRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adExclusionRules"
})
@XmlRootElement(name = "updateAdExclusionRules")
public class AdExclusionRuleServiceInterfaceupdateAdExclusionRules {

    protected List<AdExclusionRule> adExclusionRules;

    /**
     * Gets the value of the adExclusionRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExclusionRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExclusionRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExclusionRule }
     * 
     * 
     */
    public List<AdExclusionRule> getAdExclusionRules() {
        if (adExclusionRules == null) {
            adExclusionRules = new ArrayList<AdExclusionRule>();
        }
        return this.adExclusionRules;
    }

}
