package com.solid.principles.singleresponsibility.violation;

import com.solid.principles.singleresponsibility.Marker;

/*
   This class has multiple reasons to change . for eg.
   1. if we have to add GST to price , then calculateTotalCost method will change
   2. if we have to change printing logic , then also this class will have to change -> change in printInvoice method.
   3. if we have to save to file also in addition to db , then also this class will have to change.
 */
public class Invoice {

  private Marker marker;
  private int quantity;

  public Invoice(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public int calculateTotalCost() {
    return marker.getPrice() * quantity;
  }

  public void printInvoice() {
    // prints the invoice in a format
  }

  public void saveToDB() {
    // save the invoice in db
  }
}
