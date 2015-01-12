/**
 * ProposalLineItemPremium.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * Represents the status of a triggered {@link PremiumRateValue} (formerly
 * referred to as a {@code RateCardCustomization}).
 */
public class ProposalLineItemPremium  implements java.io.Serializable {
    /* The {@link PremiumRateValue} triggered by the {@link ProposalLineItem}.
     * This attribute is required. */
    private com.google.api.ads.dfp.axis.v201411.PremiumRateValue premiumRateValue;

    /* The status of the triggered premium. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201411.ProposalLineItemPremiumStatus status;

    public ProposalLineItemPremium() {
    }

    public ProposalLineItemPremium(
           com.google.api.ads.dfp.axis.v201411.PremiumRateValue premiumRateValue,
           com.google.api.ads.dfp.axis.v201411.ProposalLineItemPremiumStatus status) {
           this.premiumRateValue = premiumRateValue;
           this.status = status;
    }


    /**
     * Gets the premiumRateValue value for this ProposalLineItemPremium.
     * 
     * @return premiumRateValue   * The {@link PremiumRateValue} triggered by the {@link ProposalLineItem}.
     * This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201411.PremiumRateValue getPremiumRateValue() {
        return premiumRateValue;
    }


    /**
     * Sets the premiumRateValue value for this ProposalLineItemPremium.
     * 
     * @param premiumRateValue   * The {@link PremiumRateValue} triggered by the {@link ProposalLineItem}.
     * This attribute is required.
     */
    public void setPremiumRateValue(com.google.api.ads.dfp.axis.v201411.PremiumRateValue premiumRateValue) {
        this.premiumRateValue = premiumRateValue;
    }


    /**
     * Gets the status value for this ProposalLineItemPremium.
     * 
     * @return status   * The status of the triggered premium. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201411.ProposalLineItemPremiumStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProposalLineItemPremium.
     * 
     * @param status   * The status of the triggered premium. This attribute is required.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201411.ProposalLineItemPremiumStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemPremium)) return false;
        ProposalLineItemPremium other = (ProposalLineItemPremium) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.premiumRateValue==null && other.getPremiumRateValue()==null) || 
             (this.premiumRateValue!=null &&
              this.premiumRateValue.equals(other.getPremiumRateValue()))) &&
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
        if (getPremiumRateValue() != null) {
            _hashCode += getPremiumRateValue().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemPremium.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "ProposalLineItemPremium"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiumRateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "premiumRateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "PremiumRateValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "ProposalLineItemPremiumStatus"));
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
