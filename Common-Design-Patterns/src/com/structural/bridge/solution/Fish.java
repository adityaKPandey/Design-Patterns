package com.structural.bridge.solution;


public class Fish extends LivingThings {

  public Fish(BreatheImplementor breatheImplementor) {
    super(breatheImplementor);
  }

  @Override
  public void breathe() {
     breatheImplementor.breathe();
  }
}
