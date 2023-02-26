package com.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/*
   -Legacy/Old class DomainProductBundleDocument implements Document interface .
   -New NewDomainSubscriptionDocument class doesn't implement old interface , has few extra fields(like subscription id)
    and has few common fields with old class DomainProductBundleDocument.
   -To put new class' objects in collection of old class' objects , we create an Adapter class that implements old Document
    interface,but it takes the new class' object as input parameter.


 */
public class AdapterDemo {

    public static void main(String [] args){

      List<Document> documentList = new ArrayList<>();

      DomainProductBundleDocument domainProductBundleDocument = new DomainProductBundleDocument("1","TEST-DOMAIN_PRODUCT1",1L,"TEST-SUBSCRIPTION-1");
      documentList.add(domainProductBundleDocument);

      NewDomainSubscriptionDocument newDomainSubscriptionDocument = new NewDomainSubscriptionDocument("1","TEST-DOMAIN_PRODUCT1",1L,"TEST-BUNDLE");
      // documentList.add(newDomainSubscriptionDocument);

      documentList.add(new DomainSubscriptionAdapter(newDomainSubscriptionDocument));


      System.out.println(documentList);
    }
}
