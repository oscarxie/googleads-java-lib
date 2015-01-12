/**
 * CustomCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * A {@code Creative} that contains an arbitrary HTML snippet and
 * file assets.
 */
public class CustomCreative  extends com.google.api.ads.dfp.axis.v201411.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The HTML snippet that this creative delivers. This attribute
     * is required. */
    private java.lang.String htmlSnippet;

    /* A list of file assets that are associated with this creative,
     * and can be
     *                     referenced in the snippet. */
    private com.google.api.ads.dfp.axis.v201411.CustomCreativeAsset[] customCreativeAssets;

    /* {@code true} if this custom creative is interstitial. An interstitial
     * creative will not consider an impression served until it is fully
     * rendered
     *                     in the browser. */
    private java.lang.Boolean isInterstitial;

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201411.LockedOrientation lockedOrientation;

    /* The SSL compatibility scan result of this creative. */
    private com.google.api.ads.dfp.axis.v201411.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative. */
    private com.google.api.ads.dfp.axis.v201411.SslManualOverride sslManualOverride;

    public CustomCreative() {
    }

    public CustomCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201411.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201411.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201411.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201411.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201411.DestinationUrlType destinationUrlType,
           java.lang.String htmlSnippet,
           com.google.api.ads.dfp.axis.v201411.CustomCreativeAsset[] customCreativeAssets,
           java.lang.Boolean isInterstitial,
           com.google.api.ads.dfp.axis.v201411.LockedOrientation lockedOrientation,
           com.google.api.ads.dfp.axis.v201411.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201411.SslManualOverride sslManualOverride) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            destinationUrl,
            destinationUrlType);
        this.htmlSnippet = htmlSnippet;
        this.customCreativeAssets = customCreativeAssets;
        this.isInterstitial = isInterstitial;
        this.lockedOrientation = lockedOrientation;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
    }


    /**
     * Gets the htmlSnippet value for this CustomCreative.
     * 
     * @return htmlSnippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public java.lang.String getHtmlSnippet() {
        return htmlSnippet;
    }


    /**
     * Sets the htmlSnippet value for this CustomCreative.
     * 
     * @param htmlSnippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public void setHtmlSnippet(java.lang.String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
    }


    /**
     * Gets the customCreativeAssets value for this CustomCreative.
     * 
     * @return customCreativeAssets   * A list of file assets that are associated with this creative,
     * and can be
     *                     referenced in the snippet.
     */
    public com.google.api.ads.dfp.axis.v201411.CustomCreativeAsset[] getCustomCreativeAssets() {
        return customCreativeAssets;
    }


    /**
     * Sets the customCreativeAssets value for this CustomCreative.
     * 
     * @param customCreativeAssets   * A list of file assets that are associated with this creative,
     * and can be
     *                     referenced in the snippet.
     */
    public void setCustomCreativeAssets(com.google.api.ads.dfp.axis.v201411.CustomCreativeAsset[] customCreativeAssets) {
        this.customCreativeAssets = customCreativeAssets;
    }

    public com.google.api.ads.dfp.axis.v201411.CustomCreativeAsset getCustomCreativeAssets(int i) {
        return this.customCreativeAssets[i];
    }

    public void setCustomCreativeAssets(int i, com.google.api.ads.dfp.axis.v201411.CustomCreativeAsset _value) {
        this.customCreativeAssets[i] = _value;
    }


    /**
     * Gets the isInterstitial value for this CustomCreative.
     * 
     * @return isInterstitial   * {@code true} if this custom creative is interstitial. An interstitial
     * creative will not consider an impression served until it is fully
     * rendered
     *                     in the browser.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this CustomCreative.
     * 
     * @param isInterstitial   * {@code true} if this custom creative is interstitial. An interstitial
     * creative will not consider an impression served until it is fully
     * rendered
     *                     in the browser.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the lockedOrientation value for this CustomCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201411.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this CustomCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201411.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the sslScanResult value for this CustomCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result of this creative.
     */
    public com.google.api.ads.dfp.axis.v201411.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this CustomCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result of this creative.
     */
    public void setSslScanResult(com.google.api.ads.dfp.axis.v201411.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this CustomCreative.
     * 
     * @return sslManualOverride   * The manual override for the SSL compatibility of this creative.
     */
    public com.google.api.ads.dfp.axis.v201411.SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }


    /**
     * Sets the sslManualOverride value for this CustomCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201411.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCreative)) return false;
        CustomCreative other = (CustomCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.htmlSnippet==null && other.getHtmlSnippet()==null) || 
             (this.htmlSnippet!=null &&
              this.htmlSnippet.equals(other.getHtmlSnippet()))) &&
            ((this.customCreativeAssets==null && other.getCustomCreativeAssets()==null) || 
             (this.customCreativeAssets!=null &&
              java.util.Arrays.equals(this.customCreativeAssets, other.getCustomCreativeAssets()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride())));
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
        if (getHtmlSnippet() != null) {
            _hashCode += getHtmlSnippet().hashCode();
        }
        if (getCustomCreativeAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomCreativeAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomCreativeAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "CustomCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "htmlSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCreativeAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "customCreativeAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "CustomCreativeAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
