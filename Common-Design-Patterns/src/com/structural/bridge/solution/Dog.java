package com.structural.bridge.solution;

public class Dog extends LivingThings{

  public Dog(BreatheImplementor breatheImplementor){
    super(breatheImplementor);
  }

  @Override
  public void breathe() {
    breatheImplementor.breathe();
  }
}
