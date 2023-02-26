package com.solid.principles.singleresponsibility.fix;

public class InvoicePrinter {

  private Invoice invoice;

  public InvoicePrinter(Invoice invoice) {
    this.invoice = invoice;
  }

  public void printInvoice() {
    // prints the invoice in a format
  }
}
