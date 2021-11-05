package com.behavioral.iterator;

public class NotificationCollection implements Collection {

	private static final int NO_MAX_ITEMS = 5;
	private int noOfItems = 0;
	private Notification[] notifications;
	
	 

	public NotificationCollection() {
		 
		notifications = new Notification[NO_MAX_ITEMS];
		addNotification("Notification 1");
		addNotification("Notification 2");
		addNotification("Notification 3");
	}



	private void addNotification(String message) {
		// TODO Auto-generated method stub
	
		notifications[noOfItems++] = new Notification(message);
		
	}



	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NotificationIterator(notifications);
	}

}
