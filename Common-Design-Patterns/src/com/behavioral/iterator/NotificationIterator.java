package com.behavioral.iterator;

public class NotificationIterator implements Iterator {

	private Notification [] notifications;
    private int currentPos = 0;
	
	public NotificationIterator(Notification [] notifications) {
		 this.notifications = notifications;
	}

	@Override
	public boolean hasNext() {
		
		return (currentPos < notifications.length && notifications[currentPos] != null ? true : false );
		
	}

	@Override
	public Object next() {
		
		if(hasNext()) {
		   
			return notifications[currentPos++];
		   
	    }else
			return null;
		
	}

}
