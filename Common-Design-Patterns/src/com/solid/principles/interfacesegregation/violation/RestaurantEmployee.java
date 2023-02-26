package com.solid.principles.interfacesegregation.violation;

/*
   Interfaces should be such, that client should implement only necessary functions and don't need to implement
   unnecessary methods which are not needed by client.

   Eg. Here RestaurantEmployee interface has 3 methods .But a waiter class , whose job is to serve customers ,
    and who decides  to implement this interface , would unnecessarily have to implement other 2 methods ( to cook food and
    to wash utensils) . This violates interface segregation principle.

 */
public interface RestaurantEmployee {

  void washUtensils();
  void cookFood();
  void serveCustomers();

}
