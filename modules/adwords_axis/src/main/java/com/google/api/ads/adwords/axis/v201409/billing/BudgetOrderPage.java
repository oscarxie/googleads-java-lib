/**
 * BudgetOrderPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.billing;


/**
 * A page of {@link BudgetOrder}s from {@link BudgetOrderService#get}
 * method.
 */
public class BudgetOrderPage  extends com.google.api.ads.adwords.axis.v201409.cm.Page  implements java.io.Serializable {
    /* The result entries in this page. */
    private com.google.api.ads.adwords.axis.v201409.billing.BudgetOrder[] entries;

    public BudgetOrderPage() {
    }

    public BudgetOrderPage(
           java.lang.Integer totalNumEntries,
           java.lang.String pageType,
           com.google.api.ads.adwords.axis.v201409.billing.BudgetOrder[] entries) {
        super(
            totalNumEntries,
            pageType);
        this.entries = entries;
    }


    /**
     * Gets the entries value for this BudgetOrderPage.
     * 
     * @return entries   * The result entries in this page.
     */
    public com.google.api.ads.adwords.axis.v201409.billing.BudgetOrder[] getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this BudgetOrderPage.
     * 
     * @param entries   * The result entries in this page.
     */
    public void setEntries(com.google.api.ads.adwords.axis.v201409.billing.BudgetOrder[] entries) {
        this.entries = entries;
    }

    public com.google.api.ads.adwords.axis.v201409.billing.BudgetOrder getEntries(int i) {
        return this.entries[i];
    }

    public void setEntries(int i, com.google.api.ads.adwords.axis.v201409.billing.BudgetOrder _value) {
        this.entries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetOrderPage)) return false;
        BudgetOrderPage other = (BudgetOrderPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entries==null && other.getEntries()==null) || 
             (this.entries!=null &&
              java.util.Arrays.equals(this.entries, other.getEntries())));
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
        if (getEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetOrderPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201409", "BudgetOrderPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201409", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201409", "BudgetOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
