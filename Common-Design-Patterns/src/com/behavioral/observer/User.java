package com.behavioral.observer;

public class User implements Observer{

  @Override
  public void notify(String info) {
    System.out.println("User informed :"+ this +" info: "+info);
  }
}
