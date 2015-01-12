
package com.google.api.ads.adwords.jaxws.v201409.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Results of a {@link ManagedCustomerService#mutateManager} call, which moves client customers to
 *             new managers.
 *           
 * 
 * <p>Java class for MutateManagerResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutateManagerResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="links" type="{https://adwords.google.com/api/adwords/mcm/v201409}ManagedCustomerLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateManagerResults", propOrder = {
    "links"
})
public class MutateManagerResults {

    protected List<ManagedCustomerLink> links;

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedCustomerLink }
     * 
     * 
     */
    public List<ManagedCustomerLink> getLinks() {
        if (links == null) {
            links = new ArrayList<ManagedCustomerLink>();
        }
        return this.links;
    }

}
