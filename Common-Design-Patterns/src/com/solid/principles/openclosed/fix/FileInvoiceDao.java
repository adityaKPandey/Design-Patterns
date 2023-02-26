package com.solid.principles.openclosed.fix;

import com.solid.principles.openclosed.Invoice;

public class FileInvoiceDao implements InvoiceDao{

  @Override
  public void save(Invoice invoice) {
    // save to file
  }
}
