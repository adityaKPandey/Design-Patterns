package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements Stock{

  private List<Observer> users = new ArrayList<>();
  int count = 0;

  @Override
  public void addUser(Observer user) {
    System.out.println("Subscribed by another user :"+user);
    users.add(user);
  }

  @Override
  public void removeUser(Observer user) {
    System.out.println("Opted out by user");
    users.remove(user);
  }

  @Override
  public void restock(int iPhoneCount){
    count += iPhoneCount;
    if(count > 2)
       update("IPhones back in stock");
  }

  @Override
  public void update(String info) {
    users.forEach(user -> user.update(info));
  }

}
