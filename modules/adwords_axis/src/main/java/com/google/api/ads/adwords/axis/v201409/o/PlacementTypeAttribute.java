/**
 * PlacementTypeAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.o;


/**
 * {@link Attribute} type that contains a {@link PlacementType} value.
 */
public class PlacementTypeAttribute  extends com.google.api.ads.adwords.axis.v201409.o.Attribute  implements java.io.Serializable {
    /* {@link PlacementType} value contained by this {@link Attribute}. */
    private com.google.api.ads.adwords.axis.v201409.o.SiteConstantsPlacementType value;

    public PlacementTypeAttribute() {
    }

    public PlacementTypeAttribute(
           java.lang.String attributeType,
           com.google.api.ads.adwords.axis.v201409.o.SiteConstantsPlacementType value) {
        super(
            attributeType);
        this.value = value;
    }


    /**
     * Gets the value value for this PlacementTypeAttribute.
     * 
     * @return value   * {@link PlacementType} value contained by this {@link Attribute}.
     */
    public com.google.api.ads.adwords.axis.v201409.o.SiteConstantsPlacementType getValue() {
        return value;
    }


    /**
     * Sets the value value for this PlacementTypeAttribute.
     * 
     * @param value   * {@link PlacementType} value contained by this {@link Attribute}.
     */
    public void setValue(com.google.api.ads.adwords.axis.v201409.o.SiteConstantsPlacementType value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementTypeAttribute)) return false;
        PlacementTypeAttribute other = (PlacementTypeAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementTypeAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "PlacementTypeAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "SiteConstants.PlacementType"));
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
