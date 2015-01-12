
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ProductTemplate} objects.
 *             
 *             @param productTemplates the product templates to update
 *             @return the updated product templates
 *           
 * 
 * <p>Java class for updateProductTemplates element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateProductTemplates">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productTemplates" type="{https://www.google.com/apis/ads/publisher/v201411}ProductTemplate" maxOccurs="unbounded" minOccurs="0"/>
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
    "productTemplates"
})
@XmlRootElement(name = "updateProductTemplates")
public class ProductTemplateServiceInterfaceupdateProductTemplates {

    protected List<ProductTemplate> productTemplates;

    /**
     * Gets the value of the productTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTemplate }
     * 
     * 
     */
    public List<ProductTemplate> getProductTemplates() {
        if (productTemplates == null) {
            productTemplates = new ArrayList<ProductTemplate>();
        }
        return this.productTemplates;
    }

}
