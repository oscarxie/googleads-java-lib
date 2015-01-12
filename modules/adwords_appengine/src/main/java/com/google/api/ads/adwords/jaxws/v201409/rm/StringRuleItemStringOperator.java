
package com.google.api.ads.adwords.jaxws.v201409.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringRuleItem.StringOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringRuleItem.StringOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="STARTS_WITH"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *     &lt;enumeration value="NOT_EQUAL"/>
 *     &lt;enumeration value="NOT_CONTAIN"/>
 *     &lt;enumeration value="NOT_START_WITH"/>
 *     &lt;enumeration value="NOT_END_WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringRuleItem.StringOperator")
@XmlEnum
public enum StringRuleItemStringOperator {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,
    CONTAINS,
    EQUALS,
    STARTS_WITH,
    ENDS_WITH,
    NOT_EQUAL,
    NOT_CONTAIN,
    NOT_START_WITH,
    NOT_END_WITH;

    public String value() {
        return name();
    }

    public static StringRuleItemStringOperator fromValue(String v) {
        return valueOf(v);
    }

}
