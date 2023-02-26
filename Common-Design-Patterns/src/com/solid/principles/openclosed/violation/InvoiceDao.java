package com.solid.principles.openclosed.violation;

/*
  When new requirement came to us to save to file also in addition to db ,  we added a new method in this class to save to file.
  This violates Open-Closed principle which says a class should be closed for modification and open for extension.
*/

import com.solid.principles.openclosed.Invoice;

public class InvoiceDao {

  private Invoice invoice;

  public InvoiceDao(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToDB() {
    // save the invoice in db
  }

  public void saveToFile() {
    // save the invoice to a file
  }
}
