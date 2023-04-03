package com.behavioral.observer;

public interface Stock {
  void addUser(Observer user);
  void removeUser(Observer user);
  void update(String info);
  void restock(int iPhoneCount);
}
