
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotNullError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotNullError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARG1_NULL"/>
 *     &lt;enumeration value="ARG2_NULL"/>
 *     &lt;enumeration value="ARG3_NULL"/>
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotNullError.Reason")
@XmlEnum
public enum NotNullErrorReason {


    /**
     * 
     *                 Assuming that a method will not have more than 3 arguments, if it does,
     *                 return NULL
     *               
     * 
     */
    @XmlEnumValue("ARG1_NULL")
    ARG_1_NULL("ARG1_NULL"),
    @XmlEnumValue("ARG2_NULL")
    ARG_2_NULL("ARG2_NULL"),
    @XmlEnumValue("ARG3_NULL")
    ARG_3_NULL("ARG3_NULL"),
    NULL("NULL"),

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    NotNullErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotNullErrorReason fromValue(String v) {
        for (NotNullErrorReason c: NotNullErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
