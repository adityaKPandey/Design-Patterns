package com.solid.principles.liskovsubstitution.violation;

public class Bicycle implements Bike{

  private int speed;
  @Override
  public void turnOnEngine() {
    throw new AssertionError("Bicycle doesn't have engine");
  }

  @Override
  public void accelerate() {
    speed += 10;
  }
}
