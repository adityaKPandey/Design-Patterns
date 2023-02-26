package com.solid.principles.liskovsubstitution.violation;

public class MotorBike implements Bike{

  private boolean isEngineOn;
  private int speed;

  @Override
  public void turnOnEngine() {
     isEngineOn = true;
  }

  @Override
  public void accelerate() {
      speed += 10;
  }
}
