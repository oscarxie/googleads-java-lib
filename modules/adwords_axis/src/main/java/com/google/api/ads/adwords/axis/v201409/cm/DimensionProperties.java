/**
 * DimensionProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Top level class for Dimensions.
 */
public abstract class DimensionProperties  extends com.google.api.ads.adwords.axis.v201409.cm.DataEntry  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201409.cm.LevelOfDetail levelOfDetail;

    public DimensionProperties() {
    }

    public DimensionProperties(
           java.lang.String dataEntryType,
           com.google.api.ads.adwords.axis.v201409.cm.LevelOfDetail levelOfDetail) {
        super(
            dataEntryType);
        this.levelOfDetail = levelOfDetail;
    }


    /**
     * Gets the levelOfDetail value for this DimensionProperties.
     * 
     * @return levelOfDetail
     */
    public com.google.api.ads.adwords.axis.v201409.cm.LevelOfDetail getLevelOfDetail() {
        return levelOfDetail;
    }


    /**
     * Sets the levelOfDetail value for this DimensionProperties.
     * 
     * @param levelOfDetail
     */
    public void setLevelOfDetail(com.google.api.ads.adwords.axis.v201409.cm.LevelOfDetail levelOfDetail) {
        this.levelOfDetail = levelOfDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DimensionProperties)) return false;
        DimensionProperties other = (DimensionProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.levelOfDetail==null && other.getLevelOfDetail()==null) || 
             (this.levelOfDetail!=null &&
              this.levelOfDetail.equals(other.getLevelOfDetail())));
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
        if (getLevelOfDetail() != null) {
            _hashCode += getLevelOfDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DimensionProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "DimensionProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levelOfDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "levelOfDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "LevelOfDetail"));
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
