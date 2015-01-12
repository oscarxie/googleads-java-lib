
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {


    /**
     * 
     *                 Indicates that the {@link Order} has just been created but no approval has
     *                 been requested yet.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 Indicates that a request for approval for the {@link Order} has been made.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 Indicates that the {@link Order} has been approved and is ready to serve.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Indicates that the {@link Order} has been disapproved and is not eligible
     *                 to serve.
     *               
     * 
     */
    DISAPPROVED,

    /**
     * 
     *                 Indicates that an approved {@link Order} has been paused from serving.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 Indicates that the {@link Order} has been canceled and cannot serve.
     *               
     * 
     */
    CANCELED,

    /**
     * 
     *                 Indicates that the {@link Order} has been deleted by DSM.
     *               
     * 
     */
    DELETED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OrderStatus fromValue(String v) {
        return valueOf(v);
    }

}
