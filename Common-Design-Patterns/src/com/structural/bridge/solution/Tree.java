package com.structural.bridge.solution;

public class Tree extends LivingThings{

  public Tree(BreatheImplementor breatheImplementor){
    super(breatheImplementor);
  }

  @Override
  public void breathe() {
    breatheImplementor.breathe();
  }
}
