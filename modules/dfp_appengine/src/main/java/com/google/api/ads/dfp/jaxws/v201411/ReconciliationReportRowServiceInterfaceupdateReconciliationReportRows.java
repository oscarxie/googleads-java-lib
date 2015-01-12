
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates a list of {@link ReconciliationReportRow} which belong to same
 *             {@link ReconciliationReport}.
 *             
 *             @param reconciliationReportRows a list of reconciliation report rows to update
 *             @return the updated reconciliation report rows
 *           
 * 
 * <p>Java class for updateReconciliationReportRows element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateReconciliationReportRows">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reconciliationReportRows" type="{https://www.google.com/apis/ads/publisher/v201411}ReconciliationReportRow" maxOccurs="unbounded" minOccurs="0"/>
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
    "reconciliationReportRows"
})
@XmlRootElement(name = "updateReconciliationReportRows")
public class ReconciliationReportRowServiceInterfaceupdateReconciliationReportRows {

    protected List<ReconciliationReportRow> reconciliationReportRows;

    /**
     * Gets the value of the reconciliationReportRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reconciliationReportRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReconciliationReportRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationReportRow }
     * 
     * 
     */
    public List<ReconciliationReportRow> getReconciliationReportRows() {
        if (reconciliationReportRows == null) {
            reconciliationReportRows = new ArrayList<ReconciliationReportRow>();
        }
        return this.reconciliationReportRows;
    }

}
