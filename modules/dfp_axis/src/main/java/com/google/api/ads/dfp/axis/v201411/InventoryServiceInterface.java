/**
 * InventoryServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;

public interface InventoryServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link AdUnit} objects.
     *         
     *         
     * @param adUnits the ad units to create
     *         
     * @return the created ad units, with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201411.AdUnit[] createAdUnits(com.google.api.ads.dfp.axis.v201411.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Gets a set of {@link AdUnitSize} objects that satisfy the given
     * {@link Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code targetPlatform}</td>
     *         <td>{@link TargetPlatform}</td>
     *         </tr>
     *         </table>
     *         An exception will be thrown for queries with unsupported fields.
     * 
     *         Paging is not supported, as aren't the LIMIT and OFFSET PQL
     * keywords.
     *         
     *         Only "=" operator is supported.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad unit sizes
     *         
     * @return the ad unit sizes that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201411.AdUnitSize[] getAdUnitSizesByStatement(com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Gets a {@link AdUnitPage} of {@link AdUnit} objects that satisfy
     * the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code adUnitCode}</td>
     *         <td>{@link AdUnit#adUnitCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdUnit#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code parentId}</td>
     *         <td>{@link AdUnit#parentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdUnit#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link AdUnit#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad units
     *         
     * @return the ad units that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201411.AdUnitPage getAdUnitsByStatement(com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Performs actions on {@link AdUnit} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param adUnitAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad units
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201411.UpdateResult performAdUnitAction(com.google.api.ads.dfp.axis.v201411.AdUnitAction adUnitAction, com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Updates the specified {@link AdUnit} objects.
     *         
     *         
     * @param adUnits the ad units to update
     *         
     * @return the updated ad units
     */
    public com.google.api.ads.dfp.axis.v201411.AdUnit[] updateAdUnits(com.google.api.ads.dfp.axis.v201411.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;
}
