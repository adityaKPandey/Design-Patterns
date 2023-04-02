package com.structural.bridge.problemwithoutbridgepattern;

public class Tree extends LivingThings{

  @Override
  public void breathe() {
    System.out.println("Breathe through leaves");
    System.out.println("Inhale carbon di-oxide from air");
    System.out.println("Exhale oxygen");
  }

}
