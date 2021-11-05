package com.creational.singleton;

import java.io.Serializable;

public class DoubleLockingSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static volatile DoubleLockingSingleton singleton = null;
	
	private DoubleLockingSingleton() {
		System.out.println("Initialized DoubleLocking singleton");
	}
	
	//to prevent singleton pattern from getting broken by deserialization
	protected Object readResolve() {
		return singleton;
	}
	
	public static DoubleLockingSingleton getInstance() {
		DoubleLockingSingleton object = singleton;
		if(singleton == null) {
			synchronized(DoubleLockingSingleton.class) {
				if(singleton == null) {
					
					object = new DoubleLockingSingleton();
					singleton = object;
					
				}
			}
		}
		return object;
	}
	
}
