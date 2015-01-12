/**
 * CampaignSharedSetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public interface CampaignSharedSetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CampaignSharedSets based on the given selector.
     * 
     * @param selector the selector specifying the query
     *         
     * @return a list of CampaignSharedSet entities that meet the criterion
     * specified
     *         by the selector
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetPage get(com.google.api.ads.adwords.axis.v201409.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     * @param operations the operations to apply
     *         
     * @return the modified list of CampaignSharedSet associations
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetReturnValue mutate(com.google.api.ads.adwords.axis.v201409.cm.CampaignSharedSetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;
}
