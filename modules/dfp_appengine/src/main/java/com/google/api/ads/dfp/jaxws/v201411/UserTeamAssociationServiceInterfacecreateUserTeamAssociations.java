
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link UserTeamAssociation} objects.
 *             
 *             @param userTeamAssociations the user team associations to create
 *             @return the created user team associations with their IDs filled in
 *           
 * 
 * <p>Java class for createUserTeamAssociations element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createUserTeamAssociations">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="userTeamAssociations" type="{https://www.google.com/apis/ads/publisher/v201411}UserTeamAssociation" maxOccurs="unbounded" minOccurs="0"/>
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
    "userTeamAssociations"
})
@XmlRootElement(name = "createUserTeamAssociations")
public class UserTeamAssociationServiceInterfacecreateUserTeamAssociations {

    protected List<UserTeamAssociation> userTeamAssociations;

    /**
     * Gets the value of the userTeamAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTeamAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTeamAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTeamAssociation }
     * 
     * 
     */
    public List<UserTeamAssociation> getUserTeamAssociations() {
        if (userTeamAssociations == null) {
            userTeamAssociations = new ArrayList<UserTeamAssociation>();
        }
        return this.userTeamAssociations;
    }

}
