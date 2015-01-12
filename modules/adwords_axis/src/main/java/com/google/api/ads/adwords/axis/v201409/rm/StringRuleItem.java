/**
 * StringRuleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.rm;


/**
 * An atomic rule fragment composing of string operation.
 */
public class StringRuleItem  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.rm.StringKey key;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.rm.StringRuleItemStringOperator op;

    /* The right hand side of the string rule item. For URL/Referrer
     * URL,
     *                 <code>value</code> can not contain illegal URL chars
     * such as: <code>"()'\"\t"</code>.
     *                 <span class="constraint MatchesRegex">String value
     * can not contain newline (
     * ) or both single quote and double quote. This is checked by the regular
     * expression '[^
     * ']*|[^
     * "]*'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String value;

    public StringRuleItem() {
    }

    public StringRuleItem(
           com.google.api.ads.adwords.axis.v201409.rm.StringKey key,
           com.google.api.ads.adwords.axis.v201409.rm.StringRuleItemStringOperator op,
           java.lang.String value) {
           this.key = key;
           this.op = op;
           this.value = value;
    }


    /**
     * Gets the key value for this StringRuleItem.
     * 
     * @return key   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.rm.StringKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this StringRuleItem.
     * 
     * @param key   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setKey(com.google.api.ads.adwords.axis.v201409.rm.StringKey key) {
        this.key = key;
    }


    /**
     * Gets the op value for this StringRuleItem.
     * 
     * @return op   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.rm.StringRuleItemStringOperator getOp() {
        return op;
    }


    /**
     * Sets the op value for this StringRuleItem.
     * 
     * @param op   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setOp(com.google.api.ads.adwords.axis.v201409.rm.StringRuleItemStringOperator op) {
        this.op = op;
    }


    /**
     * Gets the value value for this StringRuleItem.
     * 
     * @return value   * The right hand side of the string rule item. For URL/Referrer
     * URL,
     *                 <code>value</code> can not contain illegal URL chars
     * such as: <code>"()'\"\t"</code>.
     *                 <span class="constraint MatchesRegex">String value
     * can not contain newline (
     * ) or both single quote and double quote. This is checked by the regular
     * expression '[^
     * ']*|[^
     * "]*'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this StringRuleItem.
     * 
     * @param value   * The right hand side of the string rule item. For URL/Referrer
     * URL,
     *                 <code>value</code> can not contain illegal URL chars
     * such as: <code>"()'\"\t"</code>.
     *                 <span class="constraint MatchesRegex">String value
     * can not contain newline (
     * ) or both single quote and double quote. This is checked by the regular
     * expression '[^
     * ']*|[^
     * "]*'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringRuleItem)) return false;
        StringRuleItem other = (StringRuleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.op==null && other.getOp()==null) || 
             (this.op!=null &&
              this.op.equals(other.getOp()))) &&
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
        int _hashCode = 1;
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getOp() != null) {
            _hashCode += getOp().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringRuleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "StringRuleItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "StringKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "op"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "StringRuleItem.StringOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
