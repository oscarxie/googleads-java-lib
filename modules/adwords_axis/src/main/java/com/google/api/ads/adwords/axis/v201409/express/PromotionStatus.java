/**
 * PromotionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.express;

public class PromotionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PromotionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DRAFT = "DRAFT";
    public static final java.lang.String _ENABLED = "ENABLED";
    public static final java.lang.String _PAUSED = "PAUSED";
    public static final java.lang.String _REMOVED = "REMOVED";
    public static final java.lang.String _UPGRADED_TO_ADWORDS = "UPGRADED_TO_ADWORDS";
    public static final PromotionStatus DRAFT = new PromotionStatus(_DRAFT);
    public static final PromotionStatus ENABLED = new PromotionStatus(_ENABLED);
    public static final PromotionStatus PAUSED = new PromotionStatus(_PAUSED);
    public static final PromotionStatus REMOVED = new PromotionStatus(_REMOVED);
    public static final PromotionStatus UPGRADED_TO_ADWORDS = new PromotionStatus(_UPGRADED_TO_ADWORDS);
    public java.lang.String getValue() { return _value_;}
    public static PromotionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PromotionStatus enumeration = (PromotionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PromotionStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201409", "Promotion.Status"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
