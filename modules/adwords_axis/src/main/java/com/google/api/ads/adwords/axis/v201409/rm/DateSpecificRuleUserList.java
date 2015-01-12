/**
 * DateSpecificRuleUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.rm;


/**
 * Visitors of a page during specific dates. The visiting periods
 * are defined as follows:
 *             <ul>
 *             <li> between {@code startDate} (inclusive) and {@code
 * endDate} (inclusive);
 *             <li> before {@code endDate} (exclusive) with {@code startDate}
 * = 2000-01-01;
 *             <li> after {@code startDate} (exclusive) with {@code endDate}
 * = 2037-12-30.
 *             </ul>
 */
public class DateSpecificRuleUserList  extends com.google.api.ads.adwords.axis.v201409.rm.RuleBasedUserList  implements java.io.Serializable {
    /* Boolean rule that defines visitor of a page.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201409.rm.Rule rule;

    /* Start date of users visit. If set to <code>20000101</code>,
     * then includes
     *                     all users before <code>endDate</code>. The date's
     * format should be YYYYMMDD.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String startDate;

    /* End date of users visit. If set to <code>20371230</code>, then
     * includes
     *                     all users after <code>startDate</code>. The date's
     * format should be YYYYMMDD.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String endDate;

    public DateSpecificRuleUserList() {
    }

    public DateSpecificRuleUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201409.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201409.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201409.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201409.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201409.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201409.rm.UserListType listType,
           java.lang.String userListType,
           com.google.api.ads.adwords.axis.v201409.rm.Rule rule,
           java.lang.String startDate,
           java.lang.String endDate) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            userListType);
        this.rule = rule;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    /**
     * Gets the rule value for this DateSpecificRuleUserList.
     * 
     * @return rule   * Boolean rule that defines visitor of a page.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.rm.Rule getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this DateSpecificRuleUserList.
     * 
     * @param rule   * Boolean rule that defines visitor of a page.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setRule(com.google.api.ads.adwords.axis.v201409.rm.Rule rule) {
        this.rule = rule;
    }


    /**
     * Gets the startDate value for this DateSpecificRuleUserList.
     * 
     * @return startDate   * Start date of users visit. If set to <code>20000101</code>,
     * then includes
     *                     all users before <code>endDate</code>. The date's
     * format should be YYYYMMDD.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DateSpecificRuleUserList.
     * 
     * @param startDate   * Start date of users visit. If set to <code>20000101</code>,
     * then includes
     *                     all users before <code>endDate</code>. The date's
     * format should be YYYYMMDD.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DateSpecificRuleUserList.
     * 
     * @return endDate   * End date of users visit. If set to <code>20371230</code>, then
     * includes
     *                     all users after <code>startDate</code>. The date's
     * format should be YYYYMMDD.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DateSpecificRuleUserList.
     * 
     * @param endDate   * End date of users visit. If set to <code>20371230</code>, then
     * includes
     *                     all users after <code>startDate</code>. The date's
     * format should be YYYYMMDD.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateSpecificRuleUserList)) return false;
        DateSpecificRuleUserList other = (DateSpecificRuleUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateSpecificRuleUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "DateSpecificRuleUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "Rule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201409", "endDate"));
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
