package com.structural.decorator.couponcode;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private List<Product> products = new ArrayList<>();

  public void addProductToCart(Product product){
    System.out.println("Adding product " + product.getName() + " to cart ");
    products.add(product);
  }

  public double getTotalPrice(){
    return products.stream().map(Product::calculatePrice).reduce(0.0d , (a,b) -> a+b);
  }

}
