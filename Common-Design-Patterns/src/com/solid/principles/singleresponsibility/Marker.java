package com.solid.principles.singleresponsibility;

public class Marker {

  private String name;
  private String color;
  private int year;
  private int price;

  public Marker(String name, String color, int year, int price) {
    this.name = name;
    this.color = color;
    this.year = year;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Marker setName(String name) {
    this.name = name;
    return this;
  }

  public String getColor() {
    return color;
  }

  public Marker setColor(String color) {
    this.color = color;
    return this;
  }

  public int getYear() {
    return year;
  }

  public Marker setYear(int year) {
    this.year = year;
    return this;
  }

  public int getPrice() {
    return price;
  }

  public Marker setPrice(int price) {
    this.price = price;
    return this;
  }
}
