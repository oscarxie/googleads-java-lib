/**
 * ThirdPartyCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * A {@code Creative} that is served by a 3rd-party vendor.
 */
public class ThirdPartyCreative  extends com.google.api.ads.dfp.axis.v201411.Creative  implements java.io.Serializable {
    /* The HTML snippet that this creative delivers. This attribute
     * is required. */
    private java.lang.String snippet;

    /* The HTML snippet that this creative delivers with macros expanded.
     * This
     *                     attribute is read-only and is set by Google. */
    private java.lang.String expandedSnippet;

    /* The SSL compatibility scan result for this creative. */
    private com.google.api.ads.dfp.axis.v201411.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative. */
    private com.google.api.ads.dfp.axis.v201411.SslManualOverride sslManualOverride;

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201411.LockedOrientation lockedOrientation;

    public ThirdPartyCreative() {
    }

    public ThirdPartyCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201411.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201411.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201411.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201411.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String snippet,
           java.lang.String expandedSnippet,
           com.google.api.ads.dfp.axis.v201411.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201411.SslManualOverride sslManualOverride,
           com.google.api.ads.dfp.axis.v201411.LockedOrientation lockedOrientation) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType);
        this.snippet = snippet;
        this.expandedSnippet = expandedSnippet;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the snippet value for this ThirdPartyCreative.
     * 
     * @return snippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this ThirdPartyCreative.
     * 
     * @param snippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the expandedSnippet value for this ThirdPartyCreative.
     * 
     * @return expandedSnippet   * The HTML snippet that this creative delivers with macros expanded.
     * This
     *                     attribute is read-only and is set by Google.
     */
    public java.lang.String getExpandedSnippet() {
        return expandedSnippet;
    }


    /**
     * Sets the expandedSnippet value for this ThirdPartyCreative.
     * 
     * @param expandedSnippet   * The HTML snippet that this creative delivers with macros expanded.
     * This
     *                     attribute is read-only and is set by Google.
     */
    public void setExpandedSnippet(java.lang.String expandedSnippet) {
        this.expandedSnippet = expandedSnippet;
    }


    /**
     * Gets the sslScanResult value for this ThirdPartyCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result for this creative.
     */
    public com.google.api.ads.dfp.axis.v201411.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this ThirdPartyCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result for this creative.
     */
    public void setSslScanResult(com.google.api.ads.dfp.axis.v201411.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this ThirdPartyCreative.
     * 
     * @return sslManualOverride   * The manual override for the SSL compatibility of this creative.
     */
    public com.google.api.ads.dfp.axis.v201411.SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }


    /**
     * Sets the sslManualOverride value for this ThirdPartyCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201411.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }


    /**
     * Gets the lockedOrientation value for this ThirdPartyCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201411.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this ThirdPartyCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201411.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyCreative)) return false;
        ThirdPartyCreative other = (ThirdPartyCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.expandedSnippet==null && other.getExpandedSnippet()==null) || 
             (this.expandedSnippet!=null &&
              this.expandedSnippet.equals(other.getExpandedSnippet()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getExpandedSnippet() != null) {
            _hashCode += getExpandedSnippet().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "ThirdPartyCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "expandedSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslScanResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "sslScanResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "SslScanResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslManualOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "sslManualOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "SslManualOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "LockedOrientation"));
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
