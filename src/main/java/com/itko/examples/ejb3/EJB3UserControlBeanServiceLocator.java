/**
 * EJB3UserControlBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.itko.examples.ejb3;

public class EJB3UserControlBeanServiceLocator extends org.apache.axis.client.Service implements com.itko.examples.ejb3.EJB3UserControlBeanService {

    public EJB3UserControlBeanServiceLocator() {
    }


    public EJB3UserControlBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EJB3UserControlBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EJB3UserControlBeanPort
    private java.lang.String EJB3UserControlBeanPort_address = "http://ubuntu:8080/itkoExamples/EJB3UserControlBean";

    public java.lang.String getEJB3UserControlBeanPortAddress() {
        return EJB3UserControlBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EJB3UserControlBeanPortWSDDServiceName = "EJB3UserControlBeanPort";

    public java.lang.String getEJB3UserControlBeanPortWSDDServiceName() {
        return EJB3UserControlBeanPortWSDDServiceName;
    }

    public void setEJB3UserControlBeanPortWSDDServiceName(java.lang.String name) {
        EJB3UserControlBeanPortWSDDServiceName = name;
    }

    public com.itko.examples.ejb3.EJB3UserControlBean getEJB3UserControlBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EJB3UserControlBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEJB3UserControlBeanPort(endpoint);
    }

    public com.itko.examples.ejb3.EJB3UserControlBean getEJB3UserControlBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.itko.examples.ejb3.EJB3UserControlBeanBindingStub _stub = new com.itko.examples.ejb3.EJB3UserControlBeanBindingStub(portAddress, this);
            _stub.setPortName(getEJB3UserControlBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEJB3UserControlBeanPortEndpointAddress(java.lang.String address) {
        EJB3UserControlBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.itko.examples.ejb3.EJB3UserControlBean.class.isAssignableFrom(serviceEndpointInterface)) {
                com.itko.examples.ejb3.EJB3UserControlBeanBindingStub _stub = new com.itko.examples.ejb3.EJB3UserControlBeanBindingStub(new java.net.URL(EJB3UserControlBeanPort_address), this);
                _stub.setPortName(getEJB3UserControlBeanPortWSDDServiceName());
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
        if ("EJB3UserControlBeanPort".equals(inputPortName)) {
            return getEJB3UserControlBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ejb3.examples.itko.com/", "EJB3UserControlBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ejb3.examples.itko.com/", "EJB3UserControlBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EJB3UserControlBeanPort".equals(portName)) {
            setEJB3UserControlBeanPortEndpointAddress(address);
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
