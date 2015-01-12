/**
 * CampaignAdExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents a campaign level ad extension. A campaign ad extension
 * specifies
 *             a campaign and an ad extension which can extend any ad
 * under that campaign.
 */
public class CampaignAdExtension  implements java.io.Serializable {
    /* Campaign ID of the campaign to which the ad extension is connected.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span> */
    private java.lang.Long campaignId;

    /* Ad extension.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.AdExtension adExtension;

    /* Status of ad extension in the campaign - defaults to {@code
     * ACTIVE} on add
     *                 if unspecified. */
    private com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionStatus status;

    /* Approval status. */
    private com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionApprovalStatus approvalStatus;

    public CampaignAdExtension() {
    }

    public CampaignAdExtension(
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201409.cm.AdExtension adExtension,
           com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionStatus status,
           com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionApprovalStatus approvalStatus) {
           this.campaignId = campaignId;
           this.adExtension = adExtension;
           this.status = status;
           this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the campaignId value for this CampaignAdExtension.
     * 
     * @return campaignId   * Campaign ID of the campaign to which the ad extension is connected.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignAdExtension.
     * 
     * @param campaignId   * Campaign ID of the campaign to which the ad extension is connected.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adExtension value for this CampaignAdExtension.
     * 
     * @return adExtension   * Ad extension.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdExtension getAdExtension() {
        return adExtension;
    }


    /**
     * Sets the adExtension value for this CampaignAdExtension.
     * 
     * @param adExtension   * Ad extension.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdExtension(com.google.api.ads.adwords.axis.v201409.cm.AdExtension adExtension) {
        this.adExtension = adExtension;
    }


    /**
     * Gets the status value for this CampaignAdExtension.
     * 
     * @return status   * Status of ad extension in the campaign - defaults to {@code
     * ACTIVE} on add
     *                 if unspecified.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignAdExtension.
     * 
     * @param status   * Status of ad extension in the campaign - defaults to {@code
     * ACTIVE} on add
     *                 if unspecified.
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionStatus status) {
        this.status = status;
    }


    /**
     * Gets the approvalStatus value for this CampaignAdExtension.
     * 
     * @return approvalStatus   * Approval status.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this CampaignAdExtension.
     * 
     * @param approvalStatus   * Approval status.
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201409.cm.CampaignAdExtensionApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignAdExtension)) return false;
        CampaignAdExtension other = (CampaignAdExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adExtension==null && other.getAdExtension()==null) || 
             (this.adExtension!=null &&
              this.adExtension.equals(other.getAdExtension()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdExtension() != null) {
            _hashCode += getAdExtension().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignAdExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CampaignAdExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "adExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdExtension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CampaignAdExtension.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CampaignAdExtension.ApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
