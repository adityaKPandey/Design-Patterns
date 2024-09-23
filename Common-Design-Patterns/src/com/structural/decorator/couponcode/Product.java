package com.structural.decorator.couponcode;

public abstract class Product {
  private String name;
  protected double price;
  private ProductType productType;

  public Product(String name, double price, ProductType productType){
    this.name = name;
    this.price = price;
    this.productType = productType;
  }

  protected abstract double calculatePrice();

  protected ProductType getProductType(){
    return productType;
  }

  protected String getName(){
    return name;
  }
}
