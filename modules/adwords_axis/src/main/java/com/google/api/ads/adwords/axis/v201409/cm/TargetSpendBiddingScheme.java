/**
 * TargetSpendBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Target Spend bidding scheme, in which Google automatically places
 * bids for the user based on their daily/monthly budget or optional
 *             spend target.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class TargetSpendBiddingScheme  extends com.google.api.ads.adwords.axis.v201409.cm.BiddingScheme  implements java.io.Serializable {
    /* The largest max CPC bid that can be set by the TargetSpend
     * bidder.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetSpendBidCeiling".</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.Money bidCeiling;

    /* A spend target under which to maximize clicks. The TargetSpend
     * bidder will
     *                     attempt to spend the smaller of this value or
     * the natural throttling spend
     *                     amount. If not specified, the budget is used as
     * the spend target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetSpendSpendTarget".</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.Money spendTarget;

    public TargetSpendBiddingScheme() {
    }

    public TargetSpendBiddingScheme(
           java.lang.String biddingSchemeType,
           com.google.api.ads.adwords.axis.v201409.cm.Money bidCeiling,
           com.google.api.ads.adwords.axis.v201409.cm.Money spendTarget) {
        super(
            biddingSchemeType);
        this.bidCeiling = bidCeiling;
        this.spendTarget = spendTarget;
    }


    /**
     * Gets the bidCeiling value for this TargetSpendBiddingScheme.
     * 
     * @return bidCeiling   * The largest max CPC bid that can be set by the TargetSpend
     * bidder.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetSpendBidCeiling".</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Money getBidCeiling() {
        return bidCeiling;
    }


    /**
     * Sets the bidCeiling value for this TargetSpendBiddingScheme.
     * 
     * @param bidCeiling   * The largest max CPC bid that can be set by the TargetSpend
     * bidder.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetSpendBidCeiling".</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setBidCeiling(com.google.api.ads.adwords.axis.v201409.cm.Money bidCeiling) {
        this.bidCeiling = bidCeiling;
    }


    /**
     * Gets the spendTarget value for this TargetSpendBiddingScheme.
     * 
     * @return spendTarget   * A spend target under which to maximize clicks. The TargetSpend
     * bidder will
     *                     attempt to spend the smaller of this value or
     * the natural throttling spend
     *                     amount. If not specified, the budget is used as
     * the spend target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetSpendSpendTarget".</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Money getSpendTarget() {
        return spendTarget;
    }


    /**
     * Sets the spendTarget value for this TargetSpendBiddingScheme.
     * 
     * @param spendTarget   * A spend target under which to maximize clicks. The TargetSpend
     * bidder will
     *                     attempt to spend the smaller of this value or
     * the natural throttling spend
     *                     amount. If not specified, the budget is used as
     * the spend target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetSpendSpendTarget".</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setSpendTarget(com.google.api.ads.adwords.axis.v201409.cm.Money spendTarget) {
        this.spendTarget = spendTarget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetSpendBiddingScheme)) return false;
        TargetSpendBiddingScheme other = (TargetSpendBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bidCeiling==null && other.getBidCeiling()==null) || 
             (this.bidCeiling!=null &&
              this.bidCeiling.equals(other.getBidCeiling()))) &&
            ((this.spendTarget==null && other.getSpendTarget()==null) || 
             (this.spendTarget!=null &&
              this.spendTarget.equals(other.getSpendTarget())));
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
        if (getBidCeiling() != null) {
            _hashCode += getBidCeiling().hashCode();
        }
        if (getSpendTarget() != null) {
            _hashCode += getSpendTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetSpendBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "TargetSpendBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidCeiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "bidCeiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "spendTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Money"));
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
