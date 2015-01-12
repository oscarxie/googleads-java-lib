
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the URL at which the report file can be downloaded, and allows for customization
 *             of the downloaded report.
 *             <p>
 *             By default, the report will be generated as a gzip archive, containing the report file itself.
 *             This can be changed by setting {@link ReportDownloadOptions#useGzipCompression} to false.
 *             
 *             @param reportJobId the ID of the {@link ReportJob}
 *             @param reportDownloadOptions the {@link ReportDownloadOptions} for the request
 *             @return the URL for report file download
 *           
 * 
 * <p>Java class for getReportDownloadUrlWithOptions element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReportDownloadUrlWithOptions">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reportJobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *           &lt;element name="reportDownloadOptions" type="{https://www.google.com/apis/ads/publisher/v201411}ReportDownloadOptions" minOccurs="0"/>
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
    "reportDownloadOptions"
})
@XmlRootElement(name = "getReportDownloadUrlWithOptions")
public class ReportServiceInterfacegetReportDownloadUrlWithOptions {

    protected Long reportJobId;
    protected ReportDownloadOptions reportDownloadOptions;

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
     * Gets the value of the reportDownloadOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDownloadOptions }
     *     
     */
    public ReportDownloadOptions getReportDownloadOptions() {
        return reportDownloadOptions;
    }

    /**
     * Sets the value of the reportDownloadOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDownloadOptions }
     *     
     */
    public void setReportDownloadOptions(ReportDownloadOptions value) {
        this.reportDownloadOptions = value;
    }

}
