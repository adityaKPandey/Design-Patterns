package com.solid.principles.openclosed.fix;

/*
  When new requirement came to us to save to file also in addition to db ,  we added a new method in this class to save to file.
  This violates Open-Closed principle which says a class should be closed for modification and open for extension.

  To fix this , we define an interface to save invoice and provide its separate implementations to save invoice in db and in file.
  If tomorrow we get a requirement to save invoive to a sql db and to a non sql db like mongoDB , we will create separate
  implementations of this interface method to accomplish it eg. SQLDBInvoiceDao and MongoDBInvoiceDao . This will need no change
  in existing classes.
*/

import com.solid.principles.openclosed.Invoice;

public interface InvoiceDao {

  void save(Invoice invoice);
}
