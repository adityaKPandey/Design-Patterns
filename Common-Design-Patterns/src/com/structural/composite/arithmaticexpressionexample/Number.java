package com.structural.composite.arithmaticexpressionexample;

public class Number implements ArithmeticExpression{

  private double value;

  public Number(int value) {
    this.value = value;
  }

  @Override
  public double evaluate() {
    return value;
  }
}
