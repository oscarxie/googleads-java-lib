/**
 * TargetingSettingDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Specifies if criteria of this type group should be used to restrict
 * targeting, or if ads can serve anywhere and criteria are only used
 * in
 *             determining the bid.
 */
public class TargetingSettingDetail  implements java.io.Serializable {
    /* The criterion type group that these settings apply to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.CriterionTypeGroup criterionTypeGroup;

    /* If true, do not use criteria of this type to restrict targeting.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.Boolean targetAll;

    public TargetingSettingDetail() {
    }

    public TargetingSettingDetail(
           com.google.api.ads.adwords.axis.v201409.cm.CriterionTypeGroup criterionTypeGroup,
           java.lang.Boolean targetAll) {
           this.criterionTypeGroup = criterionTypeGroup;
           this.targetAll = targetAll;
    }


    /**
     * Gets the criterionTypeGroup value for this TargetingSettingDetail.
     * 
     * @return criterionTypeGroup   * The criterion type group that these settings apply to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CriterionTypeGroup getCriterionTypeGroup() {
        return criterionTypeGroup;
    }


    /**
     * Sets the criterionTypeGroup value for this TargetingSettingDetail.
     * 
     * @param criterionTypeGroup   * The criterion type group that these settings apply to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterionTypeGroup(com.google.api.ads.adwords.axis.v201409.cm.CriterionTypeGroup criterionTypeGroup) {
        this.criterionTypeGroup = criterionTypeGroup;
    }


    /**
     * Gets the targetAll value for this TargetingSettingDetail.
     * 
     * @return targetAll   * If true, do not use criteria of this type to restrict targeting.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.Boolean getTargetAll() {
        return targetAll;
    }


    /**
     * Sets the targetAll value for this TargetingSettingDetail.
     * 
     * @param targetAll   * If true, do not use criteria of this type to restrict targeting.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setTargetAll(java.lang.Boolean targetAll) {
        this.targetAll = targetAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingSettingDetail)) return false;
        TargetingSettingDetail other = (TargetingSettingDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criterionTypeGroup==null && other.getCriterionTypeGroup()==null) || 
             (this.criterionTypeGroup!=null &&
              this.criterionTypeGroup.equals(other.getCriterionTypeGroup()))) &&
            ((this.targetAll==null && other.getTargetAll()==null) || 
             (this.targetAll!=null &&
              this.targetAll.equals(other.getTargetAll())));
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
        if (getCriterionTypeGroup() != null) {
            _hashCode += getCriterionTypeGroup().hashCode();
        }
        if (getTargetAll() != null) {
            _hashCode += getTargetAll().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingSettingDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "TargetingSettingDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionTypeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "criterionTypeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CriterionTypeGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "targetAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
