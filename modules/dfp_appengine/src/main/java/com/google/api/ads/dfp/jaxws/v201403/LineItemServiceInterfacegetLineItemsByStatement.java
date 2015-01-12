
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link LineItemPage} of {@link LineItem} objects that satisfy the
 *             given {@link Statement#query}. The following fields are supported for
 *             filtering:
 *             
 *             <table>
 * <tr><th scope="col">PQL property</th><th scope="col">Entity property</th> </tr>
 * <tr><td><code>CostType</code></td><td>{@link LineItem#costType}</td></tr>
 * <tr><td><code>CreationDateTime</code></td><td>{@link LineItem#creationDateTime}</td></tr>
 * <tr><td><code>DeliveryRateType</code></td><td>{@link LineItem#deliveryRateType}</td></tr>
 * <tr><td><code>EndDateTime</code></td><td>{@link LineItem#endDateTime}</td></tr>
 * <tr><td><code>ExternalId</code></td><td>{@link LineItem#externalId}</td></tr>
 * <tr><td><code>Id</code></td><td>{@link LineItem#id}</td></tr>
 * <tr><td><code>IsMissingCreatives</code></td><td>{@link LineItem#isMissingCreatives}</td></tr>
 * <tr><td><code>LastModifiedDateTime</code></td><td>{@link LineItem#lastModifiedDateTime}</td></tr>
 * <tr><td><code>LineItemType</code></td><td>{@link LineItem#lineItemType}</td></tr>
 * <tr><td><code>Name</code></td><td>{@link LineItem#name}</td></tr>
 * <tr><td><code>OrderId</code></td><td>{@link LineItem#orderId}</td></tr>
 * <tr><td><code>StartDateTime</code></td><td>{@link LineItem#startDateTime}</td></tr>
 * <tr><td><code>Status</code></td><td>{@link LineItem#status}</td></tr>
 * <tr><td><code>UnitsBought</code></td><td>{@link LineItem#unitsBought}</td></tr>
 * </table>
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of line items.
 *             @return the line items that match the given filter
 *           
 * 
 * <p>Java class for getLineItemsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getLineItemsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201403}Statement" minOccurs="0"/>
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
    "filterStatement"
})
@XmlRootElement(name = "getLineItemsByStatement")
public class LineItemServiceInterfacegetLineItemsByStatement {

    protected Statement filterStatement;

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
