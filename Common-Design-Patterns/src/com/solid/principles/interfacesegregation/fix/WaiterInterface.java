package com.solid.principles.interfacesegregation.fix;

/*
   To fix the problem , we have split 1 big RestaurantEmployee interface into multiple smaller interfaces like WaiterInterface,
   ChefInterface,CleanerInterface which have methods to perform only those tasks that which actually fall under their job description
 */

public interface WaiterInterface {
  void serveCustomers();
}
