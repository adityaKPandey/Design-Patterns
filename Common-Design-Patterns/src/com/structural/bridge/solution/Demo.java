package com.structural.bridge.solution;

/*
  To fix the problem of tight coupling between abstraction and implementor ( i.e. So the implementor of breathing
  process(Dog's breathing , Fish' breathing etc.) is tightly coupled to its abstraction) , we can separate the breathe process
  implementor into a separate interface , and provide its composition in the abstraction , so that different implementations
  can be used at runtime.
*/

public class Demo {

  public static void main(String [] args){

    System.out.println("######## Dog breathing ##########");
    LivingThings dog = new Dog(new LandBreatheImplementor());
    dog.breathe();

    System.out.println("######### Fish breathing ###########");
    LivingThings fish = new Fish(new WaterBreatheImplementor());
    fish.breathe();


    System.out.println("########## Tree breathing ###########");
    LivingThings tree = new Tree(new TreeBreatheImplementor());
    tree.breathe();

  }

}
