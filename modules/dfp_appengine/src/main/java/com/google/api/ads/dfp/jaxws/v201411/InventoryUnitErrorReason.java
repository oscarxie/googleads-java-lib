
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUnitError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryUnitError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPLICIT_TARGETING_NOT_ALLOWED"/>
 *     &lt;enumeration value="TARGET_PLATFORM_NOT_APPLICABLE"/>
 *     &lt;enumeration value="ADSENSE_CANNOT_BE_ENABLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryUnitError.Reason")
@XmlEnum
public enum InventoryUnitErrorReason {


    /**
     * 
     *                 {@link AdUnit#explicitlyTargeted} can be set to {@code true} only in a
     *                 DFP Premium account.
     *               
     * 
     */
    EXPLICIT_TARGETING_NOT_ALLOWED,

    /**
     * 
     *                 The specified target platform is not applicable for the inventory unit.
     *               
     * 
     */
    TARGET_PLATFORM_NOT_APPLICABLE,

    /**
     * 
     *                 AdSense cannot be enabled on this inventory unit if it is disabled for the network.
     *               
     * 
     */
    ADSENSE_CANNOT_BE_ENABLED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static InventoryUnitErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
