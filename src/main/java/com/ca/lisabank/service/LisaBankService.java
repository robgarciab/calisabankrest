package com.ca.lisabank.service;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.springframework.stereotype.Service;

import com.itko.examples.ejb3.EJB3UserControlBean;
import com.itko.examples.ejb3.EJB3UserControlBeanServiceLocator;
import com.itko.examples.ejb3.User;

@Service
public class LisaBankService {

	private EJB3UserControlBean stub;

	public LisaBankService() {
		try {
			stub = new EJB3UserControlBeanServiceLocator().getEJB3UserControlBeanPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			stub = null;
		}
	}

	public List<User> listUsers() {
		User[] users = null;

		if (stub != null) {
			try {
				users = stub.listUsers();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (users != null) {
			return Arrays.asList(users);
		} else {
			return Arrays.asList(new User[0]);
		}
	}

	public User getUser(String username) {
		if (stub != null) {
			try {
				return stub.getUser(username);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				return null;
			}
		} else {
			return null;
		}

	}
}
