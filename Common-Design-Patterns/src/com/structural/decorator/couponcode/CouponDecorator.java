package com.structural.decorator.couponcode;

public abstract class CouponDecorator extends Product{


  public CouponDecorator(String name, double price,
      ProductType productType) {
    super(name, price, productType);
  }
}
