/**
 * AdGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public interface AdGroupServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of all the ad groups specified by the selector
     * from the target customer's account.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link AdGroup}s
     * to return.
     *         
     * @return List of adgroups identified by the selector.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupPage get(com.google.api.ads.adwords.axis.v201409.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;

    /**
     * Adds, updates, or removes ad groups.
     *         <p class="note"><b>Note:</b> {@link AdGroupOperation} does
     * not support the
     *         {@code REMOVE} operator. To remove an ad group, set its
     *         {@link AdGroup#status status} to {@code REMOVED}.</p>
     *         
     *         
     * @param operations List of unique operations. The same ad group cannot
     * be
     *         specified in more than one operation.
     *         
     * @return The updated adgroups.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupReturnValue mutate(com.google.api.ads.adwords.axis.v201409.cm.AdGroupOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;

    /**
     * Adds labels to the {@linkplain AdGroup ad group} or removes
     * {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}s
     * from the
     *         {@linkplain AdGroup ad group}.
     *         <p>Add - Apply an existing label to an existing
     *         {@linkplain AdGroup ad group}. The {@code adGroupId} must
     * reference an existing
     *         {@linkplain AdGroup ad group}. The {@code labelId} must reference
     * an existing
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label
     * label}.
     *         <p>Remove - Removes the link between the specified
     *         {@linkplain AdGroup ad group} and
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label
     * label}.</p>
     *         
     * @param operations the operations to apply.
     *         
     * @return a list of {@linkplain AdGroupLabel}s where each entry in the
     * list is the result of
     *         applying the operation in the input list with the same index.
     * For an
     *         add operation, the returned AdGroupLabel contains the AdGroupId
     * and the LabelId.
     *         In the case of a remove operation, the returned AdGroupLabel
     * will only have AdGroupId.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupLabelReturnValue mutateLabel(com.google.api.ads.adwords.axis.v201409.cm.AdGroupLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;

    /**
     * Returns the list of ad groups that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @return A list of adgroups
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdGroupPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;
}
