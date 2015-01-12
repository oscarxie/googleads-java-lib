
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSchedule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingSchedule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREPAID"/>
 *     &lt;enumeration value="END_OF_THE_CAMPAIGN"/>
 *     &lt;enumeration value="STRAIGHTLINE"/>
 *     &lt;enumeration value="PRORATED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingSchedule")
@XmlEnum
public enum BillingSchedule {


    /**
     * 
     *                 Charged based on the contracted value after the first month of the campaign.
     *               
     * 
     */
    PREPAID,

    /**
     * 
     *                 Charged based on the contracted value after the last month of the campaign.
     *               
     * 
     */
    END_OF_THE_CAMPAIGN,

    /**
     * 
     *                 Use a billing source of contracted with a billing schedule of straightline to bill your
     *                 advertiser the same amount each month, regardless of the number of days in each month.
     *               
     * 
     */
    STRAIGHTLINE,

    /**
     * 
     *                 Use a billing source of contracted with a billing schedule of prorated to bill your
     *                 advertiser proportionally based on the amount of days in each month.
     *               
     * 
     */
    PRORATED,

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

    public static BillingSchedule fromValue(String v) {
        return valueOf(v);
    }

}
