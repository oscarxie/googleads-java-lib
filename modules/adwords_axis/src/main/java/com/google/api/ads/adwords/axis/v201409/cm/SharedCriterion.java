/**
 * SharedCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public class SharedCriterion  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long sharedSetId;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.Criterion criterion;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "Negative".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.Boolean negative;

    public SharedCriterion() {
    }

    public SharedCriterion(
           java.lang.Long sharedSetId,
           com.google.api.ads.adwords.axis.v201409.cm.Criterion criterion,
           java.lang.Boolean negative) {
           this.sharedSetId = sharedSetId;
           this.criterion = criterion;
           this.negative = negative;
    }


    /**
     * Gets the sharedSetId value for this SharedCriterion.
     * 
     * @return sharedSetId   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getSharedSetId() {
        return sharedSetId;
    }


    /**
     * Sets the sharedSetId value for this SharedCriterion.
     * 
     * @param sharedSetId   * <span class="constraint Selectable">This field can be selected
     * using the value "SharedSetId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setSharedSetId(java.lang.Long sharedSetId) {
        this.sharedSetId = sharedSetId;
    }


    /**
     * Gets the criterion value for this SharedCriterion.
     * 
     * @return criterion   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this SharedCriterion.
     * 
     * @param criterion   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201409.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the negative value for this SharedCriterion.
     * 
     * @return negative   * <span class="constraint Selectable">This field can be selected
     * using the value "Negative".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.Boolean getNegative() {
        return negative;
    }


    /**
     * Sets the negative value for this SharedCriterion.
     * 
     * @param negative   * <span class="constraint Selectable">This field can be selected
     * using the value "Negative".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setNegative(java.lang.Boolean negative) {
        this.negative = negative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedCriterion)) return false;
        SharedCriterion other = (SharedCriterion) obj;
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
            ((this.criterion==null && other.getCriterion()==null) || 
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.negative==null && other.getNegative()==null) || 
             (this.negative!=null &&
              this.negative.equals(other.getNegative())));
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
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getNegative() != null) {
            _hashCode += getNegative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "SharedCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "sharedSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "negative"));
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
