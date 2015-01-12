
package com.google.api.ads.adwords.jaxws.v201409.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="REFUSED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinkStatus")
@XmlEnum
public enum LinkStatus {


    /**
     * 
     *                 An active relationship.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 A former active relationship.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 An invitation that is active or has expired.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 An invitation that was refused by the invitee.
     *               
     * 
     */
    REFUSED,

    /**
     * 
     *                 An invitation that was cancelled by the invitor.
     *               
     * 
     */
    CANCELLED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LinkStatus fromValue(String v) {
        return valueOf(v);
    }

}
