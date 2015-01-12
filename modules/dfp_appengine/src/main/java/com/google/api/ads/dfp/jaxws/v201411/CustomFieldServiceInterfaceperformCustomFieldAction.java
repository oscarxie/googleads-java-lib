
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CustomField} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param customFieldAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of custom fields
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performCustomFieldAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCustomFieldAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customFieldAction" type="{https://www.google.com/apis/ads/publisher/v201411}CustomFieldAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201411}Statement" minOccurs="0"/>
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
    "customFieldAction",
    "filterStatement"
})
@XmlRootElement(name = "performCustomFieldAction")
public class CustomFieldServiceInterfaceperformCustomFieldAction {

    protected CustomFieldAction customFieldAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the customFieldAction property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldAction }
     *     
     */
    public CustomFieldAction getCustomFieldAction() {
        return customFieldAction;
    }

    /**
     * Sets the value of the customFieldAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldAction }
     *     
     */
    public void setCustomFieldAction(CustomFieldAction value) {
        this.customFieldAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
