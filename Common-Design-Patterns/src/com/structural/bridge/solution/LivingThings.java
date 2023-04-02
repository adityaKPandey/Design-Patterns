package com.structural.bridge.solution;


public abstract class LivingThings {

   BreatheImplementor breatheImplementor;

   public LivingThings(BreatheImplementor breatheImplementor) {
      this.breatheImplementor = breatheImplementor;
   }

   abstract public void breathe();
}
