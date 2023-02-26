package com.solid.principles.openclosed.fix;

import com.solid.principles.openclosed.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{

  @Override
  public void save(Invoice invoice) {
    // save to db
  }
}
