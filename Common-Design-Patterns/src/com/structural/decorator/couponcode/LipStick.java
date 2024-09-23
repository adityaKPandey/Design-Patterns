package com.structural.decorator.couponcode;

public class LipStick extends Product{

  public LipStick(String name, double price, ProductType productType) {
    super(name, price ,productType);
  }

  @Override
  protected double calculatePrice() {
    return price;
  }
}
