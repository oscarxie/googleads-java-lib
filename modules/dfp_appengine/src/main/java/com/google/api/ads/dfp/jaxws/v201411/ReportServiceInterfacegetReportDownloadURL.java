
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the URL at which the report file can be downloaded.
 *             <p>
 *             The report will be generated as a gzip archive, containing the report file itself.
 *             
 *             @param reportJobId the ID of the {@link ReportJob}
 *             @param exportFormat the {@link ExportFormat} for the report file
 *             @return the URL for report file download
 *           
 * 
 * <p>Java class for getReportDownloadURL element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReportDownloadURL">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reportJobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *           &lt;element name="exportFormat" type="{https://www.google.com/apis/ads/publisher/v201411}ExportFormat" minOccurs="0"/>
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
    "reportJobId",
    "exportFormat"
})
@XmlRootElement(name = "getReportDownloadURL")
public class ReportServiceInterfacegetReportDownloadURL {

    protected Long reportJobId;
    protected ExportFormat exportFormat;

    /**
     * Gets the value of the reportJobId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportJobId() {
        return reportJobId;
    }

    /**
     * Sets the value of the reportJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportJobId(Long value) {
        this.reportJobId = value;
    }

    /**
     * Gets the value of the exportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ExportFormat }
     *     
     */
    public ExportFormat getExportFormat() {
        return exportFormat;
    }

    /**
     * Sets the value of the exportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportFormat }
     *     
     */
    public void setExportFormat(ExportFormat value) {
        this.exportFormat = value;
    }

}
