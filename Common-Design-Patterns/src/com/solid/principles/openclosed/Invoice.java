package com.solid.principles.openclosed;

import com.solid.principles.singleresponsibility.Marker;

/*
   This invoice class only calculates price - so has only 1 reason to change.
   For remaining functionalities , we have added new classed - to print and to save  
 */
public class Invoice {

  private Marker marker;
  private int quantity;

  public Invoice(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public int calculateTotalCost(){
    return marker.getPrice()*quantity;
  }
}
