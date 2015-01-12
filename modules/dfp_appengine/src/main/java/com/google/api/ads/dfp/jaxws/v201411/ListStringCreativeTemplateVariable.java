
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a list variable defined in a creative template. This is similar to
 *             {@link StringCreativeTemplateVariable}, except that there are possible choices to
 *             choose from.
 *             <p>
 *             Use {@link StringCreativeTemplateVariableValue} to specify the value
 *             for this variable when creating {@link TemplateCreative} from the {@link TemplateCreative}.
 *           
 * 
 * <p>Java class for ListStringCreativeTemplateVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListStringCreativeTemplateVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}StringCreativeTemplateVariable">
 *       &lt;sequence>
 *         &lt;element name="choices" type="{https://www.google.com/apis/ads/publisher/v201411}ListStringCreativeTemplateVariable.VariableChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowOtherChoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStringCreativeTemplateVariable", propOrder = {
    "choices",
    "allowOtherChoice"
})
public class ListStringCreativeTemplateVariable
    extends StringCreativeTemplateVariable
{

    protected List<ListStringCreativeTemplateVariableVariableChoice> choices;
    protected Boolean allowOtherChoice;

    /**
     * Gets the value of the choices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListStringCreativeTemplateVariableVariableChoice }
     * 
     * 
     */
    public List<ListStringCreativeTemplateVariableVariableChoice> getChoices() {
        if (choices == null) {
            choices = new ArrayList<ListStringCreativeTemplateVariableVariableChoice>();
        }
        return this.choices;
    }

    /**
     * Gets the value of the allowOtherChoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOtherChoice() {
        return allowOtherChoice;
    }

    /**
     * Sets the value of the allowOtherChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOtherChoice(Boolean value) {
        this.allowOtherChoice = value;
    }

}
