
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link CustomTargetingKey} objects.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link CustomTargetingKey#name}</li>
 *             <li>{@link CustomTargetingKey#type}</li>
 *             </ul>
 *             
 *             @param keys the custom targeting keys to update
 *             @return the updated custom targeting keys
 *           
 * 
 * <p>Java class for createCustomTargetingKeys element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createCustomTargetingKeys">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="keys" type="{https://www.google.com/apis/ads/publisher/v201411}CustomTargetingKey" maxOccurs="unbounded" minOccurs="0"/>
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
    "keys"
})
@XmlRootElement(name = "createCustomTargetingKeys")
public class CustomTargetingServiceInterfacecreateCustomTargetingKeys {

    protected List<CustomTargetingKey> keys;

    /**
     * Gets the value of the keys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTargetingKey }
     * 
     * 
     */
    public List<CustomTargetingKey> getKeys() {
        if (keys == null) {
            keys = new ArrayList<CustomTargetingKey>();
        }
        return this.keys;
    }

}
