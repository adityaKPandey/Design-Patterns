package com.behavioral.observer;

/*
  Buyers/Users subscribing to IPhone 'in stock' notification ,
  so that we Iphone stock is updated/restocked and there are enough IPhones in stock(2 here as example) ,
  these subscribers are notified.
  Users can opt out of this notification also.
 */
public class Demo {

  public static void main(String [] args){
    Stock stock = new IPhone();
    Observer observer1 = new User();
    Observer observer2 = new User();

    stock.addUser(observer1);
    stock.addUser(observer2);

    stock.restock(2);

    stock.restock(3);

    stock.removeUser(observer2);

    stock.restock(2);

  }

}
