package com.structural.decorator.couponcode;

public class Demo {


  public static void main(String [] args){

    ShoppingCart shoppingCart = new ShoppingCart();

    Product product1 = new RinDetergent("RIN",100, ProductType.FMCG);
    Product product2 = new LipStick("LIPSTICK", 500, ProductType.COSMETIC);

    CouponDecorator couponDecorator1 = new PercentageCouponDecorator(10,new TypeCouponDecorator(product1));
    CouponDecorator couponDecorator2 = new TypeCouponDecorator(product2);


    shoppingCart.addProductToCart(couponDecorator1);
    shoppingCart.addProductToCart(couponDecorator2);

    System.out.println("Total price : " + shoppingCart.getTotalPrice());

  }
}
