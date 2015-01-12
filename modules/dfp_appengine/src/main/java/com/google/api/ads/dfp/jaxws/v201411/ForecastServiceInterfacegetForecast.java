
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link Forecast} on a prospective {@link LineItem} object. Valid
 *             values for {@link LineItem#lineItemType} are
 *             {@link LineItemType#SPONSORSHIP} and {@link LineItemType#STANDARD}. Other
 *             values will result in
 *             {@link ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
 *             
 *             @param lineItem the target of the forecast. If {@link LineItem#id} is null
 *             or no line item exists with that ID, a forecast is computed for the
 *             the subject, predicting what would happen if it were added to the
 *             system. If a line item already exists with {@link LineItem#id}, the
 *             forecast is computed for the subject, predicting what would happen
 *             if the existing line item's settings were modified to match the
 *             subject.
 *             @return the forecasted traffic estimates
 *           
 * 
 * <p>Java class for getForecast element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getForecast">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItem" type="{https://www.google.com/apis/ads/publisher/v201411}LineItem" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lineItem"
})
@XmlRootElement(name = "getForecast")
public class ForecastServiceInterfacegetForecast {

    protected LineItem lineItem;

    /**
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem }
     *     
     */
    public LineItem getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem }
     *     
     */
    public void setLineItem(LineItem value) {
        this.lineItem = value;
    }

}
