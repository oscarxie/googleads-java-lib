/**
 * CampaignChangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.ch;


/**
 * Holds information about a changed campaign and any ad groups under
 * that have changed.
 */
public class CampaignChangeData  implements java.io.Serializable {
    /* The campaign ID. */
    private java.lang.Long campaignId;

    /* Whether or not the fields of this campaign have changed.  Changes
     * to
     *                 campaign level criteria and ad extensions are enumerated
     * in their
     *                 respective lists and will not be reflected in this
     * status. */
    private com.google.api.ads.adwords.axis.v201409.ch.ChangeStatus campaignChangeStatus;

    /* A list of change information for all changed adgroups belonging
     * to the campaign. */
    private com.google.api.ads.adwords.axis.v201409.ch.AdGroupChangeData[] changedAdGroups;

    /* A list of criteria IDs that have been added as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService. */
    private long[] addedCampaignCriteria;

    /* A list of criteria IDs that have been deleted as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService. */
    private long[] removedCampaignCriteria;

    /* A list of ad extension IDs that have been added to the campaign. */
    private long[] addedAdExtensions;

    /* A list of ad extension IDs that have been removed from the
     * campaign. */
    private long[] removedAdExtensions;

    /* A list of feed IDs for CampaignFeeds that have been changed
     * in this campaign.
     *                 If a CampaignFeed is deleted after a modification,
     * it will not be included
     *                 in this list. */
    private long[] changedFeeds;

    /* A list of feed IDs for CampaignFeeds that have been removed
     * from the
     *                 campaign. */
    private long[] removedFeeds;

    /* Whether there have been campaign targeting changes. */
    private java.lang.Boolean campaignTargetingChanged;

    public CampaignChangeData() {
    }

    public CampaignChangeData(
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201409.ch.ChangeStatus campaignChangeStatus,
           com.google.api.ads.adwords.axis.v201409.ch.AdGroupChangeData[] changedAdGroups,
           long[] addedCampaignCriteria,
           long[] removedCampaignCriteria,
           long[] addedAdExtensions,
           long[] removedAdExtensions,
           long[] changedFeeds,
           long[] removedFeeds,
           java.lang.Boolean campaignTargetingChanged) {
           this.campaignId = campaignId;
           this.campaignChangeStatus = campaignChangeStatus;
           this.changedAdGroups = changedAdGroups;
           this.addedCampaignCriteria = addedCampaignCriteria;
           this.removedCampaignCriteria = removedCampaignCriteria;
           this.addedAdExtensions = addedAdExtensions;
           this.removedAdExtensions = removedAdExtensions;
           this.changedFeeds = changedFeeds;
           this.removedFeeds = removedFeeds;
           this.campaignTargetingChanged = campaignTargetingChanged;
    }


    /**
     * Gets the campaignId value for this CampaignChangeData.
     * 
     * @return campaignId   * The campaign ID.
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignChangeData.
     * 
     * @param campaignId   * The campaign ID.
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignChangeStatus value for this CampaignChangeData.
     * 
     * @return campaignChangeStatus   * Whether or not the fields of this campaign have changed.  Changes
     * to
     *                 campaign level criteria and ad extensions are enumerated
     * in their
     *                 respective lists and will not be reflected in this
     * status.
     */
    public com.google.api.ads.adwords.axis.v201409.ch.ChangeStatus getCampaignChangeStatus() {
        return campaignChangeStatus;
    }


    /**
     * Sets the campaignChangeStatus value for this CampaignChangeData.
     * 
     * @param campaignChangeStatus   * Whether or not the fields of this campaign have changed.  Changes
     * to
     *                 campaign level criteria and ad extensions are enumerated
     * in their
     *                 respective lists and will not be reflected in this
     * status.
     */
    public void setCampaignChangeStatus(com.google.api.ads.adwords.axis.v201409.ch.ChangeStatus campaignChangeStatus) {
        this.campaignChangeStatus = campaignChangeStatus;
    }


    /**
     * Gets the changedAdGroups value for this CampaignChangeData.
     * 
     * @return changedAdGroups   * A list of change information for all changed adgroups belonging
     * to the campaign.
     */
    public com.google.api.ads.adwords.axis.v201409.ch.AdGroupChangeData[] getChangedAdGroups() {
        return changedAdGroups;
    }


    /**
     * Sets the changedAdGroups value for this CampaignChangeData.
     * 
     * @param changedAdGroups   * A list of change information for all changed adgroups belonging
     * to the campaign.
     */
    public void setChangedAdGroups(com.google.api.ads.adwords.axis.v201409.ch.AdGroupChangeData[] changedAdGroups) {
        this.changedAdGroups = changedAdGroups;
    }

    public com.google.api.ads.adwords.axis.v201409.ch.AdGroupChangeData getChangedAdGroups(int i) {
        return this.changedAdGroups[i];
    }

    public void setChangedAdGroups(int i, com.google.api.ads.adwords.axis.v201409.ch.AdGroupChangeData _value) {
        this.changedAdGroups[i] = _value;
    }


    /**
     * Gets the addedCampaignCriteria value for this CampaignChangeData.
     * 
     * @return addedCampaignCriteria   * A list of criteria IDs that have been added as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public long[] getAddedCampaignCriteria() {
        return addedCampaignCriteria;
    }


    /**
     * Sets the addedCampaignCriteria value for this CampaignChangeData.
     * 
     * @param addedCampaignCriteria   * A list of criteria IDs that have been added as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public void setAddedCampaignCriteria(long[] addedCampaignCriteria) {
        this.addedCampaignCriteria = addedCampaignCriteria;
    }

    public long getAddedCampaignCriteria(int i) {
        return this.addedCampaignCriteria[i];
    }

    public void setAddedCampaignCriteria(int i, long _value) {
        this.addedCampaignCriteria[i] = _value;
    }


    /**
     * Gets the removedCampaignCriteria value for this CampaignChangeData.
     * 
     * @return removedCampaignCriteria   * A list of criteria IDs that have been deleted as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public long[] getRemovedCampaignCriteria() {
        return removedCampaignCriteria;
    }


    /**
     * Sets the removedCampaignCriteria value for this CampaignChangeData.
     * 
     * @param removedCampaignCriteria   * A list of criteria IDs that have been deleted as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public void setRemovedCampaignCriteria(long[] removedCampaignCriteria) {
        this.removedCampaignCriteria = removedCampaignCriteria;
    }

    public long getRemovedCampaignCriteria(int i) {
        return this.removedCampaignCriteria[i];
    }

    public void setRemovedCampaignCriteria(int i, long _value) {
        this.removedCampaignCriteria[i] = _value;
    }


    /**
     * Gets the addedAdExtensions value for this CampaignChangeData.
     * 
     * @return addedAdExtensions   * A list of ad extension IDs that have been added to the campaign.
     */
    public long[] getAddedAdExtensions() {
        return addedAdExtensions;
    }


    /**
     * Sets the addedAdExtensions value for this CampaignChangeData.
     * 
     * @param addedAdExtensions   * A list of ad extension IDs that have been added to the campaign.
     */
    public void setAddedAdExtensions(long[] addedAdExtensions) {
        this.addedAdExtensions = addedAdExtensions;
    }

    public long getAddedAdExtensions(int i) {
        return this.addedAdExtensions[i];
    }

    public void setAddedAdExtensions(int i, long _value) {
        this.addedAdExtensions[i] = _value;
    }


    /**
     * Gets the removedAdExtensions value for this CampaignChangeData.
     * 
     * @return removedAdExtensions   * A list of ad extension IDs that have been removed from the
     * campaign.
     */
    public long[] getRemovedAdExtensions() {
        return removedAdExtensions;
    }


    /**
     * Sets the removedAdExtensions value for this CampaignChangeData.
     * 
     * @param removedAdExtensions   * A list of ad extension IDs that have been removed from the
     * campaign.
     */
    public void setRemovedAdExtensions(long[] removedAdExtensions) {
        this.removedAdExtensions = removedAdExtensions;
    }

    public long getRemovedAdExtensions(int i) {
        return this.removedAdExtensions[i];
    }

    public void setRemovedAdExtensions(int i, long _value) {
        this.removedAdExtensions[i] = _value;
    }


    /**
     * Gets the changedFeeds value for this CampaignChangeData.
     * 
     * @return changedFeeds   * A list of feed IDs for CampaignFeeds that have been changed
     * in this campaign.
     *                 If a CampaignFeed is deleted after a modification,
     * it will not be included
     *                 in this list.
     */
    public long[] getChangedFeeds() {
        return changedFeeds;
    }


    /**
     * Sets the changedFeeds value for this CampaignChangeData.
     * 
     * @param changedFeeds   * A list of feed IDs for CampaignFeeds that have been changed
     * in this campaign.
     *                 If a CampaignFeed is deleted after a modification,
     * it will not be included
     *                 in this list.
     */
    public void setChangedFeeds(long[] changedFeeds) {
        this.changedFeeds = changedFeeds;
    }

    public long getChangedFeeds(int i) {
        return this.changedFeeds[i];
    }

    public void setChangedFeeds(int i, long _value) {
        this.changedFeeds[i] = _value;
    }


    /**
     * Gets the removedFeeds value for this CampaignChangeData.
     * 
     * @return removedFeeds   * A list of feed IDs for CampaignFeeds that have been removed
     * from the
     *                 campaign.
     */
    public long[] getRemovedFeeds() {
        return removedFeeds;
    }


    /**
     * Sets the removedFeeds value for this CampaignChangeData.
     * 
     * @param removedFeeds   * A list of feed IDs for CampaignFeeds that have been removed
     * from the
     *                 campaign.
     */
    public void setRemovedFeeds(long[] removedFeeds) {
        this.removedFeeds = removedFeeds;
    }

    public long getRemovedFeeds(int i) {
        return this.removedFeeds[i];
    }

    public void setRemovedFeeds(int i, long _value) {
        this.removedFeeds[i] = _value;
    }


    /**
     * Gets the campaignTargetingChanged value for this CampaignChangeData.
     * 
     * @return campaignTargetingChanged   * Whether there have been campaign targeting changes.
     */
    public java.lang.Boolean getCampaignTargetingChanged() {
        return campaignTargetingChanged;
    }


    /**
     * Sets the campaignTargetingChanged value for this CampaignChangeData.
     * 
     * @param campaignTargetingChanged   * Whether there have been campaign targeting changes.
     */
    public void setCampaignTargetingChanged(java.lang.Boolean campaignTargetingChanged) {
        this.campaignTargetingChanged = campaignTargetingChanged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignChangeData)) return false;
        CampaignChangeData other = (CampaignChangeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignChangeStatus==null && other.getCampaignChangeStatus()==null) || 
             (this.campaignChangeStatus!=null &&
              this.campaignChangeStatus.equals(other.getCampaignChangeStatus()))) &&
            ((this.changedAdGroups==null && other.getChangedAdGroups()==null) || 
             (this.changedAdGroups!=null &&
              java.util.Arrays.equals(this.changedAdGroups, other.getChangedAdGroups()))) &&
            ((this.addedCampaignCriteria==null && other.getAddedCampaignCriteria()==null) || 
             (this.addedCampaignCriteria!=null &&
              java.util.Arrays.equals(this.addedCampaignCriteria, other.getAddedCampaignCriteria()))) &&
            ((this.removedCampaignCriteria==null && other.getRemovedCampaignCriteria()==null) || 
             (this.removedCampaignCriteria!=null &&
              java.util.Arrays.equals(this.removedCampaignCriteria, other.getRemovedCampaignCriteria()))) &&
            ((this.addedAdExtensions==null && other.getAddedAdExtensions()==null) || 
             (this.addedAdExtensions!=null &&
              java.util.Arrays.equals(this.addedAdExtensions, other.getAddedAdExtensions()))) &&
            ((this.removedAdExtensions==null && other.getRemovedAdExtensions()==null) || 
             (this.removedAdExtensions!=null &&
              java.util.Arrays.equals(this.removedAdExtensions, other.getRemovedAdExtensions()))) &&
            ((this.changedFeeds==null && other.getChangedFeeds()==null) || 
             (this.changedFeeds!=null &&
              java.util.Arrays.equals(this.changedFeeds, other.getChangedFeeds()))) &&
            ((this.removedFeeds==null && other.getRemovedFeeds()==null) || 
             (this.removedFeeds!=null &&
              java.util.Arrays.equals(this.removedFeeds, other.getRemovedFeeds()))) &&
            ((this.campaignTargetingChanged==null && other.getCampaignTargetingChanged()==null) || 
             (this.campaignTargetingChanged!=null &&
              this.campaignTargetingChanged.equals(other.getCampaignTargetingChanged())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignChangeStatus() != null) {
            _hashCode += getCampaignChangeStatus().hashCode();
        }
        if (getChangedAdGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedAdGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedAdGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddedCampaignCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddedCampaignCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddedCampaignCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemovedCampaignCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedCampaignCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedCampaignCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddedAdExtensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddedAdExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddedAdExtensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemovedAdExtensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedAdExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedAdExtensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangedFeeds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedFeeds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedFeeds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemovedFeeds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedFeeds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedFeeds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignTargetingChanged() != null) {
            _hashCode += getCampaignTargetingChanged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignChangeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "CampaignChangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignChangeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "campaignChangeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "ChangeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAdGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "changedAdGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "AdGroupChangeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedCampaignCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "addedCampaignCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedCampaignCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "removedCampaignCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedAdExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "addedAdExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedAdExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "removedAdExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "changedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "removedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignTargetingChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201409", "campaignTargetingChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
