package com.solid.principles.interfacesegregation.fix;

public class Chef implements ChefInterface{

  @Override
  public void cookFood() {
    System.out.println("cooking food");
  }
}
