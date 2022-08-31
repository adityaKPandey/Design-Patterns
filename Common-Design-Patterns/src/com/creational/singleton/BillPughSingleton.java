package com.creational.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BillPughSingleton() {
		System.out.println("Initialized BillPugh singleton");
	}
	
	private static class SingletonHelper{
		private static BillPughSingleton singleton = new BillPughSingleton();
		
	}
	
	//Until getInstance() method is called , JVM doesn't load/initialize static class
	public static BillPughSingleton getInstance() {
		return SingletonHelper.singleton;
	}
	
	protected Object readResolve() {
		return SingletonHelper.singleton;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return SingletonHelper.singleton;
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) {
		 

	}

}
