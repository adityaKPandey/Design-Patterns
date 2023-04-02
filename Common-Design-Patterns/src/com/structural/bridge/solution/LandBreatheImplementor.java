package com.structural.bridge.solution;

public class LandBreatheImplementor implements BreatheImplementor{

  @Override
  public void breathe() {
    System.out.println("Breathe through nose");
    System.out.println("Inhale oxygen from air");
    System.out.println("Exhale carbon di-oxide");
  }
}
