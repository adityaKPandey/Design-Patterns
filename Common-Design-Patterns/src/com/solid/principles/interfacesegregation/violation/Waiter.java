package com.solid.principles.interfacesegregation.violation;

public class Waiter implements RestaurantEmployee{

  @Override
  public void washUtensils() {
    // not my job
  }

  @Override
  public void cookFood() {
    // not my job
  }

  @Override
  public void serveCustomers() {
    System.out.println("Serving the customers");
  }
}
