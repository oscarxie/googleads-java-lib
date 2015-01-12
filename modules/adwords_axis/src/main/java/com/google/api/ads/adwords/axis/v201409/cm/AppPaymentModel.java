/**
 * AppPaymentModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents a criterion for targeting paid apps.
 *             
 *             <p>Possible IDs: {@code 30} ({@code APP_PAYMENT_MODEL_PAID}).</p>
 * <p>A criterion of this type can only be created using an ID.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class AppPaymentModel  extends com.google.api.ads.adwords.axis.v201409.cm.Criterion  implements java.io.Serializable {
    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.AppPaymentModelAppPaymentModelType appPaymentModelType;

    public AppPaymentModel() {
    }

    public AppPaymentModel(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201409.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201409.cm.AppPaymentModelAppPaymentModelType appPaymentModelType) {
        super(
            id,
            type,
            criterionType);
        this.appPaymentModelType = appPaymentModelType;
    }


    /**
     * Gets the appPaymentModelType value for this AppPaymentModel.
     * 
     * @return appPaymentModelType   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AppPaymentModelAppPaymentModelType getAppPaymentModelType() {
        return appPaymentModelType;
    }


    /**
     * Sets the appPaymentModelType value for this AppPaymentModel.
     * 
     * @param appPaymentModelType   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setAppPaymentModelType(com.google.api.ads.adwords.axis.v201409.cm.AppPaymentModelAppPaymentModelType appPaymentModelType) {
        this.appPaymentModelType = appPaymentModelType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppPaymentModel)) return false;
        AppPaymentModel other = (AppPaymentModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appPaymentModelType==null && other.getAppPaymentModelType()==null) || 
             (this.appPaymentModelType!=null &&
              this.appPaymentModelType.equals(other.getAppPaymentModelType())));
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
        if (getAppPaymentModelType() != null) {
            _hashCode += getAppPaymentModelType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppPaymentModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AppPaymentModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPaymentModelType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "appPaymentModelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AppPaymentModel.AppPaymentModelType"));
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
