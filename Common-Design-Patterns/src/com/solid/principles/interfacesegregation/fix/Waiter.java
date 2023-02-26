package com.solid.principles.interfacesegregation.fix;

public class Waiter implements WaiterInterface{

  @Override
  public void serveCustomers() {
    System.out.println("Serving the customers");
  }
}
