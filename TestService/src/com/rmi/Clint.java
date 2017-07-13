package com.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Clint {
	
	private static Scanner str;
	public static void main(String[] args){
		
		try {
			circleInterface cir = (circleInterface) Naming.lookup("rim://localhost:1099/circle_area");
			System.out.println("请输入半径");
			double R;
			str = new Scanner(System.in);
			
			R=str.nextDouble();
			
			System.out.println("面积："+cir.circleArea(R));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
