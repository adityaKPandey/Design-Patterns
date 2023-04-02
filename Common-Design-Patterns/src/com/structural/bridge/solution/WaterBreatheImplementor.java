package com.structural.bridge.solution;

public class WaterBreatheImplementor implements BreatheImplementor{

  @Override
  public void breathe() {
    System.out.println("Breathe through gills");
    System.out.println("Absorb Oxygen from water");
    System.out.println("Release carbon di-oxide");
  }
}
