package com.solid.principles.liskovsubstitution.violation;
/*
   Liskov's Substitution :
   If class B is subtype of class A , then we should be able to replace object of A with object of B
   without breaking the behavior of the program.

   Basically a subclass should extend the capability of parent class instead of narrowing it down.

   Eg. Here we have a Bike interface with 2 methods to turn on engine and to accelerate. Now MotorBike class
   can implement this interface and provide implementations of both these methods. But a bicycle  doesn't have
   an engine . So when Bicycle class implements Bike interface , it throws exception from turnOnEngine method-
   this is changing the behavior of parent class Bike : narrowing down the capability of bike . It will cause any 3rd party
   program passing Bicycle in place of MotoBike as parameter for Bike . This violates Liskov Substitution principle.

 */
public interface Bike {

  void turnOnEngine();

  void accelerate();
}
