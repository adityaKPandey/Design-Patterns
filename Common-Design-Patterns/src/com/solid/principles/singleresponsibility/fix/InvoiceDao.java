package com.solid.principles.singleresponsibility.fix;

public class InvoiceDao {

  private Invoice invoice;

  public InvoiceDao(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToDB() {
    // save the invoice in db
  }
}
