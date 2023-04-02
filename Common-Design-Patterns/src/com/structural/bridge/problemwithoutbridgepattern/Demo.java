package com.structural.bridge.problemwithoutbridgepattern;

/*
   Problem with this class structure : 1 abstract class called LivingThings , extended by Dog,Fish and Tree classes,
   is that if we want to define a new breathing process , we can't add it without adding a new class extending LivingThings.
   So the implementor of breathing process(Dog's breathing , Fish' breathing etc.) is tightly coupled to its abstraction.
 */

public class Demo {

  public static void main(String [] args){
       System.out.println("######## Dog breathing ##########");
       LivingThings dog = new Dog();
       dog.breathe();

       System.out.println("######### Fish breathing ###########");
       LivingThings fish = new Fish();
       fish.breathe();

       System.out.println("########## Tree breathing ###########");
       LivingThings tree = new Tree();
       tree.breathe();
  }

}
