package com.structural.bridge.solution;

public class TreeBreatheImplementor implements BreatheImplementor{

  @Override
  public void breathe() {
    System.out.println("Breathe through leaves");
    System.out.println("Inhale carbon di-oxide from air");
    System.out.println("Exhale oxygen");
  }
}
