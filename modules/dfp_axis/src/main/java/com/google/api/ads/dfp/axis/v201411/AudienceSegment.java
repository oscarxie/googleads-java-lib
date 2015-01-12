/**
 * AudienceSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * An {@link AudienceSegment} represents audience segment object.
 */
public class AudienceSegment  implements java.io.Serializable {
    /* Id of the {@link AudienceSegment}. This attribute is readonly
     * and is populated by Google. */
    private java.lang.Long id;

    /* Name of the {@link AudienceSegment}. This attribute is required
     * and has a maximum length of 255
     *                 characters. */
    private java.lang.String name;

    /* The ids of the categories this segment belongs to. This field
     * is optional, it may be empty. */
    private long[] categoryIds;

    /* Description of the {@link AudienceSegment}. This attribute
     * is optional and has a maximum
     *                 length of 8192 characters. */
    private java.lang.String description;

    /* Status of the {@link AudienceSegment}. This controls whether
     * the given segment is available for
     *                 targeting or not. During creation this attribute is
     * optional and defaults to {@code ACTIVE}.
     *                 This attribute is readonly for updates. */
    private com.google.api.ads.dfp.axis.v201411.AudienceSegmentStatus status;

    /* Number of unique cookies in the {@link AudienceSegment}. This
     * attribute is readonly and is
     *                 populated by Google. */
    private java.lang.Long size;

    /* Owner data provider of this segment. This attribute is readonly
     * and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201411.AudienceSegmentDataProvider dataProvider;

    /* Type of the segment. This attribute is readonly and is assigned
     * by Google. */
    private com.google.api.ads.dfp.axis.v201411.AudienceSegmentAudienceSegmentType type;

    /* Indicates that this instance is a subtype of AudienceSegment.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String audienceSegmentType;

    public AudienceSegment() {
    }

    public AudienceSegment(
           java.lang.Long id,
           java.lang.String name,
           long[] categoryIds,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201411.AudienceSegmentStatus status,
           java.lang.Long size,
           com.google.api.ads.dfp.axis.v201411.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.dfp.axis.v201411.AudienceSegmentAudienceSegmentType type,
           java.lang.String audienceSegmentType) {
           this.id = id;
           this.name = name;
           this.categoryIds = categoryIds;
           this.description = description;
           this.status = status;
           this.size = size;
           this.dataProvider = dataProvider;
           this.type = type;
           this.audienceSegmentType = audienceSegmentType;
    }


    /**
     * Gets the id value for this AudienceSegment.
     * 
     * @return id   * Id of the {@link AudienceSegment}. This attribute is readonly
     * and is populated by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AudienceSegment.
     * 
     * @param id   * Id of the {@link AudienceSegment}. This attribute is readonly
     * and is populated by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this AudienceSegment.
     * 
     * @return name   * Name of the {@link AudienceSegment}. This attribute is required
     * and has a maximum length of 255
     *                 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AudienceSegment.
     * 
     * @param name   * Name of the {@link AudienceSegment}. This attribute is required
     * and has a maximum length of 255
     *                 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the categoryIds value for this AudienceSegment.
     * 
     * @return categoryIds   * The ids of the categories this segment belongs to. This field
     * is optional, it may be empty.
     */
    public long[] getCategoryIds() {
        return categoryIds;
    }


    /**
     * Sets the categoryIds value for this AudienceSegment.
     * 
     * @param categoryIds   * The ids of the categories this segment belongs to. This field
     * is optional, it may be empty.
     */
    public void setCategoryIds(long[] categoryIds) {
        this.categoryIds = categoryIds;
    }

    public long getCategoryIds(int i) {
        return this.categoryIds[i];
    }

    public void setCategoryIds(int i, long _value) {
        this.categoryIds[i] = _value;
    }


    /**
     * Gets the description value for this AudienceSegment.
     * 
     * @return description   * Description of the {@link AudienceSegment}. This attribute
     * is optional and has a maximum
     *                 length of 8192 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AudienceSegment.
     * 
     * @param description   * Description of the {@link AudienceSegment}. This attribute
     * is optional and has a maximum
     *                 length of 8192 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this AudienceSegment.
     * 
     * @return status   * Status of the {@link AudienceSegment}. This controls whether
     * the given segment is available for
     *                 targeting or not. During creation this attribute is
     * optional and defaults to {@code ACTIVE}.
     *                 This attribute is readonly for updates.
     */
    public com.google.api.ads.dfp.axis.v201411.AudienceSegmentStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AudienceSegment.
     * 
     * @param status   * Status of the {@link AudienceSegment}. This controls whether
     * the given segment is available for
     *                 targeting or not. During creation this attribute is
     * optional and defaults to {@code ACTIVE}.
     *                 This attribute is readonly for updates.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201411.AudienceSegmentStatus status) {
        this.status = status;
    }


    /**
     * Gets the size value for this AudienceSegment.
     * 
     * @return size   * Number of unique cookies in the {@link AudienceSegment}. This
     * attribute is readonly and is
     *                 populated by Google.
     */
    public java.lang.Long getSize() {
        return size;
    }


    /**
     * Sets the size value for this AudienceSegment.
     * 
     * @param size   * Number of unique cookies in the {@link AudienceSegment}. This
     * attribute is readonly and is
     *                 populated by Google.
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }


    /**
     * Gets the dataProvider value for this AudienceSegment.
     * 
     * @return dataProvider   * Owner data provider of this segment. This attribute is readonly
     * and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201411.AudienceSegmentDataProvider getDataProvider() {
        return dataProvider;
    }


    /**
     * Sets the dataProvider value for this AudienceSegment.
     * 
     * @param dataProvider   * Owner data provider of this segment. This attribute is readonly
     * and is assigned by Google.
     */
    public void setDataProvider(com.google.api.ads.dfp.axis.v201411.AudienceSegmentDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }


    /**
     * Gets the type value for this AudienceSegment.
     * 
     * @return type   * Type of the segment. This attribute is readonly and is assigned
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201411.AudienceSegmentAudienceSegmentType getType() {
        return type;
    }


    /**
     * Sets the type value for this AudienceSegment.
     * 
     * @param type   * Type of the segment. This attribute is readonly and is assigned
     * by Google.
     */
    public void setType(com.google.api.ads.dfp.axis.v201411.AudienceSegmentAudienceSegmentType type) {
        this.type = type;
    }


    /**
     * Gets the audienceSegmentType value for this AudienceSegment.
     * 
     * @return audienceSegmentType   * Indicates that this instance is a subtype of AudienceSegment.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getAudienceSegmentType() {
        return audienceSegmentType;
    }


    /**
     * Sets the audienceSegmentType value for this AudienceSegment.
     * 
     * @param audienceSegmentType   * Indicates that this instance is a subtype of AudienceSegment.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setAudienceSegmentType(java.lang.String audienceSegmentType) {
        this.audienceSegmentType = audienceSegmentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceSegment)) return false;
        AudienceSegment other = (AudienceSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.categoryIds==null && other.getCategoryIds()==null) || 
             (this.categoryIds!=null &&
              java.util.Arrays.equals(this.categoryIds, other.getCategoryIds()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.dataProvider==null && other.getDataProvider()==null) || 
             (this.dataProvider!=null &&
              this.dataProvider.equals(other.getDataProvider()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.audienceSegmentType==null && other.getAudienceSegmentType()==null) || 
             (this.audienceSegmentType!=null &&
              this.audienceSegmentType.equals(other.getAudienceSegmentType())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCategoryIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getDataProvider() != null) {
            _hashCode += getDataProvider().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAudienceSegmentType() != null) {
            _hashCode += getAudienceSegmentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudienceSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AudienceSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "categoryIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AudienceSegment.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "dataProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AudienceSegmentDataProvider"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AudienceSegment.AudienceSegmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AudienceSegment.Type"));
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
