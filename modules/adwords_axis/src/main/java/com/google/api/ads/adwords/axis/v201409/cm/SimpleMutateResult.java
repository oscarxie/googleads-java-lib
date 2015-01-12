/**
 * SimpleMutateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * The results of a simple mutation job.
 */
public class SimpleMutateResult  implements java.io.Serializable {
    /* List of the results, in the same order they were submitted. */
    private com.google.api.ads.adwords.axis.v201409.cm.Operand[] results;

    /* List of errors resulting from the invocation. */
    private com.google.api.ads.adwords.axis.v201409.cm.ApiError[] errors;

    public SimpleMutateResult() {
    }

    public SimpleMutateResult(
           com.google.api.ads.adwords.axis.v201409.cm.Operand[] results,
           com.google.api.ads.adwords.axis.v201409.cm.ApiError[] errors) {
           this.results = results;
           this.errors = errors;
    }


    /**
     * Gets the results value for this SimpleMutateResult.
     * 
     * @return results   * List of the results, in the same order they were submitted.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Operand[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this SimpleMutateResult.
     * 
     * @param results   * List of the results, in the same order they were submitted.
     */
    public void setResults(com.google.api.ads.adwords.axis.v201409.cm.Operand[] results) {
        this.results = results;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.Operand getResults(int i) {
        return this.results[i];
    }

    public void setResults(int i, com.google.api.ads.adwords.axis.v201409.cm.Operand _value) {
        this.results[i] = _value;
    }


    /**
     * Gets the errors value for this SimpleMutateResult.
     * 
     * @return errors   * List of errors resulting from the invocation.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.ApiError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this SimpleMutateResult.
     * 
     * @param errors   * List of errors resulting from the invocation.
     */
    public void setErrors(com.google.api.ads.adwords.axis.v201409.cm.ApiError[] errors) {
        this.errors = errors;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.ApiError getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.google.api.ads.adwords.axis.v201409.cm.ApiError _value) {
        this.errors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleMutateResult)) return false;
        SimpleMutateResult other = (SimpleMutateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
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
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
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
        new org.apache.axis.description.TypeDesc(SimpleMutateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "SimpleMutateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Operand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "ApiError"));
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
