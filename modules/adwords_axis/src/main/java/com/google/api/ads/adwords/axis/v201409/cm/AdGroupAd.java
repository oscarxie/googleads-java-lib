/**
 * AdGroupAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents an ad in an ad group.
 */
public class AdGroupAd  implements java.io.Serializable {
    /* The id of the adgroup containing this ad.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.Ad ad;

    /* Experiment data associated with this {@link AdGroupAd}. It
     * is returned by
     *                 {@link AdGroupAdService#get get()} only if the experimentId
     * is supplied. */
    private com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdExperimentData experimentData;

    /* The status of the ad.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdStatus status;

    /* Approval status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdApprovalStatus approvalStatus;

    /* List of disapproval reasons.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String[] disapprovalReasons;

    /* True if and only if this ad is not serving because it does
     * not meet
     *                 trademark policy.
     *                 This field is only useful when {@link #approvalStatus
     * approvalStatus} is an
     *                 approved status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean trademarkDisapproved;

    /* Labels that are attached to the AdGroupAd. To associate an
     * existing {@link Label} to an
     *                 existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel}
     * with ADD operator. To
     *                 remove an associated {@link Label} from the {@link
     * AdGroupAd}, use
     *                 {@link AdGroupAdService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.Label[] labels;

    /* This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value. */
    private com.google.api.ads.adwords.axis.v201409.cm.String_StringMapEntry[] forwardCompatibilityMap;

    public AdGroupAd() {
    }

    public AdGroupAd(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201409.cm.Ad ad,
           com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdExperimentData experimentData,
           com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdStatus status,
           com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdApprovalStatus approvalStatus,
           java.lang.String[] disapprovalReasons,
           java.lang.Boolean trademarkDisapproved,
           com.google.api.ads.adwords.axis.v201409.cm.Label[] labels,
           com.google.api.ads.adwords.axis.v201409.cm.String_StringMapEntry[] forwardCompatibilityMap) {
           this.adGroupId = adGroupId;
           this.ad = ad;
           this.experimentData = experimentData;
           this.status = status;
           this.approvalStatus = approvalStatus;
           this.disapprovalReasons = disapprovalReasons;
           this.trademarkDisapproved = trademarkDisapproved;
           this.labels = labels;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
    }


    /**
     * Gets the adGroupId value for this AdGroupAd.
     * 
     * @return adGroupId   * The id of the adgroup containing this ad.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupAd.
     * 
     * @param adGroupId   * The id of the adgroup containing this ad.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the ad value for this AdGroupAd.
     * 
     * @return ad   * The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Ad getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this AdGroupAd.
     * 
     * @param ad   * The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAd(com.google.api.ads.adwords.axis.v201409.cm.Ad ad) {
        this.ad = ad;
    }


    /**
     * Gets the experimentData value for this AdGroupAd.
     * 
     * @return experimentData   * Experiment data associated with this {@link AdGroupAd}. It
     * is returned by
     *                 {@link AdGroupAdService#get get()} only if the experimentId
     * is supplied.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdExperimentData getExperimentData() {
        return experimentData;
    }


    /**
     * Sets the experimentData value for this AdGroupAd.
     * 
     * @param experimentData   * Experiment data associated with this {@link AdGroupAd}. It
     * is returned by
     *                 {@link AdGroupAdService#get get()} only if the experimentId
     * is supplied.
     */
    public void setExperimentData(com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdExperimentData experimentData) {
        this.experimentData = experimentData;
    }


    /**
     * Gets the status value for this AdGroupAd.
     * 
     * @return status   * The status of the ad.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroupAd.
     * 
     * @param status   * The status of the ad.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdStatus status) {
        this.status = status;
    }


    /**
     * Gets the approvalStatus value for this AdGroupAd.
     * 
     * @return approvalStatus   * Approval status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this AdGroupAd.
     * 
     * @param approvalStatus   * Approval status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the disapprovalReasons value for this AdGroupAd.
     * 
     * @return disapprovalReasons   * List of disapproval reasons.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this AdGroupAd.
     * 
     * @param disapprovalReasons   * List of disapproval reasons.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDisapprovalReasons(java.lang.String[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public java.lang.String getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, java.lang.String _value) {
        this.disapprovalReasons[i] = _value;
    }


    /**
     * Gets the trademarkDisapproved value for this AdGroupAd.
     * 
     * @return trademarkDisapproved   * True if and only if this ad is not serving because it does
     * not meet
     *                 trademark policy.
     *                 This field is only useful when {@link #approvalStatus
     * approvalStatus} is an
     *                 approved status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getTrademarkDisapproved() {
        return trademarkDisapproved;
    }


    /**
     * Sets the trademarkDisapproved value for this AdGroupAd.
     * 
     * @param trademarkDisapproved   * True if and only if this ad is not serving because it does
     * not meet
     *                 trademark policy.
     *                 This field is only useful when {@link #approvalStatus
     * approvalStatus} is an
     *                 approved status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTrademarkDisapproved(java.lang.Boolean trademarkDisapproved) {
        this.trademarkDisapproved = trademarkDisapproved;
    }


    /**
     * Gets the labels value for this AdGroupAd.
     * 
     * @return labels   * Labels that are attached to the AdGroupAd. To associate an
     * existing {@link Label} to an
     *                 existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel}
     * with ADD operator. To
     *                 remove an associated {@link Label} from the {@link
     * AdGroupAd}, use
     *                 {@link AdGroupAdService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Label[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this AdGroupAd.
     * 
     * @param labels   * Labels that are attached to the AdGroupAd. To associate an
     * existing {@link Label} to an
     *                 existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel}
     * with ADD operator. To
     *                 remove an associated {@link Label} from the {@link
     * AdGroupAd}, use
     *                 {@link AdGroupAdService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setLabels(com.google.api.ads.adwords.axis.v201409.cm.Label[] labels) {
        this.labels = labels;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.Label getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, com.google.api.ads.adwords.axis.v201409.cm.Label _value) {
        this.labels[i] = _value;
    }


    /**
     * Gets the forwardCompatibilityMap value for this AdGroupAd.
     * 
     * @return forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this AdGroupAd.
     * 
     * @param forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201409.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201409.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupAd)) return false;
        AdGroupAd other = (AdGroupAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              this.ad.equals(other.getAd()))) &&
            ((this.experimentData==null && other.getExperimentData()==null) || 
             (this.experimentData!=null &&
              this.experimentData.equals(other.getExperimentData()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons()))) &&
            ((this.trademarkDisapproved==null && other.getTrademarkDisapproved()==null) || 
             (this.trademarkDisapproved!=null &&
              this.trademarkDisapproved.equals(other.getTrademarkDisapproved()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAd() != null) {
            _hashCode += getAd().hashCode();
        }
        if (getExperimentData() != null) {
            _hashCode += getExperimentData().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisapprovalReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrademarkDisapproved() != null) {
            _hashCode += getTrademarkDisapproved().hashCode();
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
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
        new org.apache.axis.description.TypeDesc(AdGroupAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdGroupAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Ad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "experimentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdGroupAdExperimentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdGroupAd.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdGroupAd.ApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trademarkDisapproved");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "trademarkDisapproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "String_StringMapEntry"));
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
