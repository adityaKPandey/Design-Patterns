package com.structural.composite.arithmaticexpressionexample;

public class Demo {

  public static void main(String [] args){
     ArithmeticExpression leftExpression = new Number(2);

     ArithmeticExpression rightExpression = new Expression(new Number(1) , new Number(7) , Operator.ADD);

     ArithmeticExpression finalExpression = new Expression(leftExpression, rightExpression, Operator.MULTIPLY);

     System.out.println(finalExpression.evaluate());

  }
}
