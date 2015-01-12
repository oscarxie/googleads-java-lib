
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilePlatform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilePlatform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SITE"/>
 *     &lt;enumeration value="APPLICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilePlatform")
@XmlEnum
public enum MobilePlatform {


    /**
     * 
     *                 The ad unit appears in a mobile site.
     *               
     * 
     */
    SITE,

    /**
     * 
     *                 The ad unit appears in a moible application.
     *               
     * 
     */
    APPLICATION;

    public String value() {
        return name();
    }

    public static MobilePlatform fromValue(String v) {
        return valueOf(v);
    }

}
