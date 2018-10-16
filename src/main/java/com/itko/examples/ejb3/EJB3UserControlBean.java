/**
 * EJB3UserControlBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.itko.examples.ejb3;

public interface EJB3UserControlBean extends java.rmi.Remote {
    public java.lang.String addAddress(java.lang.String username, com.itko.examples.ejb3.Address addressObject) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.User addUser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.User addUserObject(com.itko.examples.ejb3.User userObject) throws java.rmi.RemoteException;
    public boolean deleteAddress(java.lang.String username, java.lang.String addressId) throws java.rmi.RemoteException;
    public boolean deleteTestAccounts() throws java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String username) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.Address getAddress(java.lang.String addressId) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.User getUser(java.lang.String username) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.Address[] listAddresses(java.lang.String username) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.User[] listUsers() throws java.rmi.RemoteException;
    public java.lang.String ping(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.User resetPassword(java.lang.String username) throws java.rmi.RemoteException;
    public com.itko.examples.ejb3.User updateUser(com.itko.examples.ejb3.User userObject) throws java.rmi.RemoteException;
    public boolean validate(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
