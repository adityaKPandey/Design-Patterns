package com.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {

	public static void main(String[] args) {

		DoubleLockingSingleton doubleLockingSingleton = DoubleLockingSingleton.getInstance();

		System.out.println(doubleLockingSingleton.toString());

		breakDoubleLockingSingleton();

		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton.toString());

		breakBillPughSingleton();

	}

	public static void breakDoubleLockingSingleton() {

		try {

			System.out.println("First DoubleLocking instance:"+ DoubleLockingSingleton.getInstance().toString());
			Constructor [] constructors = DoubleLockingSingleton.class.getDeclaredConstructors();
			constructors[0].setAccessible(true);

			System.out.println("Second DoubleLocking instance:"+ constructors[0].newInstance(null));

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static void breakBillPughSingleton()  {

		try {
			
			System.out.println("First BillPughSingleton instance:"+ BillPughSingleton.getInstance().toString());
			Constructor [] constructors = BillPughSingleton.class.getDeclaredConstructors();
			
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				if(constructor.getParameters().length == 0)
				 System.out.println("Second BillPughSingleton instance:"+ constructor.newInstance());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
