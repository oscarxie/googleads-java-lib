/**
 * ShoppingSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Setting for shopping campaigns. Defines the universe of products
 * covered by the campaign.
 *             Encapsulates a merchant ID, sales country, and campaign
 * priority.
 */
public class ShoppingSetting  extends com.google.api.ads.adwords.axis.v201409.cm.Setting  implements java.io.Serializable {
    /* ID of the Merchant Center account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Long merchantId;

    /* Sales country of products to include in the campaign.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String salesCountry;

    /* Priority of the campaign. Campaigns with numerically higher
     * priorities take precedence over
     *                     those with lower priorities.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 2, inclusive.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Integer campaignPriority;

    public ShoppingSetting() {
    }

    public ShoppingSetting(
           java.lang.String settingType,
           java.lang.Long merchantId,
           java.lang.String salesCountry,
           java.lang.Integer campaignPriority) {
        super(
            settingType);
        this.merchantId = merchantId;
        this.salesCountry = salesCountry;
        this.campaignPriority = campaignPriority;
    }


    /**
     * Gets the merchantId value for this ShoppingSetting.
     * 
     * @return merchantId   * ID of the Merchant Center account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Long getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ShoppingSetting.
     * 
     * @param merchantId   * ID of the Merchant Center account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMerchantId(java.lang.Long merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the salesCountry value for this ShoppingSetting.
     * 
     * @return salesCountry   * Sales country of products to include in the campaign.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getSalesCountry() {
        return salesCountry;
    }


    /**
     * Sets the salesCountry value for this ShoppingSetting.
     * 
     * @param salesCountry   * Sales country of products to include in the campaign.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setSalesCountry(java.lang.String salesCountry) {
        this.salesCountry = salesCountry;
    }


    /**
     * Gets the campaignPriority value for this ShoppingSetting.
     * 
     * @return campaignPriority   * Priority of the campaign. Campaigns with numerically higher
     * priorities take precedence over
     *                     those with lower priorities.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 2, inclusive.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Integer getCampaignPriority() {
        return campaignPriority;
    }


    /**
     * Sets the campaignPriority value for this ShoppingSetting.
     * 
     * @param campaignPriority   * Priority of the campaign. Campaigns with numerically higher
     * priorities take precedence over
     *                     those with lower priorities.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 2, inclusive.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setCampaignPriority(java.lang.Integer campaignPriority) {
        this.campaignPriority = campaignPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingSetting)) return false;
        ShoppingSetting other = (ShoppingSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.salesCountry==null && other.getSalesCountry()==null) || 
             (this.salesCountry!=null &&
              this.salesCountry.equals(other.getSalesCountry()))) &&
            ((this.campaignPriority==null && other.getCampaignPriority()==null) || 
             (this.campaignPriority!=null &&
              this.campaignPriority.equals(other.getCampaignPriority())));
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
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getSalesCountry() != null) {
            _hashCode += getSalesCountry().hashCode();
        }
        if (getCampaignPriority() != null) {
            _hashCode += getCampaignPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "ShoppingSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "salesCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "campaignPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
