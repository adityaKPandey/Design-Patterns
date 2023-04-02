package com.structural.bridge.problemwithoutbridgepattern;

public class Fish extends LivingThings{

  @Override
  public void breathe() {
    System.out.println("Breathe through gills");
    System.out.println("Absorb Oxygen from water");
    System.out.println("Release carbon di-oxide");
  }
}
