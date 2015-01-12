
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ProductPage} of {@link Product} objects that satisfy the criteria specified by
 *             given {@link Statement#query}. The following fields are supported for filtering and/or sorting:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th>
 *             <th scope="col">Object Property</th>
 *             <th scope="col">Filterable</th>
 *             <th scope="col">Sortable</th>
 *             </tr>
 *             <tr>
 *             <td>{@code rateCardId}</td>
 *             <td>Rate card ID which the product is associated with</td>
 *             <td>Yes</td>
 *             <td>No</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link Product#status}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lineItemType}</td>
 *             <td>{@link Product#lineItemType}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             <td>{@code productType}</td>
 *             <td>{@link Product#productType}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             <tr>
 *             <td>{@code rateType}</td>
 *             <td>{@link Product#rateType}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productTemplateId}</td>
 *             <td>{@link Product#productTemplateId}</td>
 *             <td>Yes</td>
 *             <td>No</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link Product#name}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             <tr>
 *             <td>{@code description}</td>
 *             <td>{@link Product#description}</td>
 *             <td>Yes</td>
 *             <td>No</td>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link Product#id}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lastModifiedDateTime}</td>
 *             <td>{@link Product#lastModifiedDateTime}</td>
 *             <td>Yes</td>
 *             <td>Yes</td>
 *             </tr>
 *             </table>
 *             
 *             @param statement a Publisher Query Language statement which specifies the filtering
 *             criteria over products
 *             @return the products that match the given statement
 *           
 * 
 * <p>Java class for getProductsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProductsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201405}Statement" minOccurs="0"/>
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
    "statement"
})
@XmlRootElement(name = "getProductsByStatement")
public class ProductServiceInterfacegetProductsByStatement {

    protected Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
