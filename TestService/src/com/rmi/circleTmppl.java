package com.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class circleTmppl extends UnicastRemoteObject implements circleInterface{

	/**
	 * 
	 */
	public circleTmppl() throws RemoteException{
		super();
	}

	@Override
	public double circleArea(double r) throws RemoteException {
		
		return 3.14*r*r;
	}
	
	

}
