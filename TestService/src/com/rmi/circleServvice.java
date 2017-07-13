package com.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class circleServvice {

	public static void main(String[] ages){
		
		try {
			circleTmppl circle= new circleTmppl();
			Naming.bind("rmi://localhost:1099/circle_area", circle);
			
			System.out.println("object bund");
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
