package com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface circleInterface extends Remote{

	public double circleArea(double r)throws RemoteException;
}
