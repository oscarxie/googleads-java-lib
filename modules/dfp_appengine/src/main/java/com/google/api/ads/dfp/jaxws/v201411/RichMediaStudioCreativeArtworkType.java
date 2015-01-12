
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichMediaStudioCreativeArtworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaStudioCreativeArtworkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLASH"/>
 *     &lt;enumeration value="HTML5"/>
 *     &lt;enumeration value="MIXED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaStudioCreativeArtworkType")
@XmlEnum
public enum RichMediaStudioCreativeArtworkType {


    /**
     * 
     *                 The creative is a Flash creative.
     *               
     * 
     */
    FLASH("FLASH"),

    /**
     * 
     *                 The creative is HTML5.
     *               
     * 
     */
    @XmlEnumValue("HTML5")
    HTML_5("HTML5"),

    /**
     * 
     *                 The creative is Flash if available, and HTML5 otherwise.
     *               
     * 
     */
    MIXED("MIXED");
    private final String value;

    RichMediaStudioCreativeArtworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichMediaStudioCreativeArtworkType fromValue(String v) {
        for (RichMediaStudioCreativeArtworkType c: RichMediaStudioCreativeArtworkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
