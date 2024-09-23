package com.structural.decorator.couponcode;

import java.util.HashMap;
import java.util.Map;

public class TypeCouponDecorator extends CouponDecorator{

  private static Map<ProductType,Double> productWiseDiscount;
  private Product product;

  static {
    productWiseDiscount = new HashMap<>();
    productWiseDiscount.put(ProductType.COSMETIC, 30.0);
    productWiseDiscount.put(ProductType.FMCG, 10.0);
    productWiseDiscount.put(ProductType.GROCERY, 5.0);
    productWiseDiscount.put(ProductType.MEDICINE, 7.0);
  }

  public TypeCouponDecorator(Product product){
    super(product.getName(), product.calculatePrice(), product.getProductType());
    this.product = product;
  }

  @Override
  protected double calculatePrice() {
    double discountPercentage = productWiseDiscount.get(product.getProductType());
    double price = product.calculatePrice();
    return price - price*discountPercentage*0.01;
  }

}
