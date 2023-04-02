package com.structural.bridge.problemwithoutbridgepattern;

public class Dog extends LivingThings{

  @Override
  public void breathe() {
    System.out.println("Breathe through nose");
    System.out.println("Inhale oxygen from air");
    System.out.println("Exhale carbon di-oxide");
  }

}
