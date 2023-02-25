package com.structural.adapter;

import java.util.ArrayList;
import java.util.List;

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
