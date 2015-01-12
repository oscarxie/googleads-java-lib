/**
 * IncomeOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * This operand specifies the income bracket a household falls under.
 */
public class IncomeOperand  extends com.google.api.ads.adwords.axis.v201409.cm.FunctionArgumentOperand  implements java.io.Serializable {
    /* Income tier specifying an income bracket that a household falls
     * under. Tier 1 belongs to the
     *                     highest income bracket.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.IncomeTier tier;

    public IncomeOperand() {
    }

    public IncomeOperand(
           java.lang.String functionArgumentOperandType,
           com.google.api.ads.adwords.axis.v201409.cm.IncomeTier tier) {
        super(
            functionArgumentOperandType);
        this.tier = tier;
    }


    /**
     * Gets the tier value for this IncomeOperand.
     * 
     * @return tier   * Income tier specifying an income bracket that a household falls
     * under. Tier 1 belongs to the
     *                     highest income bracket.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.IncomeTier getTier() {
        return tier;
    }


    /**
     * Sets the tier value for this IncomeOperand.
     * 
     * @param tier   * Income tier specifying an income bracket that a household falls
     * under. Tier 1 belongs to the
     *                     highest income bracket.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setTier(com.google.api.ads.adwords.axis.v201409.cm.IncomeTier tier) {
        this.tier = tier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncomeOperand)) return false;
        IncomeOperand other = (IncomeOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tier==null && other.getTier()==null) || 
             (this.tier!=null &&
              this.tier.equals(other.getTier())));
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
        if (getTier() != null) {
            _hashCode += getTier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncomeOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "IncomeOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "tier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "IncomeTier"));
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
