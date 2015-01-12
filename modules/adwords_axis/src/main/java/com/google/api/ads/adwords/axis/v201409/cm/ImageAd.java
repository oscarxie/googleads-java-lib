/**
 * ImageAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents an ImageAd.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ImageAd  extends com.google.api.ads.adwords.axis.v201409.cm.Ad  implements java.io.Serializable {
    /* The image data for the ad. */
    private com.google.api.ads.adwords.axis.v201409.cm.Image image;

    /* The name label for this ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String name;

    /* For ADD operations only: use this field to specify an existing
     * image ad to copy the image from, in which case the "image" field
     *                     can be left empty. This is the preferred way of
     * copying images
     *                     over re-uploading the same image.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span> */
    private java.lang.Long adToCopyImageFrom;

    public ImageAd() {
    }

    public ImageAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201409.cm.CustomParameters urlCustomParameters,
           java.lang.Long devicePreference,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201409.cm.Image image,
           java.lang.String name,
           java.lang.Long adToCopyImageFrom) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            devicePreference,
            adType);
        this.image = image;
        this.name = name;
        this.adToCopyImageFrom = adToCopyImageFrom;
    }


    /**
     * Gets the image value for this ImageAd.
     * 
     * @return image   * The image data for the ad.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Image getImage() {
        return image;
    }


    /**
     * Sets the image value for this ImageAd.
     * 
     * @param image   * The image data for the ad.
     */
    public void setImage(com.google.api.ads.adwords.axis.v201409.cm.Image image) {
        this.image = image;
    }


    /**
     * Gets the name value for this ImageAd.
     * 
     * @return name   * The name label for this ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ImageAd.
     * 
     * @param name   * The name label for this ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the adToCopyImageFrom value for this ImageAd.
     * 
     * @return adToCopyImageFrom   * For ADD operations only: use this field to specify an existing
     * image ad to copy the image from, in which case the "image" field
     *                     can be left empty. This is the preferred way of
     * copying images
     *                     over re-uploading the same image.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     */
    public java.lang.Long getAdToCopyImageFrom() {
        return adToCopyImageFrom;
    }


    /**
     * Sets the adToCopyImageFrom value for this ImageAd.
     * 
     * @param adToCopyImageFrom   * For ADD operations only: use this field to specify an existing
     * image ad to copy the image from, in which case the "image" field
     *                     can be left empty. This is the preferred way of
     * copying images
     *                     over re-uploading the same image.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     */
    public void setAdToCopyImageFrom(java.lang.Long adToCopyImageFrom) {
        this.adToCopyImageFrom = adToCopyImageFrom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageAd)) return false;
        ImageAd other = (ImageAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.adToCopyImageFrom==null && other.getAdToCopyImageFrom()==null) || 
             (this.adToCopyImageFrom!=null &&
              this.adToCopyImageFrom.equals(other.getAdToCopyImageFrom())));
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
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAdToCopyImageFrom() != null) {
            _hashCode += getAdToCopyImageFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "ImageAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adToCopyImageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "adToCopyImageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
