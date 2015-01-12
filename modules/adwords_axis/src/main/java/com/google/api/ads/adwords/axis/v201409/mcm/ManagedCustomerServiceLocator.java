/**
 * ManagedCustomerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.mcm;

public class ManagedCustomerServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerService {

    public ManagedCustomerServiceLocator() {
    }


    public ManagedCustomerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagedCustomerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagedCustomerServiceInterfacePort
    private java.lang.String ManagedCustomerServiceInterfacePort_address = "https://adwords.google.com/api/adwords/mcm/v201409/ManagedCustomerService";

    public java.lang.String getManagedCustomerServiceInterfacePortAddress() {
        return ManagedCustomerServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagedCustomerServiceInterfacePortWSDDServiceName = "ManagedCustomerServiceInterfacePort";

    public java.lang.String getManagedCustomerServiceInterfacePortWSDDServiceName() {
        return ManagedCustomerServiceInterfacePortWSDDServiceName;
    }

    public void setManagedCustomerServiceInterfacePortWSDDServiceName(java.lang.String name) {
        ManagedCustomerServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceInterface getManagedCustomerServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagedCustomerServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagedCustomerServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceInterface getManagedCustomerServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getManagedCustomerServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagedCustomerServiceInterfacePortEndpointAddress(java.lang.String address) {
        ManagedCustomerServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomerServiceSoapBindingStub(new java.net.URL(ManagedCustomerServiceInterfacePort_address), this);
                _stub.setPortName(getManagedCustomerServiceInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ManagedCustomerServiceInterfacePort".equals(inputPortName)) {
            return getManagedCustomerServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201409", "ManagedCustomerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201409", "ManagedCustomerServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagedCustomerServiceInterfacePort".equals(portName)) {
            setManagedCustomerServiceInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
