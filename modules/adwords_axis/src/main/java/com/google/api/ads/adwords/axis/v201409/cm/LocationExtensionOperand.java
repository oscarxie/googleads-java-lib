/**
 * LocationExtensionOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * This operand specifies information required for location extension
 * targeting.
 */
public class LocationExtensionOperand  extends com.google.api.ads.adwords.axis.v201409.cm.FunctionArgumentOperand  implements java.io.Serializable {
    /* Distance in units specifying the radius around location extensions.
     * Only long and double are supported constant types.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.ConstantOperand radius;

    public LocationExtensionOperand() {
    }

    public LocationExtensionOperand(
           java.lang.String functionArgumentOperandType,
           com.google.api.ads.adwords.axis.v201409.cm.ConstantOperand radius) {
        super(
            functionArgumentOperandType);
        this.radius = radius;
    }


    /**
     * Gets the radius value for this LocationExtensionOperand.
     * 
     * @return radius   * Distance in units specifying the radius around location extensions.
     * Only long and double are supported constant types.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.ConstantOperand getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this LocationExtensionOperand.
     * 
     * @param radius   * Distance in units specifying the radius around location extensions.
     * Only long and double are supported constant types.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setRadius(com.google.api.ads.adwords.axis.v201409.cm.ConstantOperand radius) {
        this.radius = radius;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationExtensionOperand)) return false;
        LocationExtensionOperand other = (LocationExtensionOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius())));
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
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationExtensionOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "LocationExtensionOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "ConstantOperand"));
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
