
package com.google.api.ads.adwords.jaxws.v201409.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Representation of a userlist that is generated by a rule.
 *           
 * 
 * <p>Java class for RuleBasedUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleBasedUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201409}UserList">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleBasedUserList")
@XmlSeeAlso({
    ExpressionRuleUserList.class,
    DateSpecificRuleUserList.class
})
public class RuleBasedUserList
    extends UserList
{


}
