/**
 * CampaignSharedSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public class CampaignSharedSet  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span> */
    private java.lang.Long sharedSetId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "CampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span> */
    private java.lang.Long campaignId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String sharedSetName;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to NEGATIVE_KEYWORDS for campaign channel type SHOPPING.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.SharedSetType sharedSetType;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "CampaignName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String campaignName;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetStatus status;

    public CampaignSharedSet() {
    }

    public CampaignSharedSet(
           java.lang.Long sharedSetId,
           java.lang.Long campaignId,
           java.lang.String sharedSetName,
           com.google.api.ads.adwords.axis.v201409.cm.SharedSetType sharedSetType,
           java.lang.String campaignName,
           com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetStatus status) {
           this.sharedSetId = sharedSetId;
           this.campaignId = campaignId;
           this.sharedSetName = sharedSetName;
           this.sharedSetType = sharedSetType;
           this.campaignName = campaignName;
           this.status = status;
    }


    /**
     * Gets the sharedSetId value for this CampaignSharedSet.
     * 
     * @return sharedSetId   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public java.lang.Long getSharedSetId() {
        return sharedSetId;
    }


    /**
     * Sets the sharedSetId value for this CampaignSharedSet.
     * 
     * @param sharedSetId   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public void setSharedSetId(java.lang.Long sharedSetId) {
        this.sharedSetId = sharedSetId;
    }


    /**
     * Gets the campaignId value for this CampaignSharedSet.
     * 
     * @return campaignId   * <span class="constraint Selectable">This field can be selected
     * using the value "CampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignSharedSet.
     * 
     * @param campaignId   * <span class="constraint Selectable">This field can be selected
     * using the value "CampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the sharedSetName value for this CampaignSharedSet.
     * 
     * @return sharedSetName   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSharedSetName() {
        return sharedSetName;
    }


    /**
     * Sets the sharedSetName value for this CampaignSharedSet.
     * 
     * @param sharedSetName   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSharedSetName(java.lang.String sharedSetName) {
        this.sharedSetName = sharedSetName;
    }


    /**
     * Gets the sharedSetType value for this CampaignSharedSet.
     * 
     * @return sharedSetType   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to NEGATIVE_KEYWORDS for campaign channel type SHOPPING.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.SharedSetType getSharedSetType() {
        return sharedSetType;
    }


    /**
     * Sets the sharedSetType value for this CampaignSharedSet.
     * 
     * @param sharedSetType   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to NEGATIVE_KEYWORDS for campaign channel type SHOPPING.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setSharedSetType(com.google.api.ads.adwords.axis.v201409.cm.SharedSetType sharedSetType) {
        this.sharedSetType = sharedSetType;
    }


    /**
     * Gets the campaignName value for this CampaignSharedSet.
     * 
     * @return campaignName   * <span class="constraint Selectable">This field can be selected
     * using the value "CampaignName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this CampaignSharedSet.
     * 
     * @param campaignName   * <span class="constraint Selectable">This field can be selected
     * using the value "CampaignName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the status value for this CampaignSharedSet.
     * 
     * @return status   * <span class="constraint Selectable">This field can be selected
     * using the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignSharedSet.
     * 
     * @param status   * <span class="constraint Selectable">This field can be selected
     * using the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSharedSet)) return false;
        CampaignSharedSet other = (CampaignSharedSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sharedSetId==null && other.getSharedSetId()==null) || 
             (this.sharedSetId!=null &&
              this.sharedSetId.equals(other.getSharedSetId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.sharedSetName==null && other.getSharedSetName()==null) || 
             (this.sharedSetName!=null &&
              this.sharedSetName.equals(other.getSharedSetName()))) &&
            ((this.sharedSetType==null && other.getSharedSetType()==null) || 
             (this.sharedSetType!=null &&
              this.sharedSetType.equals(other.getSharedSetType()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getSharedSetId() != null) {
            _hashCode += getSharedSetId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getSharedSetName() != null) {
            _hashCode += getSharedSetName().hashCode();
        }
        if (getSharedSetType() != null) {
            _hashCode += getSharedSetType().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSharedSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CampaignSharedSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "sharedSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSetName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "sharedSetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "sharedSetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "SharedSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CampaignSharedSet.Status"));
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
