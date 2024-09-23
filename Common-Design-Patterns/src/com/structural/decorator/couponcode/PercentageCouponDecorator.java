package com.structural.decorator.couponcode;

public class PercentageCouponDecorator extends CouponDecorator{

  private int discountPercentage;
  private Product product;

  public PercentageCouponDecorator(int discountPercentage, Product product){
    super(product.getName(), product.calculatePrice(), product.getProductType());
    this.product = product;
    this.discountPercentage = discountPercentage;
  }

  @Override
  protected double calculatePrice() {
    double price = product.calculatePrice();
    return price - price*discountPercentage*0.01;
  }

}
