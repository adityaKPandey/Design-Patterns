package com.behavioral.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		 
		Collection collection = new NotificationCollection();
		Iterator iterator = collection.createIterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
