package com.structural.decorator.couponcode;

public class RinDetergent extends Product{


  public RinDetergent(String name, double price, ProductType productType){
    super(name, price, productType);
  }

  @Override
  protected double calculatePrice() {
    return price;
  }
}
