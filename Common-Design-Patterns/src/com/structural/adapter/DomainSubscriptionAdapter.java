package com.structural.adapter;

public class DomainSubscriptionAdapter implements Document{

  private NewDomainSubscriptionDocument newDomainSubscriptionDocument;

  public DomainSubscriptionAdapter(
      NewDomainSubscriptionDocument newDomainSubscriptionDocument) {
    this.newDomainSubscriptionDocument = newDomainSubscriptionDocument;
  }

  @Override
  public String getId() {
    return newDomainSubscriptionDocument.getId();
  }

  @Override
  public String getName() {
    return newDomainSubscriptionDocument.getName();
  }

  @Override
  public Long getRevision() {
    return newDomainSubscriptionDocument.getRevision();
  }

  @Override
  public String toString() {
    return "DomainSubscriptionAdapter{" +
        "newDomainSubscriptionDocument=" + newDomainSubscriptionDocument +
        '}';
  }
}
